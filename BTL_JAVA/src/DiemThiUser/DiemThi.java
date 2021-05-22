/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiemThiUser;

/**
 *
 * @author Dell
 */
public class DiemThi {
        private String maHp,tenHp,loaiKt;
        private int diem,ky;

    public void setMaHp(String maHp) {
        this.maHp = maHp;
    }

    public void setKy(int ky) {
        this.ky = ky;
    }

    public void setTenHp(String tenHp) {
        this.tenHp = tenHp;
    }

    public void setLoaiKt(String loaiKt) {
        this.loaiKt = loaiKt;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getMaHp() {
        return maHp;
    }

    public String getTenHp() {
        return tenHp;
    }

    public String getLoaiKt() {
        return loaiKt;
    }

    public int getDiem() {
        return diem;
    }

    public DiemThi(String maHp, String tenHp, String loaiKt, int diem, int ky) {
        this.maHp = maHp;
        this.tenHp = tenHp;
        this.loaiKt = loaiKt;
        this.diem = diem;
        this.ky = ky;
    }

    public int getKy() {
        return ky;
    }


}
