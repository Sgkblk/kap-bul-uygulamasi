package com.mehmetnuri.kapbul.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

public class ApiError {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestampt;

    private HttpStatus status;
    private String message;
    private List<String> errors;

    public ApiError(LocalDateTime timestampt, HttpStatus status, String message, List<String> errors) {
        this.timestampt = timestampt;
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public LocalDateTime getTimestampt() {
        return timestampt;
    }

    public void setTimestampt(LocalDateTime timestampt) {
        this.timestampt = timestampt;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
