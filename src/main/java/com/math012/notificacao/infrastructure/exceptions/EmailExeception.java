package com.math012.notificacao.infrastructure.exceptions;

public class EmailExeception extends RuntimeException {
    public EmailExeception(String message) {
        super(message);
    }

    public EmailExeception(String message, Throwable throwable) {
        super(message, throwable);
    }
}
