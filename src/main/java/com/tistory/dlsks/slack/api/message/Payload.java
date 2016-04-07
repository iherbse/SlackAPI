package com.tistory.dlsks.slack.api.message;

import com.tistory.dlsks.slack.api.validation.SlackValidator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Inhwan on 16. 4. 7..
 * Email : iherbse@gmail.com
 */
public class Payload {

    private String channel;
    private String text;
    private String username;
    private String icon_url;
    private String icon_emoji;
    private List<Attachment> attachments;

    private Boolean unfurl_links;
    private Boolean unfurl_media;
    private Boolean mrkdwn;

    public static class PayloadBuilder{
        private String username;
        private String text;
        private String icon_url;
        private String icon_emoji;
        private String channel;
        private List<Attachment> attachments;

        private Boolean unfurl_links;
        private Boolean unfurl_media;
        private Boolean mrkdwn;

        public PayloadBuilder(String channel, String text){
            SlackValidator.validChannelName(channel);
            this.channel = channel;
            this.text = text;
        }

        public PayloadBuilder setIcon_url(String icon_url) {
            SlackValidator.validUrl(icon_url);
            this.icon_url = icon_url;
            return this;
        }

        public PayloadBuilder setIcon_emoji(String icon_emoji) {
            SlackValidator.validEmoji(icon_emoji);
            this.icon_emoji = icon_emoji;
            return this;
        }

        public PayloadBuilder addAttachment(Attachment attachment) {
            if(this.attachments == null){
                this.attachments = new ArrayList<Attachment>();
            }
            this.attachments.add(attachment);
            return this;
        }

        public PayloadBuilder setAttachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        public PayloadBuilder setUnfurl_links(Boolean unfurl_links) {
            this.unfurl_links = unfurl_links;
            return this;
        }

        public PayloadBuilder setUnfurl_media(Boolean unfurl_media) {
            this.unfurl_media = unfurl_media;
            return this;
        }

        public PayloadBuilder setMrkdwn(Boolean mrkdwn) {
            this.mrkdwn = mrkdwn;
            return this;
        }

        public PayloadBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Payload build(){
            return new Payload(this);
        }
    }

    private Payload(PayloadBuilder builder){
        this.username = builder.username;
        this.text = builder.text;
        this.icon_url = builder.icon_url;
        this.icon_emoji = builder.icon_emoji;
        this.channel = builder.channel;
        this.attachments = builder.attachments;
        this.unfurl_links = builder.unfurl_links;
        this.unfurl_media = builder.unfurl_media;
        this.mrkdwn = builder.mrkdwn;
    }

    public String getUsername() {
        return username;
    }
    public String getText() {
        return text;
    }
    public String getIcon_url() {
        return icon_url;
    }
    public String getIcon_emoji() {
        return icon_emoji;
    }
    public String getChannel() {
        return channel;
    }
    public List<Attachment> getAttachments() {
        return attachments;
    }
    public Boolean getUnfurl_links() {
        return unfurl_links;
    }
    public Boolean getUnfurl_media() {
        return unfurl_media;
    }
    public Boolean getMrkdwn() {
        return mrkdwn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payload payload = (Payload) o;

        if (username != null ? !username.equals(payload.username) : payload.username != null) return false;
        if (text != null ? !text.equals(payload.text) : payload.text != null) return false;
        if (icon_url != null ? !icon_url.equals(payload.icon_url) : payload.icon_url != null) return false;
        if (icon_emoji != null ? !icon_emoji.equals(payload.icon_emoji) : payload.icon_emoji != null) return false;
        if (channel != null ? !channel.equals(payload.channel) : payload.channel != null) return false;
        if (attachments != null ? !attachments.equals(payload.attachments) : payload.attachments != null) return false;
        if (unfurl_links != null ? !unfurl_links.equals(payload.unfurl_links) : payload.unfurl_links != null)
            return false;
        if (unfurl_media != null ? !unfurl_media.equals(payload.unfurl_media) : payload.unfurl_media != null)
            return false;
        return !(mrkdwn != null ? !mrkdwn.equals(payload.mrkdwn) : payload.mrkdwn != null);
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (icon_url != null ? icon_url.hashCode() : 0);
        result = 31 * result + (icon_emoji != null ? icon_emoji.hashCode() : 0);
        result = 31 * result + (channel != null ? channel.hashCode() : 0);
        result = 31 * result + (attachments != null ? attachments.hashCode() : 0);
        result = 31 * result + (unfurl_links != null ? unfurl_links.hashCode() : 0);
        result = 31 * result + (unfurl_media != null ? unfurl_media.hashCode() : 0);
        result = 31 * result + (mrkdwn != null ? mrkdwn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Payload{" +
                "username='" + username + '\'' +
                ", text='" + text + '\'' +
                ", icon_url='" + icon_url + '\'' +
                ", icon_emoji='" + icon_emoji + '\'' +
                ", channel='" + channel + '\'' +
                ", attachments=" + attachments +
                ", unfurl_links=" + unfurl_links +
                ", unfurl_media=" + unfurl_media +
                ", mrkdwn=" + mrkdwn +
                '}';
    }
}