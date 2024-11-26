package java24_11_15;

public class Animal {
    private String name;
    private int age;
    public Animal(String name,int age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
