package java24_11_15;

public class ConstractUse {
    public static void main(String[] args) {
        Person2 person1 = new Person2("Tom",18);
        Person2 person2 = new Person2("Jack");
        System.out.println(person1.name+"\t"+person1.age);
        System.out.println(person2.name+"\t"+person2.age);
    }
}
class Person2{
    String name;
    int age;
    public Person2(String name,int age){
        this.name = name;
        this.age = age;
    }

    public  Person2(String name){
        this.name = name;
    }

}
