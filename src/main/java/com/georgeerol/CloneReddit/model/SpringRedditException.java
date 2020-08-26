package com.georgeerol.CloneReddit.model;

/**
 * Created by George Fouche on 8/25/20.
 */
public class SpringRedditException extends RuntimeException {

    public SpringRedditException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SpringRedditException(String exMessage) {
        super(exMessage);
    }
}
