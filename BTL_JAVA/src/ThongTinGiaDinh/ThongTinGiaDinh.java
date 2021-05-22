/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThongTinGiaDinh;

/**
 *
 * @author Dell
 */
public class ThongTinGiaDinh {
    int id;
    String hotenbo,hotenme,sodt,diachibo,diachime,nghenghiepbo,nghenghiepme,hotenace,masv;

    public void setId(int id) {
        this.id = id;
    }

    public void setHotenbo(String hotenbo) {
        this.hotenbo = hotenbo;
    }

    public void setHotenme(String hotenme) {
        this.hotenme = hotenme;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public void setDiachibo(String diachibo) {
        this.diachibo = diachibo;
    }

    public void setDiachime(String diachime) {
        this.diachime = diachime;
    }

    public void setNghenghiepbo(String nghenghiepbo) {
        this.nghenghiepbo = nghenghiepbo;
    }

    public void setNghenghiepme(String nghenghiepme) {
        this.nghenghiepme = nghenghiepme;
    }

    public void setHotenace(String hotenace) {
        this.hotenace = hotenace;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public int getId() {
        return id;
    }

    public String getHotenbo() {
        return hotenbo;
    }

    public String getHotenme() {
        return hotenme;
    }

    public String getSodt() {
        return sodt;
    }

    public String getDiachibo() {
        return diachibo;
    }

    public String getDiachime() {
        return diachime;
    }

    public String getNghenghiepbo() {
        return nghenghiepbo;
    }

    public String getNghenghiepme() {
        return nghenghiepme;
    }

    public String getHotenace() {
        return hotenace;
    }

    public String getMasv() {
        return masv;
    }

    public ThongTinGiaDinh(int id, String hotenbo, String hotenme, String sodt, String diachibo, String diachime, String nghenghiepbo, String nghenghiepme, String hotenace, String masv) {
        this.id = id;
        this.hotenbo = hotenbo;
        this.hotenme = hotenme;
        this.sodt = sodt;
        this.diachibo = diachibo;
        this.diachime = diachime;
        this.nghenghiepbo = nghenghiepbo;
        this.nghenghiepme = nghenghiepme;
        this.hotenace = hotenace;
        this.masv = masv;
    }
}
