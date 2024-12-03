package polymorphicDemo;

public class DemoTest {
    public static void main(String[] args) {
        Person s = new Student();
        s.setName("zhangsan");
        s.setAge(18);
        Person t = new Teacher();
        t.setName("hfoaihf");
        t.setAge(49);
        s.show();
        t.show();
    }
}
