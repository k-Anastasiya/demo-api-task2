import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;

public class HttpExample {
    public static void main(String[] args) throws IOException {

        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet= new HttpGet("https://www.onliner.by/");
        HttpResponse httpResponse = httpClient.execute(httpGet);
        String body = EntityUtils.toString(httpResponse.getEntity());
        System.out.println(body);
        HttpPost httpPost = new HttpPost("https://www.onliner.by/");
        httpPost.setHeader("qwe","qqew");
        httpClient.execute(httpPost);
         body = EntityUtils.toString(httpResponse.getEntity());
        System.out.println(body);




    }

}
