/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dangky;

import java.security.Timestamp;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class LopHoc {
    private String maLop;
    private String tenLop;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private int soLuongToiThieu;
    private int soLuongToiData;
    private String maKH;
    private KhoaHoc khoaHoc;

    public LopHoc() {
    }

    public LopHoc(String maLop, String tenLop, Date ngayBatDau, Date ngayKetThuc, int slToiThieu, int slToiDa, String maKH) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.soLuongToiThieu = slToiThieu;
        this.soLuongToiData = slToiDa;
        this.maKH = maKH;
    }

    public LopHoc(String maLop, String tenLop) {
        this.maLop = maLop;
        this.tenLop = tenLop;
    }

    public KhoaHoc getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(KhoaHoc khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
    
    

    public int getSoLuongToiThieu() {
        return soLuongToiThieu;
    }

    public void setSoLuongToiThieu(int soLuongToiThieu) {
        this.soLuongToiThieu = soLuongToiThieu;
    }

    public int getSoLuongToiData() {
        return soLuongToiData;
    }

    public void setSoLuongToiData(int soLuongToiData) {
        this.soLuongToiData = soLuongToiData;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
    
    
}
