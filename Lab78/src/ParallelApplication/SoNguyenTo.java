package ParallelApplication;

import static java.lang.Math.sqrt;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SoNguyenTo implements Runnable {

    private boolean checkPrimeNumber(int number) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                cnt++;
            }
        }
        if (cnt == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
        for (int i = 7; i <=788;i++) {
            if (checkPrimeNumber(i)) {
                System.out.println("Số nguyên tố: "+i);
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(SoLe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
