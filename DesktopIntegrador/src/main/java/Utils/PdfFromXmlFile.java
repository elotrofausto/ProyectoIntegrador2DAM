package Utils;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;

/**
 * http://149.202.8.235:8080/jasperserver/rest_v2/reports/reports/grup2/InformeMedicamentoList.html?user=4&j_username=grup2&j_password=Grupo-312
 *
 * @author vesprada
 */
public class PdfFromXmlFile {

    static final boolean SHOW_SPEC_MODE = false;

    // SERVER PARAMETERS
    static final String SCHEME = "http";
    static final String HOST = "149.202.8.235";
    static final int PORT = 8080;
    static final String SERVER_HANDLE = "/jasperserver";

    //Server paths
    static final String BASE_REST_URL = SERVER_HANDLE + "/rest_v2";

    // login parameters
    static final String PARAMETER_USERNAME = "j_username";
    static final String PARAM_PASSWORD = "j_password";

    static final String USER_NAME = "grup2";
    static final String PASSWORD = "Grupo-312";

    // SERVER ENTITIES
    static final String RESOURCES_PATH = "/reports/reports/grup2/";
    static final String FOLDER_RD = "InformeMedicamentoList.pdf";
    static final String LOG4J_PATH = "log4j.properties";
    private HttpClient httpClient;
    private CookieStore cookieStore;
    private HttpContext httpContext;
    private HttpRequestBase httpReqCE;
    private HttpResponse httpRes;
    private final Log log = LogFactory.getLog(getClass());

    public PdfFromXmlFile() {
        login();
    }

    private void login() {
        List<NameValuePair> ce_qparams = new ArrayList<NameValuePair>();
        ce_qparams.add(new BasicNameValuePair(PARAMETER_USERNAME, USER_NAME));
        ce_qparams.add(new BasicNameValuePair(PARAM_PASSWORD, PASSWORD));

        try {
            httpReqCE = new HttpPost();
            httpRes = sendRequest(httpReqCE, SERVICE_LOGIN, ce_qparams);

            //consuming the content to close the stream
            IOUtils.toString(httpRes.getEntity().getContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private HttpResponse sendRequest(HttpRequestBase req, String service, List<NameValuePair> qparams) throws Exception {
        URI uri = createURI(BASE_REST_URL + service, qparams);
        req.setURI(uri);
        log.info("sending Request. url: " + uri.toString() + " req verb: " + req.getMethod());
        httpRes = httpClient.execute(req, httpContext);
        log.info("response status line: " + httpRes.getStatusLine());
        return httpRes;
    }

    private URI createURI(String path, List<NameValuePair> qparams) throws Exception {
        URIBuilder ub = new URIBuilder();
        URI uri;
        if (qparams != null) {
            uri = URIUtils.createURI(SCHEME, HOST, PORT, path, URLEncodedUtils.format(qparams, "UTF-8"), null);
        } else {
            uri = (new URL(SCHEME, HOST, PORT, path)).toURI();
        }
        return uri;
    }

    public void obtainPdf() {
        try {
            // Compile jrxml file.
            JasperReport jasperReport = JasperCompileManager
                    .compileReport("C:/jasperreport/StyledTextReport/StyledTextReport.jrxml");

            // Parameters for report
            Map<String, Object> parameters = new HashMap<String, Object>();

            // DataSource
            // This is simple example, no database.
            // then using empty datasource.
            JRDataSource dataSource = new JREmptyDataSource();

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
                    parameters, dataSource);

            // Make sure the output directory exists.
            File outDir = new File("../jasperoutput");
            outDir.mkdirs();

            // Export to PDF.
            JasperExportManager.exportReportToPdfFile(jasperPrint, "StyledTextReport.pdf");

            System.out.println("Done!");
        } catch (JRException ex) {
            Logger.getLogger(PdfFromXmlFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void otherObtainPdf() {
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle", "user", "password");

            java.sql.Date sqlDate = new java.sql.Date((new SimpleDateFormat("MM/dd/yyyy").parse("07/01/2018")).getTime());

            Map parameters = new HashMap();
            Map<String, String> temp = new HashMap<String, String>();
            parameters.put("paramName", sqlDate);
            String workingDir = System.getProperty("user.dir");
            String file = workingDir + "\\src\\resources\\main_jrxml.jasper";
            System.out.println("Current working directory : " + file);

            JasperReport report = (JasperReport) JRLoader.loadObjectFromFile(file);
            JasperPrint jasperPrint = JasperFillManager.fillReport(report, parameters, con);

            JFrame frame = new JFrame("Report");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new JRViewer(jasperPrint));
            frame.pack();
            frame.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PdfFromXmlFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(PdfFromXmlFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(PdfFromXmlFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.text.ParseException ex) {
            Logger.getLogger(PdfFromXmlFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
