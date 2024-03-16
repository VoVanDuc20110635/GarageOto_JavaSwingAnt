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
public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private LocalDateTime ngaySinh;
    private String gioiTinh;
    private String cccd;
    private String chucDanh;
    private String soDienThoai;
    private LocalDateTime ngayBatDauLamViec;
    private String maBangLuong;
    private String maChiNhanh;
    private String taoBoiMaNhanVien;
    private String maLichLamViec;

    public NhanVien(String maNhanVien, String tenNhanVien, LocalDateTime ngaySinh, String gioiTinh, String cccd, String chucDanh, String soDienThoai, LocalDateTime ngayBatDauLamViec, String maBangLuong, String maChiNhanh, String taoBoiMaNhanVien, String maLichLamViec) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cccd = cccd;
        this.chucDanh = chucDanh;
        this.soDienThoai = soDienThoai;
        this.ngayBatDauLamViec = ngayBatDauLamViec;
        this.maBangLuong = maBangLuong;
        this.maChiNhanh = maChiNhanh;
        this.taoBoiMaNhanVien = taoBoiMaNhanVien;
        this.maLichLamViec = maLichLamViec;
    }

    public NhanVien() {
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public LocalDateTime getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDateTime ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public LocalDateTime getNgayBatDauLamViec() {
        return ngayBatDauLamViec;
    }

    public void setNgayBatDauLamViec(LocalDateTime ngayBatDauLamViec) {
        this.ngayBatDauLamViec = ngayBatDauLamViec;
    }

    public String getMaBangLuong() {
        return maBangLuong;
    }

    public void setMaBangLuong(String maBangLuong) {
        this.maBangLuong = maBangLuong;
    }

    public String getMaChiNhanh() {
        return maChiNhanh;
    }

    public void setMaChiNhanh(String maChiNhanh) {
        this.maChiNhanh = maChiNhanh;
    }

    public String getTaoBoiMaNhanVien() {
        return taoBoiMaNhanVien;
    }

    public void setTaoBoiMaNhanVien(String taoBoiMaNhanVien) {
        this.taoBoiMaNhanVien = taoBoiMaNhanVien;
    }

    public String getMaLichLamViec() {
        return maLichLamViec;
    }

    public void setMaLichLamViec(String maLichLamViec) {
        this.maLichLamViec = maLichLamViec;
    }
    
    
}
