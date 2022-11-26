package sercive;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import model.Son;

public class QLSon {

    private List<Son> dsSon = new ArrayList<>();

    

    public QLSon() {
        dsSon.add(new Son(1L, "Christian Louboutin", "Son lì", "Dior", "Cam tươi", BigDecimal.valueOf(970)));
        dsSon.add(new Son(2L, "Rouge Coco Bloom 134", "Son dưỡng", "Chanel", "Đỏ nâu", BigDecimal.valueOf(650)));
        dsSon.add(new Son(3L, "Baume A Lèvres Lip", "Son nước", "Gucci", "Hồng Nude", BigDecimal.valueOf(890)));
        dsSon.add(new Son(4L, "Baume A Lèvres Lip", "Son nước", "Gucci", "Hồng Nude", BigDecimal.valueOf(780)));
        dsSon.add(new Son(5L, "Baume A Lèvres Lip", "Son nước", "Gucci", "Hồng Nude", BigDecimal.valueOf(950)));
    
        
    }

//Thêm sản phẩm mới
    public void Add(Son spMoi) {
        dsSon.add(spMoi);
    }
//Cập nhật sản phẩm theo 

    public void Update(int Vitri, Son s) {
        dsSon.set(Vitri, s);
    }
//Xoá sp theo dòng

    public void Delete(int Vitri) {
        dsSon.remove(Vitri);
    }
//truyền vào tham số là 1 list

    public void setList(List<Son> ds) {
        dsSon = ds;

    }
//kiểu dữ liệu là list

    public List<Son> getList() {
        return dsSon;
    }
//gọi ra vị trí 

    public Son getById(int ViTri) {
        return dsSon.get(ViTri);
    }

}
