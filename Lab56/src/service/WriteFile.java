package service;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import model.Son;

public class WriteFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        

        List<Son> son = new ArrayList<>();
        son.add(new Son(1L, "Christian Louboutin", "Son lì", "Dior", "Cam tươi", BigDecimal.valueOf(970)));
        son.add(new Son(2L, "Rouge Coco Bloom 134", "Son dưỡng", "Chanel", "Đỏ nâu", BigDecimal.valueOf(650)));
        son.add(new Son(3L, "Baume A Lèvres Lip", "Son nước", "Gucci", "Hồng Nude", BigDecimal.valueOf(890)));
        son.add(new Son(4L, "Rouge Allure 99", "Son dưỡng", "Chanel", "Đỏ rượu", BigDecimal.valueOf(590)));
        son.add(new Son(5L, "Rouge Star Lipstick", "Son kem", "Dior", "Nâu đỏ", BigDecimal.valueOf(899)));
        son.add(new Son(6L, "Nude 514 Virginia", "Son nước", "Gucci", "Cam san hô", BigDecimal.valueOf(760)));
        son.add(new Son(7L, "Rouge 999 Matte", "Son dưỡng", "Dior", "Hồng đậm", BigDecimal.valueOf(575)));
        son.add(new Son(8L, "Rouge Allure Camelia", "Son lì", "Chanel", "Vàng Gold", BigDecimal.valueOf(825)));
        son.add(new Son(9L, "Limited 25 Goldie", "Son kem", "Gucci", "Hồng phấn", BigDecimal.valueOf(790)));
        son.add(new Son(10L, "Addict Lip", "Son lì", "Dior", "Đỏ Cherry", BigDecimal.valueOf(850)));
        
         try {
            FileWriter fw = new FileWriter("w_ph26840.txt");           
            for (Son s : son) {
                fw.write(s.toString()+"\n");            
            }
            fw.close();
        } catch (Exception ex) {

        }       
    }
}
