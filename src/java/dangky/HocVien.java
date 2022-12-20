/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dangky;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class HocVien {
    private String maHV;
    private String hoTenHV;
    private Date ngaySinh;
    private String diaChi;
    private String gioiTinh;
    private String soDt;
    private String maLop;
    private LopHoc lopHoc;

    public HocVien() {
    }

    public HocVien(String maHV, String hoTenHV, Date ngaySinh, String diaChi, String gioiTinh, String soDt, String maLop) {
        this.maHV = maHV;
        this.hoTenHV = hoTenHV;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.soDt = soDt;
        this.maLop = maLop;
    }

    public HocVien(String maHV, String hoTenHV, Date ngaySinh, String diaChi, String gioiTinh, String soDienThoai) {
        this.maHV = maHV;
        this.hoTenHV = hoTenHV;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.soDt = soDienThoai;
    }

    public HocVien(String maHV, String tenHV, String soDtHV) {
        this.maHV = maHV;
        this.hoTenHV = tenHV;
        this.soDt = soDtHV;
    }

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getHoTenHV() {
        return hoTenHV;
    }

    public void setHoTenHV(String hoTenHV) {
        this.hoTenHV = hoTenHV;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDt() {
        return soDt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
    
    
}
