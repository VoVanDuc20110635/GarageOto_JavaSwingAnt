/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.Model;

import java.time.LocalDateTime;

/**
 *
 * @author WINDOWS 10
 */
public class PhieuTraHang {
    private String maPhieuTraHang;
    private LocalDateTime thoiGian;
    private double canTraKhach;
    private double daTraKhach;
    private String maHoaDon;
    private String maKhachHang;
    private String maNhanVien;

    public PhieuTraHang(String maPhieuTraHang, LocalDateTime thoiGian, double canTraKhach, double daTraKhach, String maHoaDon, String maKhachHang, String maNhanVien) {
        this.maPhieuTraHang = maPhieuTraHang;
        this.thoiGian = thoiGian;
        this.canTraKhach = canTraKhach;
        this.daTraKhach = daTraKhach;
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
    }

    public PhieuTraHang() {
    }

    public String getMaPhieuTraHang() {
        return maPhieuTraHang;
    }

    public void setMaPhieuTraHang(String maPhieuTraHang) {
        this.maPhieuTraHang = maPhieuTraHang;
    }

    public LocalDateTime getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(LocalDateTime thoiGian) {
        this.thoiGian = thoiGian;
    }

    public double getCanTraKhach() {
        return canTraKhach;
    }

    public void setCanTraKhach(double canTraKhach) {
        this.canTraKhach = canTraKhach;
    }

    public double getDaTraKhach() {
        return daTraKhach;
    }

    public void setDaTraKhach(double daTraKhach) {
        this.daTraKhach = daTraKhach;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    
    
}
