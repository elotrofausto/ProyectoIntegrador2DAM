package Utils;

import com.jaspersoft.jasperserver.jaxrs.client.apiadapters.reporting.ReportOutputFormat;
import com.jaspersoft.jasperserver.jaxrs.client.core.JasperserverRestClient;
import com.jaspersoft.jasperserver.jaxrs.client.core.RestClientConfiguration;
import com.jaspersoft.jasperserver.jaxrs.client.core.Session;
import com.jaspersoft.jasperserver.jaxrs.client.core.enums.AuthenticationType;
import com.jaspersoft.jasperserver.jaxrs.client.core.enums.JRSVersion;
import com.jaspersoft.jasperserver.jaxrs.client.core.enums.MimeType;
import com.jaspersoft.jasperserver.jaxrs.client.core.operationresult.OperationResult;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author Yop
 */
public class JasperClient {

    RestClientConfiguration configuration;

    public JasperClient() throws IOException {
        configuration = new RestClientConfiguration("http://localhost:8080/jasperserver");
        configuration.setAcceptMimeType(MimeType.JSON).setContentMimeType(MimeType.JSON).setJrsVersion(JRSVersion.v6_0_0).setLogHttp(true);
        configuration.setAuthenticationType(AuthenticationType.SPRING);
        configuration.setLogHttp(Boolean.TRUE);
        configuration.setLogHttpEntity(Boolean.TRUE);
        JasperserverRestClient client = new JasperserverRestClient(configuration);
        Session session = client.authenticate("grup2", "Grupo-312");
        OperationResult<InputStream> result = client
                .authenticate("grup2", "Grupo-312")
                .reportingService()
                .report("/reports/grup2/InformeMedicamentoList")
                .prepareForRun(ReportOutputFormat.PDF, 0)
                .run();
        InputStream report = result.getEntity();
        StringWriter writer = new StringWriter();
        IOUtils.copy(report, writer, "UTF-8");
        String theString = writer.toString();
        System.out.println(theString);
    }

}
