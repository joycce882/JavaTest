package java24_11_15;

import java.util.zip.DeflaterOutputStream;

public class test {
    public static void main(String[] args) {
        Animal cat = new Cat("小猫",3);
        Animal dog = new Dog("小狗",4);
        System.out.println(cat.getName()+"\t"+cat.getAge());
        System.out.println(dog.getName()+"\t"+dog.getAge());

    }
}
