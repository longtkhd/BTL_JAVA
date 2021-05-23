/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuongTrinhDaoTao;

/**
 *
 * @author Dell
 */
public class ChuongTrinhDaoTao {
    private String ma_so,ma_nganh,khoa_hoc,ten_chuong_trinh,trinh_do_dao_tao,hinh_thuc_dao_tao,tenng_nganh;

    public ChuongTrinhDaoTao(String ma_so, String ma_nganh, String khoa_hoc, String ten_chuong_trinh, String trinh_do_dao_tao, String hinh_thuc_dao_tao, String tenng_nganh) {
        this.ma_so = ma_so;
        this.ma_nganh = ma_nganh;
        this.khoa_hoc = khoa_hoc;
        this.ten_chuong_trinh = ten_chuong_trinh;
        this.trinh_do_dao_tao = trinh_do_dao_tao;
        this.hinh_thuc_dao_tao = hinh_thuc_dao_tao;
        this.tenng_nganh = tenng_nganh;
    }
    public ChuongTrinhDaoTao(String ma_nganh)
    {
        this.ma_nganh=ma_nganh;
    }

    public String getMa_so() {
        return ma_so;
    }

    public String getMa_nganh() {
        return ma_nganh;
    }

    public String getKhoa_hoc() {
        return khoa_hoc;
    }

    public String getTen_chuong_trinh() {
        return ten_chuong_trinh;
    }

    public String getTrinh_do_dao_tao() {
        return trinh_do_dao_tao;
    }

    public String getHinh_thuc_dao_tao() {
        return hinh_thuc_dao_tao;
    }

    public String getTenng_nganh() {
        return tenng_nganh;
    }

    public void setMa_so(String ma_so) {
        this.ma_so = ma_so;
    }

    public void setMa_nganh(String ma_nganh) {
        this.ma_nganh = ma_nganh;
    }

    public void setKhoa_hoc(String khoa_hoc) {
        this.khoa_hoc = khoa_hoc;
    }

    public void setTen_chuong_trinh(String ten_chuong_trinh) {
        this.ten_chuong_trinh = ten_chuong_trinh;
    }

    public void setTrinh_do_dao_tao(String trinh_do_dao_tao) {
        this.trinh_do_dao_tao = trinh_do_dao_tao;
    }

    public void setHinh_thuc_dao_tao(String hinh_thuc_dao_tao) {
        this.hinh_thuc_dao_tao = hinh_thuc_dao_tao;
    }

    public void setTenng_nganh(String tenng_nganh) {
        this.tenng_nganh = tenng_nganh;
    }

   
}
