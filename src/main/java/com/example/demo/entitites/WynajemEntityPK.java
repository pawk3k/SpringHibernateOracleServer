package com.example.demo.entitites;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

public class WynajemEntityPK implements Serializable {
    private Date data;
    private long godzRozpoczecia;
    private long idUzytkownika;
    private byte idSali;

    @Column(name = "DATA", nullable = false)
    @Id
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Column(name = "GODZ_ROZPOCZECIA", nullable = false, precision = 0)
    @Id
    public long getGodzRozpoczecia() {
        return godzRozpoczecia;
    }

    public void setGodzRozpoczecia(long godzRozpoczecia) {
        this.godzRozpoczecia = godzRozpoczecia;
    }

    @Column(name = "ID_UZYTKOWNIKA", nullable = false, precision = 0)
    @Id
    public long getIdUzytkownika() {
        return idUzytkownika;
    }

    public void setIdUzytkownika(long idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
    }

    @Column(name = "ID_SALI", nullable = false, precision = 0)
    @Id
    public byte getIdSali() {
        return idSali;
    }

    public void setIdSali(byte idSali) {
        this.idSali = idSali;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WynajemEntityPK that = (WynajemEntityPK) o;

        if (godzRozpoczecia != that.godzRozpoczecia) return false;
        if (idUzytkownika != that.idUzytkownika) return false;
        if (idSali != that.idSali) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + (int) (godzRozpoczecia ^ (godzRozpoczecia >>> 32));
        result = 31 * result + (int) (idUzytkownika ^ (idUzytkownika >>> 32));
        result = 31 * result + (int) idSali;
        return result;
    }
}
