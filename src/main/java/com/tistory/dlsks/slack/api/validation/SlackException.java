package com.tistory.dlsks.slack.api.validation;

/**
 * Created by Inhwan on 16. 4. 7..
 * Email : iherbse@gmail.com
 */
public class SlackException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public SlackException() {
        super();
    }

    public SlackException(String message, Throwable cause) {
        super(message, cause);
    }

    public SlackException(String message) {
        super(message);
    }

    public SlackException(Throwable cause) {
        super(cause);
    }
}
