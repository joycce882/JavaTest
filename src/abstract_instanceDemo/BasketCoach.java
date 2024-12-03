package abstract_instanceDemo;

public class BasketCoach extends Person{

    public  BasketCoach(String name,int age){
        super(name, age);}
    @Override
    public void work() {
        System.out.println("篮球教练在教篮球");
    }
}
