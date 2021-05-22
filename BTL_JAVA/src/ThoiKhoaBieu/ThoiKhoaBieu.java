/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThoiKhoaBieu;

/**
 *
 * @author Dell
 */
public class ThoiKhoaBieu {
      private String mahp,tenhp,loaihp,thu;
      private int ky,tietbatdau,tietketthuc,tclt,tcth,tongtc;

    public ThoiKhoaBieu(String mahp, String tenhp, String loaihp, String thu, int ky, int tietbatdau, int tietketthuc, int tclt, int tcth, int tongtc) {
        this.mahp = mahp;
        this.tenhp = tenhp;
        this.loaihp = loaihp;
        this.thu = thu;
        this.ky = ky;
        this.tietbatdau = tietbatdau;
        this.tietketthuc = tietketthuc;
        this.tclt = tclt;
        this.tcth = tcth;
        this.tongtc = tongtc;
    }

    @Override
    public String toString() {
        return "ThoiKhoaBieu{" + "mahp=" + mahp + ", tenhp=" + tenhp + ", loaihp=" + loaihp + ", thu=" + thu + ", ky=" + ky + ", tietbatdau=" + tietbatdau + ", tietketthuc=" + tietketthuc + ", tclt=" + tclt + ", tcth=" + tcth + ", tongtc=" + tongtc + '}';
    }

    public void setMahp(String mahp) {
        this.mahp = mahp;
    }

    public void setTenhp(String tenhp) {
        this.tenhp = tenhp;
    }

    public void setLoaihp(String loaihp) {
        this.loaihp = loaihp;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public void setKy(int ky) {
        this.ky = ky;
    }

    public void setTietbatdau(int tietbatdau) {
        this.tietbatdau = tietbatdau;
    }

    public void setTietketthuc(int tietketthuc) {
        this.tietketthuc = tietketthuc;
    }

    public void setTclt(int tclt) {
        this.tclt = tclt;
    }

    public void setTcth(int tcth) {
        this.tcth = tcth;
    }

    public void setTongtc(int tongtc) {
        this.tongtc = tongtc;
    }

    public String getMahp() {
        return mahp;
    }

    public String getTenhp() {
        return tenhp;
    }

    public String getLoaihp() {
        return loaihp;
    }

    public String getThu() {
        return thu;
    }

    public int getKy() {
        return ky;
    }

    public int getTietbatdau() {
        return tietbatdau;
    }

    public int getTietketthuc() {
        return tietketthuc;
    }

    public int getTclt() {
        return tclt;
    }

    public int getTcth() {
        return tcth;
    }

    public int getTongtc() {
        return tongtc;
    }

   
}
