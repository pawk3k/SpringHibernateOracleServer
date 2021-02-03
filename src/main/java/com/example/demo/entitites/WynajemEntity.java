package com.example.demo.entitites;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "WYNAJEM", schema = "INF135412", catalog = "")
@IdClass(WynajemEntityPK.class)
public class WynajemEntity {
    private Date data;
    private long godzRozpoczecia;
    private Long deadline;
    private Long godzZakonczenia;
    private long idUzytkownika;
    private byte idSali;

    @Id
    @Column(name = "DATA", nullable = false)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Id
    @Column(name = "GODZ_ROZPOCZECIA", nullable = false, precision = 0)
    public long getGodzRozpoczecia() {
        return godzRozpoczecia;
    }

    public void setGodzRozpoczecia(long godzRozpoczecia) {
        this.godzRozpoczecia = godzRozpoczecia;
    }

    @Basic
    @Column(name = "DEADLINE", nullable = true, precision = 0)
    public Long getDeadline() {
        return deadline;
    }

    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    @Basic
    @Column(name = "GODZ_ZAKONCZENIA", nullable = true, precision = 0)
    public Long getGodzZakonczenia() {
        return godzZakonczenia;
    }

    public void setGodzZakonczenia(Long godzZakonczenia) {
        this.godzZakonczenia = godzZakonczenia;
    }

    @Id
    @Column(name = "ID_UZYTKOWNIKA", nullable = false, precision = 0)
    public long getIdUzytkownika() {
        return idUzytkownika;
    }

    public void setIdUzytkownika(long idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
    }

    @Id
    @Column(name = "ID_SALI", nullable = false, precision = 0)
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

        WynajemEntity that = (WynajemEntity) o;

        if (godzRozpoczecia != that.godzRozpoczecia) return false;
        if (idUzytkownika != that.idUzytkownika) return false;
        if (idSali != that.idSali) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (deadline != null ? !deadline.equals(that.deadline) : that.deadline != null) return false;
        if (godzZakonczenia != null ? !godzZakonczenia.equals(that.godzZakonczenia) : that.godzZakonczenia != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + (int) (godzRozpoczecia ^ (godzRozpoczecia >>> 32));
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (godzZakonczenia != null ? godzZakonczenia.hashCode() : 0);
        result = 31 * result + (int) (idUzytkownika ^ (idUzytkownika >>> 32));
        result = 31 * result + (int) idSali;
        return result;
    }
}
