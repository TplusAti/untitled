package testMain;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.*;
import java.io.IOException;

public class AppTest {
  @Test public void testExample() throws IOException, MailosaurException {
    // Available in the API tab of a server
    String apiKey = "SmLjkXNeF4DfTqIk";
    String serverId = "nhbkr0mg";
    String serverDomain = "region-situation@nhbkr0mg.mailosaur.net";

    MailosaurClient mailosaur = new MailosaurClient(apiKey);

    MessageSearchParams params = new MessageSearchParams();
    params.withServer(serverId);

    SearchCriteria criteria = new SearchCriteria();
    criteria.withSentTo("anything@nhbkr0mg.mailosaur.net");
    criteria.withSubject("Hello World !!");
    criteria.withSentFrom("tplusati@gmail.com");

    Message message = mailosaur.messages().get(params, criteria);

    assertNotNull(message);
    assertEquals("Hello World !!", message.subject());
  }
}