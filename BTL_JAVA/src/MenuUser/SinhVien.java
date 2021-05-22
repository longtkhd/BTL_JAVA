/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuUser;


import java.util.Objects;

/**
 *
 * @author Dell
 */
public class SinhVien {
    private String ma_sv, ho_ten, so_dt,email,dia_chi,so_thich,dan_toc,ton_giao,gioi_tinh,ma_nguoi_dung,ma_nganh,loai_taikhoan;

    public SinhVien(String ma_sv, String ho_ten, String so_dt, String email, String dia_chi, String so_thich, String dan_toc, String ton_giao, String gioi_tinh, String ma_nguoi_dung, String ma_nganh, String loai_taikhoan) {
        this.ma_sv = ma_sv;
        this.ho_ten = ho_ten;
        this.so_dt = so_dt;
        this.email = email;
        this.dia_chi = dia_chi;
        this.so_thich = so_thich;
        this.dan_toc = dan_toc;
        this.ton_giao = ton_giao;
        this.gioi_tinh = gioi_tinh;
        this.ma_nguoi_dung = ma_nguoi_dung;
        this.ma_nganh = ma_nganh;
        this.loai_taikhoan = loai_taikhoan;
    }

    public String getLoai_taikhoan() {
        return loai_taikhoan;
    }

    public void setLoai_taikhoan(String loai_taikhoan) {
        this.loai_taikhoan = loai_taikhoan;
    }

  
    public String getMa_sv() {
        return ma_sv;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public String getSo_dt() {
        return so_dt;
    }

    public String getEmail() {
        return email;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public String getSo_thich() {
        return so_thich;
    }

    public String getDan_toc() {
        return dan_toc;
    }

    public String getTon_giao() {
        return ton_giao;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public String getMa_nguoi_dung() {
        return ma_nguoi_dung;
    }

    public String getMa_nganh() {
        return ma_nganh;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.ma_sv);
        hash = 83 * hash + Objects.hashCode(this.ho_ten);
        hash = 83 * hash + Objects.hashCode(this.so_dt);
        hash = 83 * hash + Objects.hashCode(this.email);
        hash = 83 * hash + Objects.hashCode(this.dia_chi);
        hash = 83 * hash + Objects.hashCode(this.so_thich);
        hash = 83 * hash + Objects.hashCode(this.dan_toc);
        hash = 83 * hash + Objects.hashCode(this.ton_giao);
        hash = 83 * hash + Objects.hashCode(this.gioi_tinh);
        hash = 83 * hash + Objects.hashCode(this.ma_nguoi_dung);
        hash = 83 * hash + Objects.hashCode(this.ma_nganh);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;
        if (!Objects.equals(this.ma_sv, other.ma_sv)) {
            return false;
        }
        if (!Objects.equals(this.ho_ten, other.ho_ten)) {
            return false;
        }
        if (!Objects.equals(this.so_dt, other.so_dt)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.dia_chi, other.dia_chi)) {
            return false;
        }
        if (!Objects.equals(this.so_thich, other.so_thich)) {
            return false;
        }
        if (!Objects.equals(this.dan_toc, other.dan_toc)) {
            return false;
        }
        if (!Objects.equals(this.ton_giao, other.ton_giao)) {
            return false;
        }
        if (!Objects.equals(this.gioi_tinh, other.gioi_tinh)) {
            return false;
        }
        if (!Objects.equals(this.ma_nguoi_dung, other.ma_nguoi_dung)) {
            return false;
        }
        if (!Objects.equals(this.ma_nganh, other.ma_nganh)) {
            return false;
        }
        return true;
    }

    public void setMa_sv(String ma_sv) {
        this.ma_sv = ma_sv;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public void setSo_dt(String so_dt) {
        this.so_dt = so_dt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public void setSo_thich(String so_thich) {
        this.so_thich = so_thich;
    }

    public void setDan_toc(String dan_toc) {
        this.dan_toc = dan_toc;
    }

    public void setTon_giao(String ton_giao) {
        this.ton_giao = ton_giao;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public void setMa_nguoi_dung(String ma_nguoi_dung) {
        this.ma_nguoi_dung = ma_nguoi_dung;
    }

    public void setMa_nganh(String ma_nganh) {
        this.ma_nganh = ma_nganh;
    }

   

}
