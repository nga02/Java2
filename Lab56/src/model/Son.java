package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.logging.Logger;

public class Son implements Serializable{

    private Long maSon;
    private String tenSon;
    private String phanLoai;
    private String thuongHieu;
    private String mauSac;
    private BigDecimal donGia;

    public Son() {
    }

    public Son(Long maSon, String tenSon, String phanLoai, String thuongHieu, String mauSac, BigDecimal donGia) {
        this.maSon = maSon;
        this.tenSon = tenSon;
        this.phanLoai = phanLoai;
        this.thuongHieu = thuongHieu;
        this.mauSac = mauSac;
        this.donGia = donGia;
    }

    public Long getMaSon() {
        return maSon;
    }

    public void setMaSon(Long maSon) {
        this.maSon = maSon;
    }

    public String getTenSon() {
        return tenSon;
    }

    public void setTenSon(String tenSon) {
        this.tenSon = tenSon;
    }

    public String getPhanLoai() {
        return phanLoai;
    }

    public void setPhanLoai(String phanLoai) {
        this.phanLoai = phanLoai;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Son{" + "maSon=" + maSon + ", tenSon=" + tenSon + ", phanLoai=" + phanLoai + ", thuongHieu=" + thuongHieu + ", mauSac=" + mauSac + ", donGia=" + donGia + '}';
    }
    
    
}
