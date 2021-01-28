package com.example.demo.service.dto;

public class RegalyDTO {
    private String kodRegalu;

    public RegalyDTO kodRegalu(String kodRegalu) {
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