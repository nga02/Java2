
package ParallelApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SoLe implements Runnable{

    @Override
    public void run() {
        for (int i = 8; i < 888; i++) {
            if( i % 2==1){
                System.out.println("Số lẻ:"+i );
                try {
                    Thread.sleep(700);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SoLe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    
}
