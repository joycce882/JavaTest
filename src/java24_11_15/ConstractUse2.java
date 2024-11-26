package java24_11_15;

public class ConstractUse2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("老八",3);
        Dog dog2 = new Dog("老八",3);
        System.out.println(dog1.comto(dog2));

    }
}

class Dog extends Animal{
    String name;
    int age;

    public Dog(String name,int age)
    {
        super(name,age);
    }

    boolean comto(Dog dog){
        return this.name.equals(dog.name) && this.age==dog.age;
    }
}
