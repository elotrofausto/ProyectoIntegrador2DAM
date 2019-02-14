package Utils;

import com.jaspersoft.jasperserver.jaxrs.client.apiadapters.reporting.ReportOutputFormat;
import com.jaspersoft.jasperserver.jaxrs.client.core.JasperserverRestClient;
import com.jaspersoft.jasperserver.jaxrs.client.core.RestClientConfiguration;
import com.jaspersoft.jasperserver.jaxrs.client.core.enums.AuthenticationType;
import com.jaspersoft.jasperserver.jaxrs.client.core.enums.JRSVersion;
import com.jaspersoft.jasperserver.jaxrs.client.core.enums.MimeType;
import com.jaspersoft.jasperserver.jaxrs.client.core.operationresult.OperationResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.io.IOUtils;

/**
 *
 * https://github.com/Jaspersoft/jrs-rest-java-client#report-services
 *
 * @author Yop
 */
public class JasperClient {

    private final String USER = "grup2";
    private final String PASS = "Grupo-312";
    private final String INFO = "/reports/grup2/AnalisisGestion";
    private final String FILE = "Informe.pdf";
    private RestClientConfiguration configuration;
    private JasperserverRestClient client;

    public JasperClient() throws IOException, JRException {
        initUI();
        exportPdf();
        insertReport();

    }

    private void initUI() {
        configuration = new RestClientConfiguration("http://149.202.8.235:8080/jasperserver");
        configuration.setAcceptMimeType(MimeType.JSON).setContentMimeType(MimeType.JSON).setJrsVersion(JRSVersion.v6_0_0).setLogHttp(true);
        configuration.setAuthenticationType(AuthenticationType.SPRING);
        client = new JasperserverRestClient(configuration);
    }

    public void exportPdf() throws IOException {
        OperationResult<InputStream> result = client
                .authenticate(USER, PASS)
                .reportingService()
                .report(INFO)
                .prepareForRun(ReportOutputFormat.PDF, 0)
                .run();
        InputStream report = result.getEntity();
        byte[] array = IOUtils.toByteArray(report);
        File pdfFile = new File(FILE);
        try (OutputStream fos = new FileOutputStream(pdfFile)) {
            fos.write(array);
        }
    }

    public JRViewer insertReport() throws IOException, JRException {
        Map parameters = null;

        OperationResult<InputStream> result = client
                .authenticate(USER, PASS)
                .reportingService()
                .report(INFO)
                .prepareForRun(ReportOutputFormat.JRPRINT, 0)
                .run();
        InputStream repo = result.getEntity();
        JasperReport report = JasperCompileManager.compileReport(repo);
        JasperPrint jasper = JasperFillManager.fillReport(report, null);
        return new JRViewer(jasper);
    }

}
