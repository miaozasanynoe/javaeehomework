package org.vo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(CjPK.class)
public class Cj {
    private CjPK id;
    private Integer cj;

    public CjPK getId() {
        return id;
    }

    public void setId(CjPK id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CJ")
    public Integer getCj() {
        return cj;
    }

    public void setCj(Integer cj) {
        this.cj = cj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cj)) return false;
        Cj cj1 = (Cj) o;
        return getId().equals(cj1.getId()) &&
                getCj().equals(cj1.getCj());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCj());
    }

    @Override
    public String toString() {
        return "Cj{" +
                "id=" + id.toString() +
                ", cj=" + cj +
                '}';
    }
}
