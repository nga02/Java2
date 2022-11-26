package DocGhiTho;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DocTho implements Runnable {

    @Override
    public void run() {
        File filename = new File("Poem_B.txt");
        try {
            FileReader input = new FileReader(filename);
            BufferedReader br = new BufferedReader(input);
            String text;
            while ((text = br.readLine())!= null) {
                System.out.println(text);

            }
            br.close();
        } catch (Exception ex) {
            Logger.getLogger(DocTho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
