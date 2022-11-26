package model;

import java.io.Serializable;

public class LapTop implements Serializable {

    private Long maSP;
    private String name;
    private Integer sluong;
    private int trangThai;
    private String thuongHieu;
    private double donGia;

    public LapTop() {
    }

    public LapTop(Long maSP, String name, Integer sluong, int trangThai, String thuongHieu, double donGia) {
        this.maSP = maSP;
        this.name = name;
        this.sluong = sluong;
        this.trangThai = trangThai;
        this.thuongHieu = thuongHieu;
        this.donGia = donGia;
    }

    public Long getMaSP() {
        return maSP;
    }

    public void setMaSP(Long maSP) {
        this.maSP = maSP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSluong() {
        return sluong;
    }

    public void setSluong(Integer sluong) {
        this.sluong = sluong;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "LapTop{" + "maSP=" + maSP + ", name=" + name + ", sluong=" + sluong + ", trangThai=" + trangThai + ", thuongHieu=" + thuongHieu + ", donGia=" + donGia + '}';
    }

}
