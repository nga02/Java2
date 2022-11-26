package DocGhiTho;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GhiTho implements Runnable {

    @Override
    public void run() {
        try {
            FileWriter fw = new FileWriter("Poem_A.txt");
            fw.write("Tuỳ cung yến\n"
                    + "Yến ngữ như thương cựu quốc xuân,\n"
                    + "Cung hoa nhất lạc toàn thành trần.\n"
                    + "Tự tòng nhất bế phong quang hậu,\n"
                    + "Kỷ độ phi lai bất kiến nhân.");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(GhiTho.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
