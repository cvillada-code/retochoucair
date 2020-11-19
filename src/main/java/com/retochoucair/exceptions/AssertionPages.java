package com.retochoucair.exceptions;

public class AssertionPages extends AssertionError {

    private static final long serialVersionUID = 1L;

    public static final String NOFOUNDELEMENT = "El elemento a verificar no es visible";

    public AssertionPages(String message, Throwable cause) {
        super(message, cause);
    }

    public AssertionPages(String message) {
        super(message);
    }
}
