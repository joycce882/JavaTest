package thread_method;

public class threadtest {
    public static void main(String[] args) throws InterruptedException {
//        Mythread m1 = new Mythread("购物袋");
//        Mythread m2 = new Mythread("直升机");
//        m1.start();
//        m2.start();
        Mytread2 m3 = new Mytread2("空可");
        Mytread2 m4 = new Mytread2("波音");
        m3.start();
        Mytread2.sleep(10000);
        m4.start();
    }
}
