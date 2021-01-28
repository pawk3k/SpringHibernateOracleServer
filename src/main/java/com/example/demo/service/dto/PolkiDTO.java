package com.example.demo.service.dto;

import com.example.demo.entitites.RegalyEntity;

public class PolkiDTO {
    private byte nrPolki;
    private RegalyEntity regalyByKodRegalu;

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

    public PolkiDTO regalyByKodRegalu(RegalyEntity regalyByKodRegalu) {
        this.regalyByKodRegalu = regalyByKodRegalu;
        return this;
    }

    public void setRegalyByKodRegalu(RegalyEntity regalyByKodRegalu) {
        this.regalyByKodRegalu = regalyByKodRegalu;
    }

    public RegalyEntity getRegalyByKodRegalu() {
        return this.regalyByKodRegalu;
    }
}