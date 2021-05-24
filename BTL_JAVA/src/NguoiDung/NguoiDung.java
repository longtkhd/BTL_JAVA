/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguoiDung;

/**
 *
 * @author Ngan
 */
public class NguoiDung {
    private  String maNguoidung,tenTaikhoan,tenNguoiDung,matKhau,loaiTaiKhoan;

    public NguoiDung() {
    }
    public NguoiDung(String maNguoidung) {
        this.maNguoidung = maNguoidung;
    }

    public NguoiDung(String maNguoidung, String tenTaikhoan, String tenNguoiDung, String matKhau, String loaiTaiKhoan) {
        this.maNguoidung = maNguoidung;
        this.tenTaikhoan = tenTaikhoan;
        this.tenNguoiDung = tenNguoiDung;
        this.matKhau = matKhau;
        this.loaiTaiKhoan = loaiTaiKhoan;
    }

    public String getMaNguoidung() {
        return maNguoidung;
    }

    public String getTenTaikhoan() {
        return tenTaikhoan;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getLoaiTaiKhoan() {
        return loaiTaiKhoan;
    }

    public void setMaNguoidung(String maNguoidung) {
        this.maNguoidung = maNguoidung;
    }

    public void setTenTaikhoan(String tenTaikhoan) {
        this.tenTaikhoan = tenTaikhoan;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setLoaiTaiKhoan(String loaiTaiKhoan) {
        this.loaiTaiKhoan = loaiTaiKhoan;
    }
    
}
