package ru.vbekarev.ping.model;

import java.io.Serializable;

public class PingDto implements Serializable {
    private String message;
    private String counter;

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

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }
}
