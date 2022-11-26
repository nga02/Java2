
package model;

import java.io.Serializable;

public class KhachHang implements Serializable{
    private String name;
    private int gioitinh;
    private int tuoi;

    public KhachHang() {
    }

    public KhachHang(String name, int gioitinh, int tuoi) {
        this.name = name;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String getTrangThai(){
        if(tuoi>=18){
            return "Thành niên";
        }else{
            return "Vị thành niên";
        }
    }
    @Override
    public String toString() {
        return "KhachHang{" + "name=" + name + ", gioitinh=" + gioitinh + ", tuoi=" + tuoi + '}';
    }
    
    
}
