package com.example.demo.entitites;

import javax.persistence.*;

@Entity

@Table(name = "UZYTKOWNICY", schema = "INF135412", catalog = "")
public class UzytkownicyEntity {
    private long idUzytkownika;
    private String imie;
    private String nazwisko;

    @Id
    @SequenceGenerator(name = "mySeqGen", sequenceName = "uzytkownicy_seq", initialValue = 5, allocationSize = 50)
    @GeneratedValue(generator = "mySeqGen")
    @Column(name = "ID_UZYTKOWNIKA")
    public long getIdUzytkownika() {
        return idUzytkownika;
    }

    public void setIdUzytkownika(long idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
    }

    @Basic
    @Column(name = "IMIE")
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Basic
    @Column(name = "NAZWISKO")
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UzytkownicyEntity that = (UzytkownicyEntity) o;

        if (idUzytkownika != that.idUzytkownika) return false;
        if (imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        if (nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idUzytkownika ^ (idUzytkownika >>> 32));
        result = 31 * result + (imie != null ? imie.hashCode() : 0);
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        return result;
    }
}
