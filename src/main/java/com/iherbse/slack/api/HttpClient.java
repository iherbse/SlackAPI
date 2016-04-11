package com.iherbse.slack.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/**
 * Created by Inhwan on 16. 4. 6..
 * Email : iherbse@gmail.com
 */
public class HttpClient {

    private HttpURLConnection httpURLConnection;
    private URL url;

    public String sendPost(String urlPath, String params) {
        try {
            this.url = new URL(urlPath);
            this.httpURLConnection = (HttpURLConnection) this.url.openConnection();

            byte[] postDataBytes = params.getBytes();

            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.getOutputStream().write(postDataBytes);

            BufferedReader br = new BufferedReader(new InputStreamReader((httpURLConnection.getInputStream())));
            StringBuilder builder = new StringBuilder();

            while (br.ready() == true) {
                builder.append(br.readLine().trim());
            }
            String result = builder.toString();

            this.httpURLConnection.disconnect();

            return result;
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getQueryString(Map<String, Object> params) {
        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String, Object> param : params.entrySet()) {
            if (postData.length() != 0) postData.append('&');
            try {
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return postData.toString();
    }
}
