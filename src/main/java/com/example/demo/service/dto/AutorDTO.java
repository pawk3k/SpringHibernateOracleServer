package com.example.demo.service.dto;

public class AutorDTO {
    private long idAutora;
    private String nazwisko;
    private String imie;
    private String tytulNaukowy;

    public AutorDTO idAutora(long idAutora) {
        this.idAutora = idAutora;
        return this;
    }

    public void setIdAutora(long idAutora) {
        this.idAutora = idAutora;
    }

    public long getIdAutora() {
        return this.idAutora;
    }

    public AutorDTO nazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public AutorDTO imie(String imie) {
        this.imie = imie;
        return this;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return this.imie;
    }

    public AutorDTO tytulNaukowy(String tytulNaukowy) {
        this.tytulNaukowy = tytulNaukowy;
        return this;
    }

    public void setTytulNaukowy(String tytulNaukowy) {
        this.tytulNaukowy = tytulNaukowy;
    }

    public String getTytulNaukowy() {
        return this.tytulNaukowy;
    }
}