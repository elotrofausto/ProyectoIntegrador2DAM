package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * 
 *
 * @author vesprada
 */
public class PdfFromXmlFile {

    //http://149.202.8.235:8080/jasperserver/rest_v2/reports/reports/grup2/InformeMedicamentoList.html?user=4&j_username=grup2&j_password=Grupo-312
    private static final String INIT = "http:";
    private static final String HOST = "//149.202.8.235";
    private static final String PORT = ":8080";
    private static final String REPOSITORY = "/jasperserver/rest_v2/reports/reports/grup2/";
    private static final String ESPANSE = ".pdf";
    private static final String USER = "j_username=grup2";
    private static final String PASS = "j_password=Grupo-312";

    private String DOC;//nombre del informe que deseamos
    private URL urlForGetRequest;
    private HttpURLConnection conection;

    public PdfFromXmlFile(String DOC) {
        this.DOC = DOC;
        try {
            Setui();
        } catch (IOException ex) {
            Logger.getLogger(PdfFromXmlFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Setui() throws MalformedURLException, IOException {
        int responseCode;
        String readLine = null;
        BufferedReader br = null;
        StringBuffer sb = new StringBuffer();

            urlForGetRequest = new URL(INIT + HOST + PORT + REPOSITORY + DOC + ESPANSE + "?" + USER + "&" + PASS);
            conection = (HttpURLConnection) urlForGetRequest.openConnection();
            conection.setRequestMethod("GET");
            responseCode = conection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                br = new BufferedReader(new InputStreamReader(conection.getInputStream()));
                while ((readLine = br.readLine()) != null) {
                    sb.append(readLine);
                }
            } else {
                JOptionPane.showMessageDialog(null, "ERROR EN LA EXTRACCION");
            }
    }
}
