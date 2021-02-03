package com.example.demo.service.dto;

import  java.sql.Date;
public class WynajemDTO {
    private Date data;
    private long godzRozpoczecia;
    private Long deadline;
    private Long godzZakonczenia;
    private long idUzytkownika;
    private byte idSali;

    public WynajemDTO data(Date  data) {
        this.data = data;
        return this;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getData() {
        return this.data;
    }

    public WynajemDTO godzRozpoczecia(long godzRozpoczecia) {
        this.godzRozpoczecia = godzRozpoczecia;
        return this;
    }

    public void setGodzRozpoczecia(long godzRozpoczecia) {
        this.godzRozpoczecia = godzRozpoczecia;
    }

    public long getGodzRozpoczecia() {
        return this.godzRozpoczecia;
    }

    public WynajemDTO deadline(Long deadline) {
        this.deadline = deadline;
        return this;
    }

    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    public Long getDeadline() {
        return this.deadline;
    }

    public WynajemDTO godzZakonczenia(Long godzZakonczenia) {
        this.godzZakonczenia = godzZakonczenia;
        return this;
    }

    public void setGodzZakonczenia(Long godzZakonczenia) {
        this.godzZakonczenia = godzZakonczenia;
    }

    public Long getGodzZakonczenia() {
        return this.godzZakonczenia;
    }

    public WynajemDTO idUzytkownika(long idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
        return this;
    }

    public void setIdUzytkownika(long idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
    }

    public long getIdUzytkownika() {
        return this.idUzytkownika;
    }

    public WynajemDTO idSali(byte idSali) {
        this.idSali = idSali;
        return this;
    }

    public void setIdSali(byte idSali) {
        this.idSali = idSali;
    }

    public byte getIdSali() {
        return this.idSali;
    }
}