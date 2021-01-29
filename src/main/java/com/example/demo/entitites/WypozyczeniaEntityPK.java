package com.example.demo.entitites;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Time;

public class WypozyczeniaEntityPK implements Serializable {
    private String isbn;
    private long idEgzemplarza;
    private long idUzytkownika;
    private Time dataStartu;

    @Column(name = "ISBN", nullable = false, insertable = false, updatable = false)
    @Id
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Column(name = "ID_EGZEMPLARZA")
    @Id
    public long getIdEgzemplarza() {
        return idEgzemplarza;
    }

    public void setIdEgzemplarza(long idEgzemplarza) {
        this.idEgzemplarza = idEgzemplarza;
    }

    @Column(name = "ID_UZYTKOWNIKA", nullable = false, insertable = false, updatable = false)
    @Id
    public long getIdUzytkownika() {
        return idUzytkownika;
    }

    public void setIdUzytkownika(long idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
    }

    @Column(name = "DATA_STARTU")
    @Id
    public Time getDataStartu() {
        return dataStartu;
    }

    public void setDataStartu(Time dataStartu) {
        this.dataStartu = dataStartu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WypozyczeniaEntityPK that = (WypozyczeniaEntityPK) o;

        if (idEgzemplarza != that.idEgzemplarza) return false;
        if (idUzytkownika != that.idUzytkownika) return false;
        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;
        if (dataStartu != null ? !dataStartu.equals(that.dataStartu) : that.dataStartu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isbn != null ? isbn.hashCode() : 0;
        result = 31 * result + (int) (idEgzemplarza ^ (idEgzemplarza >>> 32));
        result = 31 * result + (int) (idUzytkownika ^ (idUzytkownika >>> 32));
        result = 31 * result + (dataStartu != null ? dataStartu.hashCode() : 0);
        return result;
    }
}
