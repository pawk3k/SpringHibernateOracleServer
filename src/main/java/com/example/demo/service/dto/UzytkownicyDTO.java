package com.example.demo.service.dto;

public class UzytkownicyDTO {
    private String idUzytkownika;
    private String imie;
    private String nazwisko;

    public UzytkownicyDTO idUzytkownika(String idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
        return this;
    }

    public void setIdUzytkownika(String idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
    }

    public String getIdUzytkownika() {
        return this.idUzytkownika;
    }

    public UzytkownicyDTO imie(String imie) {
        this.imie = imie;
        return this;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return this.imie;
    }

    public UzytkownicyDTO nazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }
}