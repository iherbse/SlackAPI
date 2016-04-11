package com.iherbse.slack.api;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Inhwan on 16. 4. 7..
 * Email : iherbse@gmail.com
 */
public class HttpClientTest {

    private HttpClient httpClient;
    private String urlPath = "https://slack.com/api/channels.list";
    private String token = "{token}";
    private String result;

    @Before
    public void connect(){
        this.httpClient = new HttpClient();
    }

    @After
    public void disconnect(){
        System.out.println(result);
    }

    @Test
    public void sendPostTest(){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("token", this.token);

        String queryString = this.httpClient.getQueryString(params);
        this.result = this.httpClient.sendPost(urlPath, queryString);

        System.out.println(result);
    }

    @Test
    public void getQueryString(){
        Map<String, Object> params = new HashMap<String,Object>();
        params.put("token", "test");
        params.put("channel", "test");
        params.put("text", "test");
        this.result = this.httpClient.getQueryString(params);
    }
}