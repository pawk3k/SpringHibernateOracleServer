package com.example.demo.service.dto;

public class SaleDTO {
    private byte idSali;
    private Byte liczbaMiejsc;
    private Boolean jestTablica;

    public SaleDTO idSali(byte idSali) {
        this.idSali = idSali;
        return this;
    }

    public void setIdSali(byte idSali) {
        this.idSali = idSali;
    }

    public byte getIdSali() {
        return this.idSali;
    }

    public SaleDTO liczbaMiejsc(Byte liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
        return this;
    }

    public void setLiczbaMiejsc(Byte liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }

    public Byte getLiczbaMiejsc() {
        return this.liczbaMiejsc;
    }

    public SaleDTO jestTablica(Boolean jestTablica) {
        this.jestTablica = jestTablica;
        return this;
    }

    public void setJestTablica(Boolean jestTablica) {
        this.jestTablica = jestTablica;
    }

    public Boolean getJestTablica() {
        return this.jestTablica;
    }
}