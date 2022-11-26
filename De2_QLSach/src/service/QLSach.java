package service;

import java.util.ArrayList;
import java.util.List;
import model.Sach;

public class QLSach {

    private List<Sach> qlds = new ArrayList<>();

    public QLSach() {
        qlds.add(new Sach("S01","BJGuy nmbi", 45,"Truyện tranh",300,1));
        qlds.add(new Sach("S02","BJGuy nmbi", 45,"Tiểu thuyết",300,0));
        qlds.add(new Sach("S03","BJGuy nmbi", 45,"Truyện tranh",300,1));
        qlds.add(new Sach("S04","BJGuy nmbi", 45,"Tiểu thuyết",300,0));
        
        
    }

    public void insert(Sach s) {
        qlds.add(s);
    }

    public void update(int viTri, Sach s) {
        qlds.set(viTri, s);
    }

    public void delete(int viTri) {
        qlds.remove(viTri);
    }

    public List<Sach> getList() {
        return qlds;
    }

    public void setList(List<Sach> ql) {
        qlds = ql;
    }
}
