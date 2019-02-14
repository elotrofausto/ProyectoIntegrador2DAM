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

import java.util.Base64;
import org.apache.commons.io.IOUtils;

/**
 *
 * https://github.com/Jaspersoft/jrs-rest-java-client#report-services
 *
 * @author Yop
 */
public class JasperClient {

    RestClientConfiguration configuration;

    public JasperClient() throws IOException {
        configuration = new RestClientConfiguration("http://149.202.8.235:8080/jasperserver");
        configuration.setAcceptMimeType(MimeType.JSON).setContentMimeType(MimeType.JSON).setJrsVersion(JRSVersion.v6_0_0).setLogHttp(true);
        configuration.setAuthenticationType(AuthenticationType.SPRING);
        JasperserverRestClient client = new JasperserverRestClient(configuration);
        OperationResult<InputStream> result = client
                .authenticate("grup2", "Grupo-312")
                .reportingService()
                .report("/reports/grup2/AnalisisGestion")
                .prepareForRun(ReportOutputFormat.PDF, 0)
                .run();
        InputStream report = result.getEntity();
        byte[] array = IOUtils.toByteArray(report);
        File pdfFile = new File("Informe.pdf");
        OutputStream fos = new FileOutputStream(pdfFile);
        fos.write(array);
        fos.close();

    }

}
