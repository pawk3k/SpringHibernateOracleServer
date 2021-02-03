package com.example.demo.entitites;

import javax.persistence.*;

@Entity
@Table(name = "SALE", schema = "INF135412", catalog = "")
public class SaleEntity {
    private byte idSali;
    private Byte liczbaMiejsc;
    private Boolean jestTablica;

    @Id
    @Column(name = "ID_SALI", nullable = false, precision = 0)
    public byte getIdSali() {
        return idSali;
    }

    public void setIdSali(byte idSali) {
        this.idSali = idSali;
    }

    @Basic
    @Column(name = "LICZBA_MIEJSC", nullable = true, precision = 0)
    public Byte getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(Byte liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }

    @Basic
    @Column(name = "JEST_TABLICA", nullable = true, precision = 0)
    public Boolean getJestTablica() {
        return jestTablica;
    }

    public void setJestTablica(Boolean jestTablica) {
        this.jestTablica = jestTablica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SaleEntity that = (SaleEntity) o;

        if (idSali != that.idSali) return false;
        if (liczbaMiejsc != null ? !liczbaMiejsc.equals(that.liczbaMiejsc) : that.liczbaMiejsc != null) return false;
        if (jestTablica != null ? !jestTablica.equals(that.jestTablica) : that.jestTablica != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) idSali;
        result = 31 * result + (liczbaMiejsc != null ? liczbaMiejsc.hashCode() : 0);
        result = 31 * result + (jestTablica != null ? jestTablica.hashCode() : 0);
        return result;
    }
}
