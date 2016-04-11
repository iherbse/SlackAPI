package com.iherbse.slack.api;

import com.iherbse.slack.api.message.Attachment;
import com.iherbse.slack.api.message.Field;
import com.iherbse.slack.api.message.Payload;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Inhwan on 16. 4. 7..
 * Email : iherbse@gmail.com
 */
public class SlackWebhookClientTest {
    private SlackWebhookClient slackWebhookClient;
    private String webhookUrl = "{webhook URL}";
    private String result;

    @Before
    public void before(){
        this.slackWebhookClient = new SlackWebhookClient(webhookUrl);
    }

    @After
    public void after(){
        System.out.println("result::"+result);
    }

    @Test
    public void sendMessage(){

        Attachment attachment = new Attachment();
        attachment.setTitle("attachment title");
        attachment.setColor("good");
        attachment.setText("내용");
        attachment.addField(new Field("sub title 1", "내용"));
        attachment.addField(new Field("sub title 2", "내용"));

        Payload payload = new Payload("TEST");
        payload.setUsername("고양이");
        payload.setIcon_emoji(":octocat:");
        payload.addAttachment(attachment);

        this.result = this.slackWebhookClient.sendMessage(payload);
    }
}
