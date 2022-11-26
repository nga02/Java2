package model;

import java.io.Serializable;

public class Sach implements Serializable{

    private String maSach;
    private String tenSach;
    private Integer soLuong;
    private String theLoai;
    private double donGia;
    private int trangThai;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, Integer soLuong, String theLoai, double donGia, int trangThai) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.theLoai = theLoai;
        this.donGia = donGia;
        this.trangThai = trangThai;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", soLuong=" + soLuong + ", theLoai=" + theLoai + ", donGia=" + donGia + ", trangThai=" + trangThai + '}';
    }
    
  
}
