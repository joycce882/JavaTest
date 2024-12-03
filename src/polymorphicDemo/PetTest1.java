package polymorphicDemo;

// TODO: 2024/11/27 Pet类的test方法 这个是没有父类的测试方法

public class PetTest1 {

    public static void main(String[] args) {
        Person p = new Person("老王", 89);
        Dog g = new Dog("黄色", 18);
        p.keep_pet(g,"shi");
        p.keep_pet(new Cat("黄色",4),"老鼠");

    }
}
