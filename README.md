# SlackAPI
자바로 구현한 Slack API wrapper 입니다.
현재 webhook을 통한 메시지 전송 기능이 구현되어 있습니다.

## Examples

```java

// 메시지 작성
Attachment attachment = new Attachment();
attachment.setTitle("attachment title");
attachment.setColor("good");
attachment.setText("text");
attachment.addField(new Field("sub title 1", "text"));
attachment.addField(new Field("sub title 2", "text"));

Payload payload = new Payload("text");
payload.setUsername("octocat");
payload.setIcon_emoji(":octocat:");
payload.addAttachment(attachment);

// 전송
SlackWebhookClient slackWebhookClient = new SlackWebhookClient("{webhook URL}");
slackwebhookClient.sendMessage(payload);

## .....
