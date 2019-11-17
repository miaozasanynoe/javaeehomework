package org.vo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CjPK implements Serializable {
    private String xh;
    private String kch;

    @Column(name = "XH")
    @Id
    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    @Column(name = "KCH")
    @Id
    public String getKch() {
        return kch;
    }

    public void setKch(String kch) {
        this.kch = kch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CjPK cjPK = (CjPK) o;

        if (xh != null ? !xh.equals(cjPK.xh) : cjPK.xh != null) return false;
        if (kch != null ? !kch.equals(cjPK.kch) : cjPK.kch != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xh != null ? xh.hashCode() : 0;
        result = 31 * result + (kch != null ? kch.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CjPK{" +
                "xh='" + xh + '\'' +
                ", kch='" + kch + '\'' +
                '}';
    }
}
