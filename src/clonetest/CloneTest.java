package clonetest;


import java_2024_11_24.Student;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student(1,"张三",18);
        Object c1 = s1.clone();

        System.out.println(s1.toString());
        System.out.println(c1.toString());

    }
}
