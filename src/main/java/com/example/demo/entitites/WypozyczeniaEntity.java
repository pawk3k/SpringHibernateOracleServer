package com.example.demo.entitites;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "WYPOZYCZENIA", schema = "INF135412", catalog = "")
@IdClass(WypozyczeniaEntityPK.class)
public class WypozyczeniaEntity {
    private String isbn;
    private long idEgzemplarza;
    private long idUzytkownika;
    private Time dataStartu;
    private Time deadline;
    private Time dataOddania;
    private Long wartoscKary;
    private Boolean czySplacona;
    private PublikacjeEntity publikacjeByIsbn;
    private UzytkownicyEntity uzytkownicyByIdUzytkownika;

    @Id
    @Column(name = "ISBN", nullable = false, insertable = false, updatable = false)
//    @Column(name = "ISBN")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Id
    @Column(name = "ID_EGZEMPLARZA")
    public long getIdEgzemplarza() {
        return idEgzemplarza;
    }

    public void setIdEgzemplarza(long idEgzemplarza) {
        this.idEgzemplarza = idEgzemplarza;
    }

    @Id
    @Column(name = "ID_UZYTKOWNIKA")
    public long getIdUzytkownika() {
        return idUzytkownika;
    }

    public void setIdUzytkownika(long idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
    }

    @Id
    @Column(name = "DATA_STARTU")
    public Time getDataStartu() {
        return dataStartu;
    }

    public void setDataStartu(Time dataStartu) {
        this.dataStartu = dataStartu;
    }

    @Basic
    @Column(name = "DEADLINE")
    public Time getDeadline() {
        return deadline;
    }

    public void setDeadline(Time deadline) {
        this.deadline = deadline;
    }

    @Basic
    @Column(name = "DATA_ODDANIA")
    public Time getDataOddania() {
        return dataOddania;
    }

    public void setDataOddania(Time dataOddania) {
        this.dataOddania = dataOddania;
    }

    @Basic
    @Column(name = "WARTOSC_KARY")
    public Long getWartoscKary() {
        return wartoscKary;
    }

    public void setWartoscKary(Long wartoscKary) {
        this.wartoscKary = wartoscKary;
    }

    @Basic
    @Column(name = "CZY_SPLACONA")
    public Boolean getCzySplacona() {
        return czySplacona;
    }

    public void setCzySplacona(Boolean czySplacona) {
        this.czySplacona = czySplacona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WypozyczeniaEntity that = (WypozyczeniaEntity) o;

        if (idEgzemplarza != that.idEgzemplarza) return false;
        if (idUzytkownika != that.idUzytkownika) return false;
        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;
        if (dataStartu != null ? !dataStartu.equals(that.dataStartu) : that.dataStartu != null) return false;
        if (deadline != null ? !deadline.equals(that.deadline) : that.deadline != null) return false;
        if (dataOddania != null ? !dataOddania.equals(that.dataOddania) : that.dataOddania != null) return false;
        if (wartoscKary != null ? !wartoscKary.equals(that.wartoscKary) : that.wartoscKary != null) return false;
        if (czySplacona != null ? !czySplacona.equals(that.czySplacona) : that.czySplacona != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isbn != null ? isbn.hashCode() : 0;
        result = 31 * result + (int) (idEgzemplarza ^ (idEgzemplarza >>> 32));
        result = 31 * result + (int) (idUzytkownika ^ (idUzytkownika >>> 32));
        result = 31 * result + (dataStartu != null ? dataStartu.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (dataOddania != null ? dataOddania.hashCode() : 0);
        result = 31 * result + (wartoscKary != null ? wartoscKary.hashCode() : 0);
        result = 31 * result + (czySplacona != null ? czySplacona.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ISBN", referencedColumnName = "ISBN", nullable = false)
    public PublikacjeEntity getPublikacjeByIsbn() {
        return publikacjeByIsbn;
    }

    public void setPublikacjeByIsbn(PublikacjeEntity publikacjeByIsbn) {
        this.publikacjeByIsbn = publikacjeByIsbn;
    }

    @ManyToOne
    @JoinColumn(name = "ID_UZYTKOWNIKA", referencedColumnName = "ID_UZYTKOWNIKA", nullable = false)
    public UzytkownicyEntity getUzytkownicyByIdUzytkownika() {
        return uzytkownicyByIdUzytkownika;
    }

    public void setUzytkownicyByIdUzytkownika(UzytkownicyEntity uzytkownicyByIdUzytkownika) {
        this.uzytkownicyByIdUzytkownika = uzytkownicyByIdUzytkownika;
    }
}
