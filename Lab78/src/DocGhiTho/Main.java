
package DocGhiTho;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        GhiTho w = new GhiTho();
        DocTho r = new DocTho();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(r);
        t1.start();
        t1.join();
        t2.start();
    }
    
}
