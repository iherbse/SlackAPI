package com.iherbse.slack.api.message;

/**
 * Created by Inhwan on 16. 4. 7..
 * Email : iherbse@gmail.com
 */
public class Field {

    private String title;
    private String value;
    private String _short;

    public Field(){
    }

    public Field(String title, String value){
        this.title = title;
        this.value = value;
    }

    public Field(String title, String value, String _short){
        this.title = title;
        this.value = value;
        this._short = _short;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String get_short() {
        return _short;
    }

    public void set_short(String _short) {
        this._short = _short;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Field field = (Field) o;

        if (title != null ? !title.equals(field.title) : field.title != null) return false;
        if (value != null ? !value.equals(field.value) : field.value != null) return false;
        return !(_short != null ? !_short.equals(field._short) : field._short != null);

    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (_short != null ? _short.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Field{" +
                "title='" + title + '\'' +
                ", value='" + value + '\'' +
                ", _short='" + _short + '\'' +
                '}';
    }
}