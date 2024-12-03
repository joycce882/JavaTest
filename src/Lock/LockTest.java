package Lock;

public class LockTest {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        MyThread m3 = new MyThread();
        m1.setName("平台1");
        m2.setName("平台2");
        m3.setName("平台3");
        m1.start();
        m2.start();
        m3.start();
    }
}
