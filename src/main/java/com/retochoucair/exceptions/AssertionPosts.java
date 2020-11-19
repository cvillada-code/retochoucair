package com.retochoucair.exceptions;

public class AssertionPosts extends AssertionError {

    private static final long serialVersionUID = 1L;

    public static final String NOFOUNDELEMENT = "El elemento a verificar no es visible";

    public AssertionPosts(String message, Throwable cause) {
        super(message, cause);
    }

    public AssertionPosts(String message) {
        super(message);
    }
}
