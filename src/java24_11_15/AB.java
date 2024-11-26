package java24_11_15;

import java.sql.SQLOutput;

public class AB {
    public static void main(String[] args) {
        B b = new B();
    }
}
class A{
    public A() {
        System.out.println("a");
    }
}
class B extends A{
    String name;
    public B(){
        this("b");
        System.out.println("B");

    }
    public B(String name){
        this.name = name;
        System.out.println(name);
    }
}