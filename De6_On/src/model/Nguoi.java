package model;

import java.io.Serializable;

public class Nguoi implements Serializable{

    private String loai;
    private int maKH;
    private String tenKH;
    private String email;
    public Nguoi() {
    }

    public Nguoi(String loai, int maKH, String tenKH, String email) {
        this.loai = loai;
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.email = email;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "loai=" + loai + ", maKH=" + maKH + ", tenKH=" + tenKH + ", email=" + email + '}';
    }

    

}
