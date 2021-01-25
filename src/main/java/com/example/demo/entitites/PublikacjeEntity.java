package com.example.demo.entitites;

import org.springframework.data.jpa.repository.query.Procedure;

import javax.persistence.*;




@Entity
@Table(name = "PUBLIKACJE", schema = "INF135412", catalog = "")
public class PublikacjeEntity {
    private String isbn;
    private String typ;
    private String tytul;
    private String gatunek;
    private String temat;
    private PublikacjeEntity publikacjeByIdCzasopisma;

    @Id
    @Column(name = "ISBN")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "TYP")
    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    @Basic
    @Column(name = "TYTUL")
    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    @Basic
    @Column(name = "GATUNEK")
    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    @Basic
    @Column(name = "TEMAT")
    public String getTemat() {
        return temat;
    }

    public void setTemat(String temat) {
        this.temat = temat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PublikacjeEntity that = (PublikacjeEntity) o;

        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;
        if (typ != null ? !typ.equals(that.typ) : that.typ != null) return false;
        if (tytul != null ? !tytul.equals(that.tytul) : that.tytul != null) return false;
        if (gatunek != null ? !gatunek.equals(that.gatunek) : that.gatunek != null) return false;
        if (temat != null ? !temat.equals(that.temat) : that.temat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isbn != null ? isbn.hashCode() : 0;
        result = 31 * result + (typ != null ? typ.hashCode() : 0);
        result = 31 * result + (tytul != null ? tytul.hashCode() : 0);
        result = 31 * result + (gatunek != null ? gatunek.hashCode() : 0);
        result = 31 * result + (temat != null ? temat.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ID_CZASOPISMA", referencedColumnName = "ISBN")
    public PublikacjeEntity getPublikacjeByIdCzasopisma() {
        return publikacjeByIdCzasopisma;
    }

    public void setPublikacjeByIdCzasopisma(PublikacjeEntity publikacjeByIdCzasopisma) {
        this.publikacjeByIdCzasopisma = publikacjeByIdCzasopisma;
    }
}
