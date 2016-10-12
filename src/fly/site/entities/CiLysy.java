package fly.site.entities;

import javax.persistence.*;

/**
 * Created by fly on 2016/10/13.
 */
@Entity
@Table(name = "ci_lysy", schema = "clci", catalog = "")
public class CiLysy {
    private String sno;
    private String lypm;
    private String lyzz;
    private String zzyw;
    private Byte sftt;
    private String wzlx;
    private String qkdm;
    private String qkno;
    private String jgmc;
    private String jgdq;
    private String jglb;
    private String jgyb;
    private String bmmc;
    private String xkdm1;
    private String xkdm2;
    private String juan;
    private String qi;
    private String ym;
    private String lwnd;
    private Integer ywsl;
    private String byc;
    private String xmlx;
    private String xkdm;
    private String blpm;
    private String qkxk;
    private Integer ycflag;
    private String dcbj;
    private String jjlb;
    private String nullFlags;

    @Id
    @Column(name = "SNO", nullable = false, length = 15)
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    @Basic
    @Column(name = "LYPM", nullable = true, length = 254)
    public String getLypm() {
        return lypm;
    }

    public void setLypm(String lypm) {
        this.lypm = lypm;
    }

    @Basic
    @Column(name = "LYZZ", nullable = true, length = 254)
    public String getLyzz() {
        return lyzz;
    }

    public void setLyzz(String lyzz) {
        this.lyzz = lyzz;
    }

    @Basic
    @Column(name = "ZZYW", nullable = true, length = 20)
    public String getZzyw() {
        return zzyw;
    }

    public void setZzyw(String zzyw) {
        this.zzyw = zzyw;
    }

    @Basic
    @Column(name = "SFTT", nullable = true)
    public Byte getSftt() {
        return sftt;
    }

    public void setSftt(Byte sftt) {
        this.sftt = sftt;
    }

    @Basic
    @Column(name = "WZLX", nullable = true, length = 2)
    public String getWzlx() {
        return wzlx;
    }

    public void setWzlx(String wzlx) {
        this.wzlx = wzlx;
    }

    @Basic
    @Column(name = "QKDM", nullable = true, length = 6)
    public String getQkdm() {
        return qkdm;
    }

    public void setQkdm(String qkdm) {
        this.qkdm = qkdm;
    }

    @Basic
    @Column(name = "QKNO", nullable = true, length = 12)
    public String getQkno() {
        return qkno;
    }

    public void setQkno(String qkno) {
        this.qkno = qkno;
    }

    @Basic
    @Column(name = "JGMC", nullable = true, length = 60)
    public String getJgmc() {
        return jgmc;
    }

    public void setJgmc(String jgmc) {
        this.jgmc = jgmc;
    }

    @Basic
    @Column(name = "JGDQ", nullable = true, length = 6)
    public String getJgdq() {
        return jgdq;
    }

    public void setJgdq(String jgdq) {
        this.jgdq = jgdq;
    }

    @Basic
    @Column(name = "JGLB", nullable = true, length = 2)
    public String getJglb() {
        return jglb;
    }

    public void setJglb(String jglb) {
        this.jglb = jglb;
    }

    @Basic
    @Column(name = "JGYB", nullable = true, length = 6)
    public String getJgyb() {
        return jgyb;
    }

    public void setJgyb(String jgyb) {
        this.jgyb = jgyb;
    }

    @Basic
    @Column(name = "BMMC", nullable = true, length = 40)
    public String getBmmc() {
        return bmmc;
    }

    public void setBmmc(String bmmc) {
        this.bmmc = bmmc;
    }

    @Basic
    @Column(name = "XKDM1", nullable = true, length = 15)
    public String getXkdm1() {
        return xkdm1;
    }

    public void setXkdm1(String xkdm1) {
        this.xkdm1 = xkdm1;
    }

    @Basic
    @Column(name = "XKDM2", nullable = true, length = 15)
    public String getXkdm2() {
        return xkdm2;
    }

    public void setXkdm2(String xkdm2) {
        this.xkdm2 = xkdm2;
    }

    @Basic
    @Column(name = "JUAN", nullable = true, length = 6)
    public String getJuan() {
        return juan;
    }

    public void setJuan(String juan) {
        this.juan = juan;
    }

    @Basic
    @Column(name = "QI", nullable = true, length = 6)
    public String getQi() {
        return qi;
    }

    public void setQi(String qi) {
        this.qi = qi;
    }

    @Basic
    @Column(name = "YM", nullable = true, length = 15)
    public String getYm() {
        return ym;
    }

    public void setYm(String ym) {
        this.ym = ym;
    }

    @Basic
    @Column(name = "LWND", nullable = true, length = 4)
    public String getLwnd() {
        return lwnd;
    }

    public void setLwnd(String lwnd) {
        this.lwnd = lwnd;
    }

    @Basic
    @Column(name = "YWSL", nullable = true)
    public Integer getYwsl() {
        return ywsl;
    }

    public void setYwsl(Integer ywsl) {
        this.ywsl = ywsl;
    }

    @Basic
    @Column(name = "BYC", nullable = true, length = 100)
    public String getByc() {
        return byc;
    }

    public void setByc(String byc) {
        this.byc = byc;
    }

    @Basic
    @Column(name = "XMLX", nullable = true, length = 100)
    public String getXmlx() {
        return xmlx;
    }

    public void setXmlx(String xmlx) {
        this.xmlx = xmlx;
    }

    @Basic
    @Column(name = "XKDM", nullable = true, length = 6)
    public String getXkdm() {
        return xkdm;
    }

    public void setXkdm(String xkdm) {
        this.xkdm = xkdm;
    }

    @Basic
    @Column(name = "BLPM", nullable = true, length = 254)
    public String getBlpm() {
        return blpm;
    }

    public void setBlpm(String blpm) {
        this.blpm = blpm;
    }

    @Basic
    @Column(name = "QKXK", nullable = true, length = 6)
    public String getQkxk() {
        return qkxk;
    }

    public void setQkxk(String qkxk) {
        this.qkxk = qkxk;
    }

    @Basic
    @Column(name = "YCFLAG", nullable = true)
    public Integer getYcflag() {
        return ycflag;
    }

    public void setYcflag(Integer ycflag) {
        this.ycflag = ycflag;
    }

    @Basic
    @Column(name = "DCBJ", nullable = true, length = 1)
    public String getDcbj() {
        return dcbj;
    }

    public void setDcbj(String dcbj) {
        this.dcbj = dcbj;
    }

    @Basic
    @Column(name = "JJLB", nullable = true, length = 50)
    public String getJjlb() {
        return jjlb;
    }

    public void setJjlb(String jjlb) {
        this.jjlb = jjlb;
    }

    @Basic
    @Column(name = "_NullFlags", nullable = true, length = -1)
    public String getNullFlags() {
        return nullFlags;
    }

    public void setNullFlags(String nullFlags) {
        this.nullFlags = nullFlags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CiLysy ciLysy = (CiLysy) o;

        if (sno != null ? !sno.equals(ciLysy.sno) : ciLysy.sno != null) return false;
        if (lypm != null ? !lypm.equals(ciLysy.lypm) : ciLysy.lypm != null) return false;
        if (lyzz != null ? !lyzz.equals(ciLysy.lyzz) : ciLysy.lyzz != null) return false;
        if (zzyw != null ? !zzyw.equals(ciLysy.zzyw) : ciLysy.zzyw != null) return false;
        if (sftt != null ? !sftt.equals(ciLysy.sftt) : ciLysy.sftt != null) return false;
        if (wzlx != null ? !wzlx.equals(ciLysy.wzlx) : ciLysy.wzlx != null) return false;
        if (qkdm != null ? !qkdm.equals(ciLysy.qkdm) : ciLysy.qkdm != null) return false;
        if (qkno != null ? !qkno.equals(ciLysy.qkno) : ciLysy.qkno != null) return false;
        if (jgmc != null ? !jgmc.equals(ciLysy.jgmc) : ciLysy.jgmc != null) return false;
        if (jgdq != null ? !jgdq.equals(ciLysy.jgdq) : ciLysy.jgdq != null) return false;
        if (jglb != null ? !jglb.equals(ciLysy.jglb) : ciLysy.jglb != null) return false;
        if (jgyb != null ? !jgyb.equals(ciLysy.jgyb) : ciLysy.jgyb != null) return false;
        if (bmmc != null ? !bmmc.equals(ciLysy.bmmc) : ciLysy.bmmc != null) return false;
        if (xkdm1 != null ? !xkdm1.equals(ciLysy.xkdm1) : ciLysy.xkdm1 != null) return false;
        if (xkdm2 != null ? !xkdm2.equals(ciLysy.xkdm2) : ciLysy.xkdm2 != null) return false;
        if (juan != null ? !juan.equals(ciLysy.juan) : ciLysy.juan != null) return false;
        if (qi != null ? !qi.equals(ciLysy.qi) : ciLysy.qi != null) return false;
        if (ym != null ? !ym.equals(ciLysy.ym) : ciLysy.ym != null) return false;
        if (lwnd != null ? !lwnd.equals(ciLysy.lwnd) : ciLysy.lwnd != null) return false;
        if (ywsl != null ? !ywsl.equals(ciLysy.ywsl) : ciLysy.ywsl != null) return false;
        if (byc != null ? !byc.equals(ciLysy.byc) : ciLysy.byc != null) return false;
        if (xmlx != null ? !xmlx.equals(ciLysy.xmlx) : ciLysy.xmlx != null) return false;
        if (xkdm != null ? !xkdm.equals(ciLysy.xkdm) : ciLysy.xkdm != null) return false;
        if (blpm != null ? !blpm.equals(ciLysy.blpm) : ciLysy.blpm != null) return false;
        if (qkxk != null ? !qkxk.equals(ciLysy.qkxk) : ciLysy.qkxk != null) return false;
        if (ycflag != null ? !ycflag.equals(ciLysy.ycflag) : ciLysy.ycflag != null) return false;
        if (dcbj != null ? !dcbj.equals(ciLysy.dcbj) : ciLysy.dcbj != null) return false;
        if (jjlb != null ? !jjlb.equals(ciLysy.jjlb) : ciLysy.jjlb != null) return false;
        if (nullFlags != null ? !nullFlags.equals(ciLysy.nullFlags) : ciLysy.nullFlags != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sno != null ? sno.hashCode() : 0;
        result = 31 * result + (lypm != null ? lypm.hashCode() : 0);
        result = 31 * result + (lyzz != null ? lyzz.hashCode() : 0);
        result = 31 * result + (zzyw != null ? zzyw.hashCode() : 0);
        result = 31 * result + (sftt != null ? sftt.hashCode() : 0);
        result = 31 * result + (wzlx != null ? wzlx.hashCode() : 0);
        result = 31 * result + (qkdm != null ? qkdm.hashCode() : 0);
        result = 31 * result + (qkno != null ? qkno.hashCode() : 0);
        result = 31 * result + (jgmc != null ? jgmc.hashCode() : 0);
        result = 31 * result + (jgdq != null ? jgdq.hashCode() : 0);
        result = 31 * result + (jglb != null ? jglb.hashCode() : 0);
        result = 31 * result + (jgyb != null ? jgyb.hashCode() : 0);
        result = 31 * result + (bmmc != null ? bmmc.hashCode() : 0);
        result = 31 * result + (xkdm1 != null ? xkdm1.hashCode() : 0);
        result = 31 * result + (xkdm2 != null ? xkdm2.hashCode() : 0);
        result = 31 * result + (juan != null ? juan.hashCode() : 0);
        result = 31 * result + (qi != null ? qi.hashCode() : 0);
        result = 31 * result + (ym != null ? ym.hashCode() : 0);
        result = 31 * result + (lwnd != null ? lwnd.hashCode() : 0);
        result = 31 * result + (ywsl != null ? ywsl.hashCode() : 0);
        result = 31 * result + (byc != null ? byc.hashCode() : 0);
        result = 31 * result + (xmlx != null ? xmlx.hashCode() : 0);
        result = 31 * result + (xkdm != null ? xkdm.hashCode() : 0);
        result = 31 * result + (blpm != null ? blpm.hashCode() : 0);
        result = 31 * result + (qkxk != null ? qkxk.hashCode() : 0);
        result = 31 * result + (ycflag != null ? ycflag.hashCode() : 0);
        result = 31 * result + (dcbj != null ? dcbj.hashCode() : 0);
        result = 31 * result + (jjlb != null ? jjlb.hashCode() : 0);
        result = 31 * result + (nullFlags != null ? nullFlags.hashCode() : 0);
        return result;
    }
}
