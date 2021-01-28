package com.example.demo.entitites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REGALY", schema = "INF135412", catalog = "")
public class RegalyEntity {
    private String kodRegalu;

    @Id
    @Column(name = "KOD_REGALU")
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

        RegalyEntity that = (RegalyEntity) o;

        if (kodRegalu != null ? !kodRegalu.equals(that.kodRegalu) : that.kodRegalu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return kodRegalu != null ? kodRegalu.hashCode() : 0;
    }
}
