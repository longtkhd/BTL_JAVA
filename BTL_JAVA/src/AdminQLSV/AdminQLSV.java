/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminQLSV;

/**
 *
 * @author Dell
 */
public class AdminQLSV {
    private String maSv,hoten,soDt,email,diachiSv,sothich,danToc,tonGiao,gioiTinh,maNguoidung,maNganh;

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    @Override
    public String toString() {
        return "AdminQLSV{" + "maSv=" + maSv + ", hoten=" + hoten + ", soDt=" + soDt + ", email=" + email + ", diachiSv=" + diachiSv + ", sothich=" + sothich + ", danToc=" + danToc + ", tonGiao=" + tonGiao + ", gioiTinh=" + gioiTinh + ", maNguoidung=" + maNguoidung + ", maNganh=" + maNganh + '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDiachiSv(String diachiSv) {
        this.diachiSv = diachiSv;
    }

    public void setSothich(String sothich) {
        this.sothich = sothich;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public void setTonGiao(String tonGiao) {
        this.tonGiao = tonGiao;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setMaNguoidung(String maNguoidung) {
        this.maNguoidung = maNguoidung;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public String getHoten() {
        return hoten;
    }

    public String getSoDt() {
        return soDt;
    }

    public String getEmail() {
        return email;
    }

    public String getDiachiSv() {
        return diachiSv;
    }

    public String getSothich() {
        return sothich;
    }

    public String getDanToc() {
        return danToc;
    }

    public String getTonGiao() {
        return tonGiao;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getMaNguoidung() {
        return maNguoidung;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public AdminQLSV(String maSv, String hoten, String soDt, String email, String diachiSv, String sothich, String danToc, String tonGiao, String gioiTinh, String maNguoidung, String maNganh) {
        this.maSv = maSv;
        this.hoten = hoten;
        this.soDt = soDt;
        this.email = email;
        this.diachiSv = diachiSv;
        this.sothich = sothich;
        this.danToc = danToc;
        this.tonGiao = tonGiao;
        this.gioiTinh = gioiTinh;
        this.maNguoidung = maNguoidung;
        this.maNganh = maNganh;
    }
}
