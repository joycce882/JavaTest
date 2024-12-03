package waitandnoity;

public class waitandnoitytest {
    public static void main(String[] args) {
        cook c = new cook();
        fooder f = new fooder();
        c.setName("厨师");
        f.setName("吃货");
        c.start();
        f.start();
    }
}
