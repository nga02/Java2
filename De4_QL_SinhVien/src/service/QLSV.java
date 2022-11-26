package service;

import java.util.List;
import java.util.ArrayList;
import model.SinhVien;

public class QLSV {

    List<SinhVien> qlsv = new ArrayList<>();

    public QLSV() {
        qlsv.add(new SinhVien("MA", "CNTT", 5));
        qlsv.add(new SinhVien("AN", "UD", 9));
        qlsv.add(new SinhVien("BN", "TKĐH", 4));
        qlsv.add(new SinhVien("CN", "TMĐT", 8));

    }

    public void insert(SinhVien sv) {
        qlsv.add(sv);
    }

    public void update(int viTri, SinhVien sv) {
        qlsv.set(viTri, sv);
    }

    public void delete(int viTri) {
        qlsv.remove(viTri);
    }

    public List<SinhVien> getList() {
        return qlsv;
    }

    public void setList(List<SinhVien> ds) {
        qlsv = ds;
    }
}
