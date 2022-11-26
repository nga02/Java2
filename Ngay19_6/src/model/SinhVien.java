
package model;

import java.io.Serializable;

public class SinhVien implements Serializable{

    private Long maSV;
    private String tenSV, ngaySing;
    private int gioiTinh;
    private int tuoi;
    private String monHoc;
    private double hocPhi;
    private String email;

    public SinhVien() {
    }

    public SinhVien(Long maSV, String tenSV, String ngaySing, int gioiTinh, int tuoi, String monHoc, double hocPhi, String email) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySing = ngaySing;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.monHoc = monHoc;
        this.hocPhi = hocPhi;
        this.email = email;
    }

    public Long getMaSV() {
        return maSV;
    }

    public void setMaSV(Long maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getNgaySing() {
        return ngaySing;
    }

    public void setNgaySing(String ngaySing) {
        this.ngaySing = ngaySing;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", ngaySing=" + ngaySing + ", gioiTinh=" + gioiTinh + ", tuoi=" + tuoi + ", monHoc=" + monHoc + ", hocPhi=" + hocPhi + ", email=" + email + '}';
    }

}
