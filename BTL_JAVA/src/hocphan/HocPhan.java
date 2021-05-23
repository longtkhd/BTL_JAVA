/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocPhan;

/**
 *
 * @author Dell
 */
public class HocPhan {
    private String maHp,tenHp,loaiHp;
    private int soTCLT,soTCTH,tongTC;

    @Override
    public String toString() {
        return "HocPhan{" + "maHp=" + maHp + ", tenHp=" + tenHp + ", loaiHp=" + loaiHp + ", soTCLT=" + soTCLT + ", soTCTH=" + soTCTH + ", tongTC=" + tongTC + '}';
    }

    public void setMaHp(String maHp) {
        this.maHp = maHp;
    }

    public void setTenHp(String tenHp) {
        this.tenHp = tenHp;
    }

    public void setLoaiHp(String loaiHp) {
        this.loaiHp = loaiHp;
    }

    public void setSoTCLT(int soTCLT) {
        this.soTCLT = soTCLT;
    }

    public void setSoTCTH(int soTCTH) {
        this.soTCTH = soTCTH;
    }

    public void setTongTC(int tongTC) {
        this.tongTC = tongTC;
    }

    public HocPhan(String maHp, String tenHp, String loaiHp, int soTCLT, int soTCTH, int tongTC) {
        this.maHp = maHp;
        this.tenHp = tenHp;
        this.loaiHp = loaiHp;
        this.soTCLT = soTCLT;
        this.soTCTH = soTCTH;
        this.tongTC = tongTC;
    }

    public String getMaHp() {
        return maHp;
    }

    public String getTenHp() {
        return tenHp;
    }

    public String getLoaiHp() {
        return loaiHp;
    }

    public int getSoTCLT() {
        return soTCLT;
    }

    public int getSoTCTH() {
        return soTCTH;
    }

    public int getTongTC() {
        return tongTC;
    }
    
}
