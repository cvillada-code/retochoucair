package com.retochoucair.exceptions;

public class AssertionAutentication extends AssertionError {

    private static final long serialVersionUID = 1L;

    public static final String NOFOUNDELEMENT = "El elemento a verificar no es visible";
    public static final String NOFOUNDMESSAGEERROR = "No se ve el mensaje de error esperado";

    public AssertionAutentication(String message, Throwable cause) {
        super(message, cause);
    }

    public AssertionAutentication(String message) {
        super(message);
    }
}
