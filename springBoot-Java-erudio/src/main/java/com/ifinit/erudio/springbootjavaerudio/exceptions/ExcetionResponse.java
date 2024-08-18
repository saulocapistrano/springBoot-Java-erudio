package com.ifinit.erudio.springbootjavaerudio.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExcetionResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    private Date timestamp;
    private Double message;
    private Double details;

    public ExcetionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = Double.valueOf(message);
        this.details = Double.valueOf(details);
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public Double getMessage() {
        return message;
    }

    public Double getDetails() {
        return details;
    }
}
