
package model;

import java.io.Serializable;

public class SinhVien implements Serializable{
    private String name;
    private String boMon;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String name, String boMon, double diem) {
        this.name = name;
        this.boMon = boMon;
        this.diem = diem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoMon() {
        return boMon;
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    public String getStatus(){
        if(diem>=5){
            return "Đỗ";
        }else{
            return "Trượt";
        }
    }
    @Override
    public String toString() {
        return "SinhVien{" + "name=" + name + ", boMon=" + boMon + ", diem=" + diem + '}';
    }
    
}
