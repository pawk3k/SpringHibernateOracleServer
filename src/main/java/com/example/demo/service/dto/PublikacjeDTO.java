package com.example.demo.service.dto;

import com.example.demo.entitites.PublikacjeEntity;

public class PublikacjeDTO {
    private String isbn;
    private String typ;
    private String tytul;
    private String gatunek;
    private String temat;
    private PublikacjeEntity publikacjeByIdCzasopisma;

    public PublikacjeDTO isbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public PublikacjeDTO typ(String typ) {
        this.typ = typ;
        return this;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getTyp() {
        return this.typ;
    }

    public PublikacjeDTO tytul(String tytul) {
        this.tytul = tytul;
        return this;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getTytul() {
        return this.tytul;
    }

    public PublikacjeDTO gatunek(String gatunek) {
        this.gatunek = gatunek;
        return this;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getGatunek() {
        return this.gatunek;
    }

    public PublikacjeDTO temat(String temat) {
        this.temat = temat;
        return this;
    }

    public void setTemat(String temat) {
        this.temat = temat;
    }

    public String getTemat() {
        return this.temat;
    }

    public PublikacjeDTO publikacjeByIdCzasopisma(PublikacjeEntity publikacjeByIdCzasopisma) {
        this.publikacjeByIdCzasopisma = publikacjeByIdCzasopisma;
        return this;
    }

    public void setPublikacjeByIdCzasopisma(PublikacjeEntity publikacjeByIdCzasopisma) {
        this.publikacjeByIdCzasopisma = publikacjeByIdCzasopisma;
    }

    public PublikacjeEntity getPublikacjeByIdCzasopisma() {
        return this.publikacjeByIdCzasopisma;
    }
}