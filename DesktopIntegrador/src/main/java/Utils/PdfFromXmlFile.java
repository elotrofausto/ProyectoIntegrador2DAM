package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 *
 * @author vesprada
 */
public class PdfFromXmlFile {

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

    public PdfFromXmlFile(String DOC) throws MalformedURLException, IOException {
        this.DOC = DOC;
        SetUI();
    }

    private void SetUI() throws FileNotFoundException, MalformedURLException, IOException {
        OutputStream fos = null;
        int responseCode;
        File pdfFile = new File("Informe.pdf");
        fos = new FileOutputStream(pdfFile);
        urlForGetRequest = new URL(INIT + HOST + PORT + REPOSITORY + DOC + ESPANSE + "?" + USER + "&" + PASS);
        conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        responseCode = conection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            InputStream is = conection.getInputStream();
            while (is.available() > 0) {
                fos.write(is.read());
                fos.flush();
            }
        }
    }
}
