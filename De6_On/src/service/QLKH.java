package service;

import java.util.List;
import java.util.ArrayList;
import model.Nguoi;

public class QLKH {

    private List<Nguoi> lst = new ArrayList<>();

    public QLKH() {
        lst.add(new Nguoi("VIP", 1, "Le Nga", "nga@gmail.com"));
        lst.add(new Nguoi("Bình thường", 2, "Le Nga", "nga@gmail.com"));
        lst.add(new Nguoi("VIP", 3, "Le Nga", "nga@gmail.com"));
        lst.add(new Nguoi("Bình thường", 4, "Le Nga", "nga@gmail.com"));
    }

    public void insert(Nguoi n) {
        lst.add(n);
    }

    public void delete(int viTri) {
        lst.remove(viTri);
    }

    public List<Nguoi> getList() {
        return lst;
    }

    public void setList(List<Nguoi> ds) {
        lst = ds;
    }
}
