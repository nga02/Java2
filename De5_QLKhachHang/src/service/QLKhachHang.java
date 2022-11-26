package service;

import java.util.List;
import java.util.ArrayList;
import model.KhachHang;

public class QLKhachHang {

    private List<KhachHang> lst = new ArrayList<>();

    public QLKhachHang() {
        lst.add(new KhachHang("Le Thi Nga", 0, 19));
        lst.add(new KhachHang("Le Thi Nga A", 1, 17));
        lst.add(new KhachHang("Le Thi Nga B", 0, 18));
        lst.add(new KhachHang("Le Thi Nga C", 1, 16));
    }

    public void insert(KhachHang kh) {
        lst.add(kh);
    }

    public void update(int viTri, KhachHang kh) {
        lst.set(viTri, kh);
    }

    public void delete(int viTri) {
        lst.remove(viTri);
    }

    public List<KhachHang> getList() {
        return lst;
    }

    public void setList(List<KhachHang> ds) {
        lst = ds;
    }

    public KhachHang getById(int viTri) {
        return lst.get(viTri);
    }
}
