package java24_11_15.classtest;

public class ClassMethod {
    public static void main(String[] args) {
        Person02 person1 = new Person02("小b");
        person1.payfee(3000);
        Person02 person2 = new Person02("小s");
        person2.payfee(5000);
        Person02 person3 = new Person02("小m");
        person3.payfee(4900);

        System.out.println(person2.Count());


    }
}

class Person02{
    private String name;
    public static double fee;
    public static double countfee;

    public Person02(String name){
        this.name = name;
    }
    public void payfee(double fee){
        countfee+=fee;
    }
    public static double Count(){
        return countfee;
    }

}
