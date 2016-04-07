package com.tistory.dlsks.slack.api;

import com.tistory.dlsks.slack.api.message.Attachment;
import com.tistory.dlsks.slack.api.message.Field;
import com.tistory.dlsks.slack.api.message.Payload;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Inhwan on 16. 4. 7..
 * Email : iherbse@gmail.com
 */
public class SlackWebhookClientTest {
    private SlackWebhookClient slackWebhookClient;
    private String webhookUrl = "https://hooks.slack.com/services/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";
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

        Payload payload = new Payload.PayloadBuilder("#general", "꿀꿀").setUsername("돼지").setIcon_emoji(":piggy:").addAttachment(attachment).build();

        this.result = this.slackWebhookClient.sendMessage(payload);
    }
}
