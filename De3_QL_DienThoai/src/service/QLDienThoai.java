package service;

import java.util.ArrayList;
import java.util.List;
import model.DienThoai;

public class QLDienThoai {

    List<DienThoai> lst = new ArrayList<>();

    public QLDienThoai() {
        lst.add(new DienThoai("SP1", "SamSung", 20000));
        lst.add(new DienThoai("SP2", "Iphone", 500));
        lst.add(new DienThoai("SP3", "SamSung", 30000));
    }

    public void insert(DienThoai dt) {
        lst.add(dt);
    }

    public void update(int index, DienThoai dt) {
        lst.set(index, dt);
    }

    public void delete(int index) {
        lst.remove(index);
    }

    public List<DienThoai> getList() {
        return lst;
    }

    public void setList(List<DienThoai> ds) {
        lst = ds;
    }
    
}
