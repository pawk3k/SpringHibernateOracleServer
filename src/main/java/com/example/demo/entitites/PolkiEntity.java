package com.example.demo.entitites;

import javax.persistence.*;

@Entity
@Table(name = "POLKI", schema = "INF135412", catalog = "")
public class PolkiEntity {
    private byte nrPolki;
    private RegalyEntity regalyByKodRegalu;

    @Id
    @Column(name = "NR_POLKI")
    public byte getNrPolki() {
        return nrPolki;
    }

    public void setNrPolki(byte nrPolki) {
        this.nrPolki = nrPolki;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PolkiEntity that = (PolkiEntity) o;

        if (nrPolki != that.nrPolki) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) nrPolki;
    }

    @ManyToOne
    @JoinColumn(name = "KOD_REGALU", referencedColumnName = "KOD_REGALU", nullable = false)
    public RegalyEntity getRegalyByKodRegalu() {
        return regalyByKodRegalu;
    }

    public void setRegalyByKodRegalu(RegalyEntity regalyByKodRegalu) {
        this.regalyByKodRegalu = regalyByKodRegalu;
    }
}
