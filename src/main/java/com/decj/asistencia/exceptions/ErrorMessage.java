package com.decj.asistencia.exceptions;

import java.time.Instant;

import lombok.Data;

@Data
public class ErrorMessage {
    
    private Instant timestamp;
    private int status;
    private String error;    
    private String message;   
    private String path;
    
    public ErrorMessage(Exception e, String path, int status) {
        this.error = e.getClass().getSimpleName();
        this.message = e.getMessage();
        this.path = path;
        this.status = status;
        this.timestamp = Instant.now();
    }
}
