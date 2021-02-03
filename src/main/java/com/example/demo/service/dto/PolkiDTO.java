package com.example.demo.service.dto;

public class PolkiDTO {
    private byte nrPolki;
    private String kodRegalu;

    public PolkiDTO nrPolki(byte nrPolki) {
        this.nrPolki = nrPolki;
        return this;
    }

    public void setNrPolki(byte nrPolki) {
        this.nrPolki = nrPolki;
    }

    public byte getNrPolki() {
        return this.nrPolki;
    }

    public PolkiDTO kodRegalu(String kodRegalu) {
        this.kodRegalu = kodRegalu;
        return this;
    }

    public void setKodRegalu(String kodRegalu) {
        this.kodRegalu = kodRegalu;
    }

    public String getKodRegalu() {
        return this.kodRegalu;
    }
}