package ru.vbekarev.ping.model;

public class PingDto {
    private String message;

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
