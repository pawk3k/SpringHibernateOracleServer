package com.example.demo.entitites;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "AUTORZY", schema = "INF135412", catalog = "")
public class AutorzyEntity {
    private long idAutora;
    private String nazwisko;
    private String imie;
    private String tytulNaukowy;
    private Collection<AutorstwoEntity> autorstwosByIdAutora;

    @Id
    @Column(name = "ID_AUTORA")
    public long getIdAutora() {
        return idAutora;
    }

    public void setIdAutora(long idAutora) {
        this.idAutora = idAutora;
    }

    @Basic
    @Column(name = "NAZWISKO")
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
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
    @Column(name = "TYTUL_NAUKOWY")
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

        AutorzyEntity that = (AutorzyEntity) o;

        if (idAutora != that.idAutora) return false;
        if (nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;
        if (imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        if (tytulNaukowy != null ? !tytulNaukowy.equals(that.tytulNaukowy) : that.tytulNaukowy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idAutora ^ (idAutora >>> 32));
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + (imie != null ? imie.hashCode() : 0);
        result = 31 * result + (tytulNaukowy != null ? tytulNaukowy.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "autorzyByIdAutora")
    public Collection<AutorstwoEntity> getAutorstwosByIdAutora() {
        return autorstwosByIdAutora;
    }

    public void setAutorstwosByIdAutora(Collection<AutorstwoEntity> autorstwosByIdAutora) {
        this.autorstwosByIdAutora = autorstwosByIdAutora;
    }
}
