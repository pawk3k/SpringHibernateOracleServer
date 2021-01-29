package com.example.demo.entitites;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AUTORSTWO", schema = "INF135412", catalog = "")
public class AutorstwoEntity implements Serializable {
    private PublikacjeEntity publikacjeByIsbn;

    private long idAutora;
    private String isbn;
    private AutorzyEntity autorzyByIdAutora;

    @ManyToOne
    @JoinColumn(name = "ISBN", referencedColumnName = "ISBN", nullable = false)
    public PublikacjeEntity getPublikacjeByIsbn() {
        return publikacjeByIsbn;
    }

    public void setPublikacjeByIsbn(PublikacjeEntity publikacjeByIsbn) {
        this.publikacjeByIsbn = publikacjeByIsbn;
    }


    @Id
    @Basic
    @Column(name = "ID_AUTORA")
    public long getIdAutora() {
        return idAutora;
    }

    public void setIdAutora(long idAutora) {
        this.idAutora = idAutora;
    }
    @Id
    @Basic
    @Column(name = "ISBN")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutorstwoEntity that = (AutorstwoEntity) o;

        if (idAutora != that.idAutora) return false;
        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idAutora ^ (idAutora >>> 32));
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ID_AUTORA", referencedColumnName = "ID_AUTORA", nullable = false)
    public AutorzyEntity getAutorzyByIdAutora() {
        return autorzyByIdAutora;
    }

    public void setAutorzyByIdAutora(AutorzyEntity autorzyByIdAutora) {
        this.autorzyByIdAutora = autorzyByIdAutora;
    }

    @Entity
    @Table(name = "EGZEMPLARZE", schema = "INF135412", catalog = "")
    public static class EgzemplarzeEntity {
        private long idEgzemplarza;
        private String isbn;
        private boolean czyWypozyczony;
        private String pozycja;

        @Id
        @Column(name = "ID_EGZEMPLARZA", nullable = false, precision = 0)
        public long getIdEgzemplarza() {
            return idEgzemplarza;
        }

        public void setIdEgzemplarza(long idEgzemplarza) {
            this.idEgzemplarza = idEgzemplarza;
        }

        @Basic
        @Column(name = "ISBN", nullable = false, length = 13)
        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        @Basic
        @Column(name = "CZY_WYPOZYCZONY", nullable = false, precision = 0)
        public boolean isCzyWypozyczony() {
            return czyWypozyczony;
        }

        public void setCzyWypozyczony(boolean czyWypozyczony) {
            this.czyWypozyczony = czyWypozyczony;
        }

        @Basic
        @Column(name = "POZYCJA", nullable = true, length = 2)
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
}
