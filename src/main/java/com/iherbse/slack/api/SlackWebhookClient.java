package com.iherbse.slack.api;

import com.google.gson.Gson;
import com.iherbse.slack.api.message.Payload;

/**
 * Created by Inhwan on 16. 4. 7..
 * Email : iherbse@gmail.com
 */
public class SlackWebhookClient {

    private String webHookUrl;
    private HttpClient httpClient;
    private Gson gson;

    public SlackWebhookClient(String webHookUrl) {
        this.httpClient = new HttpClient();
        this.webHookUrl = webHookUrl;
        this.gson = new Gson();
    }

    public String getWebHookUrl() {
        return webHookUrl;
    }

    public void setWebHookUrl(String webHookUrl) {
        this.webHookUrl = webHookUrl;
    }

    public String sendMessage(Payload payload) {

        String jsonPayload = gson.toJson(payload);
        String result = this.httpClient.sendPost(this.webHookUrl, jsonPayload);

        return result;
    }
}