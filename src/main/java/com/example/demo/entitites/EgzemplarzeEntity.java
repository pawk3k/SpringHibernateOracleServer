package com.example.demo.entitites;

import javax.persistence.*;

@Entity
@Table(name = "EGZEMPLARZE", schema = "INF135412", catalog = "")
public class EgzemplarzeEntity {
    private long idEgzemplarza;
    private String isbn;
    private boolean czyWypozyczony;
    private String pozycja;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_EGZEMPLARZA")
    public long getIdEgzemplarza() {
        return idEgzemplarza;
    }

    public void setIdEgzemplarza(long idEgzemplarza) {
        this.idEgzemplarza = idEgzemplarza;
    }

    @Basic
    @Column(name = "ISBN")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "CZY_WYPOZYCZONY")
    public boolean isCzyWypozyczony() {
        return czyWypozyczony;
    }

    public void setCzyWypozyczony(boolean czyWypozyczony) {
        this.czyWypozyczony = czyWypozyczony;
    }

    @Basic
    @Column(name = "POZYCJA")
    public String getPozycja() {
        return pozycja;
    }

    public void setPozycja(String pozycja) {
        this.pozycja = pozycja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EgzemplarzeEntity that = (EgzemplarzeEntity) o;

        if (idEgzemplarza != that.idEgzemplarza) return false;
        if (czyWypozyczony != that.czyWypozyczony) return false;
        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;
        if (pozycja != null ? !pozycja.equals(that.pozycja) : that.pozycja != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idEgzemplarza ^ (idEgzemplarza >>> 32));
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (czyWypozyczony ? 1 : 0);
        result = 31 * result + (pozycja != null ? pozycja.hashCode() : 0);
        return result;
    }
}