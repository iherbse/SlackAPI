package com.iherbse.slack.api.message;

import com.iherbse.slack.api.validation.SlackValidator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Inhwan on 16. 4. 7..
 * Email : iherbse@gmail.com
 */
public class Attachment {

    private String fallback;
    private String color;
    private String pretext;
    private String author_name;
    private String author_link;
    private String author_icon;
    private String title;
    private String title_link;
    private String text;
    private List<Field> fields;
    private String image_url;
    private String thumb_url;
    private List<String> mrkdwn_in;

    public String getFallback() {
        return fallback;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        SlackValidator.validColor(color);
        this.color = color;
    }

    public String getPretext() {
        return pretext;
    }

    public void setPretext(String pretext) {
        this.pretext = pretext;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_link() {
        return author_link;
    }

    public void setAuthor_link(String author_link) {
        this.author_link = author_link;
    }

    public String getAuthor_icon() {
        return author_icon;
    }

    public void setAuthor_icon(String author_icon) {
        this.author_icon = author_icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_link() {
        return title_link;
    }

    public void setTitle_link(String title_link) {
        this.title_link = title_link;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addField(Field field){
        this.getFields().add(field);
    }

    public List<Field> getFields() {
        if(this.fields == null){
            this.fields = new ArrayList<Field>();
        }
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        SlackValidator.validUrl(image_url);
        this.image_url = image_url;
    }

    public String getThumb_url() {
        return thumb_url;
    }

    public void setThumb_url(String thumb_url) {
        SlackValidator.validUrl(thumb_url);
        this.thumb_url = thumb_url;
    }

    public void addMrkdwn_in(String field) {
        this.getMrkdwn_in().add(field);
    }

    public List<String> getMrkdwn_in() {
        return mrkdwn_in;
    }

    public void setMrkdwn_in(List<String> mrkdwn_in) {
        this.mrkdwn_in = mrkdwn_in;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Attachment that = (Attachment) o;

        if (fallback != null ? !fallback.equals(that.fallback) : that.fallback != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (pretext != null ? !pretext.equals(that.pretext) : that.pretext != null) return false;
        if (author_name != null ? !author_name.equals(that.author_name) : that.author_name != null) return false;
        if (author_link != null ? !author_link.equals(that.author_link) : that.author_link != null) return false;
        if (author_icon != null ? !author_icon.equals(that.author_icon) : that.author_icon != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (title_link != null ? !title_link.equals(that.title_link) : that.title_link != null) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (fields != null ? !fields.equals(that.fields) : that.fields != null) return false;
        if (image_url != null ? !image_url.equals(that.image_url) : that.image_url != null) return false;
        if (thumb_url != null ? !thumb_url.equals(that.thumb_url) : that.thumb_url != null) return false;
        return !(mrkdwn_in != null ? !mrkdwn_in.equals(that.mrkdwn_in) : that.mrkdwn_in != null);

    }

    @Override
    public int hashCode() {
        int result = fallback != null ? fallback.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (pretext != null ? pretext.hashCode() : 0);
        result = 31 * result + (author_name != null ? author_name.hashCode() : 0);
        result = 31 * result + (author_link != null ? author_link.hashCode() : 0);
        result = 31 * result + (author_icon != null ? author_icon.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (title_link != null ? title_link.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (fields != null ? fields.hashCode() : 0);
        result = 31 * result + (image_url != null ? image_url.hashCode() : 0);
        result = 31 * result + (thumb_url != null ? thumb_url.hashCode() : 0);
        result = 31 * result + (mrkdwn_in != null ? mrkdwn_in.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "fallback='" + fallback + '\'' +
                ", color='" + color + '\'' +
                ", pretext='" + pretext + '\'' +
                ", author_name='" + author_name + '\'' +
                ", author_link='" + author_link + '\'' +
                ", author_icon='" + author_icon + '\'' +
                ", title='" + title + '\'' +
                ", title_link='" + title_link + '\'' +
                ", text='" + text + '\'' +
                ", fields=" + fields +
                ", image_url='" + image_url + '\'' +
                ", thumb_url='" + thumb_url + '\'' +
                ", mrkdwn_in=" + mrkdwn_in +
                '}';
    }
}