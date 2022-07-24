package com.stub.mock.models;

import java.time.LocalDateTime;

public class Service {

    private final long id;
    private final  String text;
    private final LocalDateTime date;
    private final String verification;

    public Service(long id, String text, LocalDateTime date, String verification) {
        this.id = id;
        this.text = text;
        this.date = date;
        this.verification = verification;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getVerification() {
        return verification;
    }
}
