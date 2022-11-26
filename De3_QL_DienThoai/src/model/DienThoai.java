package model;

import java.util.logging.Logger;

public class DienThoai {

    private String tenSP;
    private String hang;
    private double gia;

    public DienThoai() {
    }

    public DienThoai(String tenSP, String hang, double gia) {
        this.tenSP = tenSP;
        this.hang = hang;
        this.gia = gia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public String getStatus() {
        if (gia >= 1000) {
            return "Tốt";
        }
        return "Bình thường";
    }

    @Override
    public String toString() {
        return "DienThoai{" + "tenSP=" + tenSP + ", hang=" + hang + ", gia=" + gia + '}';
    }
    
}
