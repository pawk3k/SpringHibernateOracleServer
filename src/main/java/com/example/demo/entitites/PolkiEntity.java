package com.example.demo.entitites;

import javax.persistence.*;

@Entity
@Table(name = "POLKI", schema = "INF135412", catalog = "")
@IdClass(PolkiEntityPK.class)
public class PolkiEntity {
    private byte nrPolki;
    private String kodRegalu;

    @Id
    @Column(name = "NR_POLKI", nullable = false, precision = 0)
    public byte getNrPolki() {
        return nrPolki;
    }

    public void setNrPolki(byte nrPolki) {
        this.nrPolki = nrPolki;
    }

    @Id
    @Column(name = "KOD_REGALU", nullable = false, length = 3)
    public String getKodRegalu() {
        return kodRegalu;
    }

    public void setKodRegalu(String kodRegalu) {
        this.kodRegalu = kodRegalu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PolkiEntity that = (PolkiEntity) o;

        if (nrPolki != that.nrPolki) return false;
        if (kodRegalu != null ? !kodRegalu.equals(that.kodRegalu) : that.kodRegalu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) nrPolki;
        result = 31 * result + (kodRegalu != null ? kodRegalu.hashCode() : 0);
        return result;
    }
}
