package java24_11_15.Person;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Tom",20,"Doctor",'男');
        Person person2 = new Person("Tom",20,"Doctor",'男');

        System.out.println(person1.equals(person1));
    }
}
