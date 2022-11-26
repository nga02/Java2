package ParallelApplication;

public class ParallelApplication_PH26840 {

    public static void main(String[] args) throws InterruptedException {
        SoNguyenTo nt = new SoNguyenTo();
        SoLe le = new SoLe();
        Thread t1 = new Thread(nt);
        Thread t2 = new Thread(le);
        System.out.println("Bắt đầu");
        t1.start();
        t2.start();
    }
}
