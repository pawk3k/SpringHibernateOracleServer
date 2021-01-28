package com.example.demo.service.dto;

public class EgzemplarzeDTO {
    private long idEgzemplarza;
    private String isbn;
    private boolean czyWypozyczony;
    private String pozycja;

    public EgzemplarzeDTO idEgzemplarza(long idEgzemplarza) {
        this.idEgzemplarza = idEgzemplarza;
        return this;
    }

    public void setIdEgzemplarza(long idEgzemplarza) {
        this.idEgzemplarza = idEgzemplarza;
    }

    public long getIdEgzemplarza() {
        return this.idEgzemplarza;
    }

    public EgzemplarzeDTO isbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public EgzemplarzeDTO czyWypozyczony(boolean czyWypozyczony) {
        this.czyWypozyczony = czyWypozyczony;
        return this;
    }

    public void setCzyWypozyczony(boolean czyWypozyczony) {
        this.czyWypozyczony = czyWypozyczony;
    }

    public boolean getCzyWypozyczony() {
        return this.czyWypozyczony;
    }

    public EgzemplarzeDTO pozycja(String pozycja) {
        this.pozycja = pozycja;
        return this;
    }

    public void setPozycja(String pozycja) {
        this.pozycja = pozycja;
    }

    public String getPozycja() {
        return this.pozycja;
    }
}