package com.example.demo.entitites;

import javax.persistence.*;



@Entity
@Table(name = "AUTOR", schema = "INF135412", catalog = "")
public class AutorEntity {
    private long idAutora;
    private String nazwisko;
    private String imie;
    private String tytulNaukowy;

    @Id
    @Column(name = "ID_AUTORA", nullable = false, precision = 0)
    public long getIdAutora() {
        return idAutora;
    }

    public void setIdAutora(long idAutora) {
        this.idAutora = idAutora;
    }

    @Basic
    @Column(name = "NAZWISKO", nullable = false, length = 50)
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Basic
    @Column(name = "IMIE", nullable = true, length = 50)
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Basic
    @Column(name = "TYTUL_NAUKOWY", nullable = true, length = 50)
    public String getTytulNaukowy() {
        return tytulNaukowy;
    }

    public void setTytulNaukowy(String tytulNaukowy) {
        this.tytulNaukowy = tytulNaukowy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutorEntity that = (AutorEntity) o;

        if (idAutora != that.idAutora) return false;
        if (nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;
        if (imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        return tytulNaukowy != null ? tytulNaukowy.equals(that.tytulNaukowy) : that.tytulNaukowy == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (idAutora ^ (idAutora >>> 32));
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + (imie != null ? imie.hashCode() : 0);
        result = 31 * result + (tytulNaukowy != null ? tytulNaukowy.hashCode() : 0);
        return result;
    }
}
