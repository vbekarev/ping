package ru.vbekarev.ping.model;

import java.io.Serializable;

public class PingDto implements Serializable {
    private String message;

    public PingDto() {
    }

    public PingDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
