package service;

import java.util.List;
import java.util.ArrayList;
import model.SinhVien;

public class QLSinhVien {

    private List<SinhVien> lst = new ArrayList<>();

    public QLSinhVien() {
        lst.add(new SinhVien(1L, "Le Nga A", "20/4/2003", 0, 18, "UD", 9000, "nga@gmail.com"));
        lst.add(new SinhVien(2L, "Le Nga B", "21/4/2003", 1, 15, "UD", 8000, "nga@gmail.com"));
        lst.add(new SinhVien(3L, "Le Nga C", "10/4/2003", 0, 19, "UD", 8500, "nga@gmail.com"));
        lst.add(new SinhVien(4L, "Le Nga D", "25/4/2003", 1, 18, "UD", 7500, "nga@gmail.com"));
    }

    public void insert(SinhVien sv) {
        lst.add(sv);
    }

    public void update(int viTri, SinhVien sv) {
        lst.set(viTri, sv);
    }

    public void delete(int viTri) {
        lst.remove(viTri);
    }

    public List<SinhVien> getList() {
        return lst;
    }

    public void setList(List<SinhVien> ds) {
        lst = ds;
    }
}
