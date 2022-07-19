import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class HttpExampleTest {
    @Test
     public void checksStatusCodeGetVerbTest(){
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://www.yandex.ru/");
        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);
           int expected = 200;
            int actual = httpResponse.getStatusLine().getStatusCode();
            Assert.assertEquals(expected,actual);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void checksStatusCodePostVerbTest(){
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("https://www.yandex.ru/");
        httpPost.setHeader("qwe","qqew");
        try {
            HttpResponse httpResponse = httpClient.execute(httpPost);
            int expected = 200;
            int actual = httpResponse.getStatusLine().getStatusCode();
            Assert.assertEquals(expected,actual);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}