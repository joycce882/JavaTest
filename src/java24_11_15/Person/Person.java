package java24_11_15.Person;

public class Person {
    private String name;
    private int age;
    private String job;
    private char sex;
    public Person(String name,int age,String job,char sex){
        this.name = name;
        this.age = age;
        this.job = job;
        this.sex = sex;
    }
    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person person = (Person) obj;
            if (this.name.equals(person.name) && this.age == person.age && this.job.equals(person.job) && this.sex == person.sex)
                return true;
        }

        return false;
    }



}
