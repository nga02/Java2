package service;

import java.util.List;
import java.util.ArrayList;
import model.LapTop;

public class QLLapTop {

    private List<LapTop> qlds = new ArrayList<>();

    public QLLapTop() {
        qlds.add(new LapTop(1L, "SP 1", 50, 0, "Dell", 22000));
        qlds.add(new LapTop(2L, "SP 2", 60, 1, "Mac", 27000));
        qlds.add(new LapTop(3L, "SP 3", 45, 0, "Asus", 20000));
        qlds.add(new LapTop(4L, "SP 4", 55, 1, "Dell", 18000));
        qlds.add(new LapTop(5L, "SP 5", 40, 0, "HP", 21000));
        
    }

    public void insert(LapTop lt) {
        qlds.add(lt);
    }

    public void update(int viTri, LapTop lt) {
        qlds.set(viTri, lt);
    }

    public void delete(int viTri) {
        qlds.remove(viTri);
    }

    public List<LapTop> getList() {
        return qlds;
    }

    public void setList(List<LapTop> ds) {
        qlds = ds;
    }
    public LapTop getById(int viTri){
        return qlds.get(viTri);
    }
}
