package abstract_instanceDemo;

public class BasketPlayer extends Person{


    public BasketPlayer(String name, int age) {
        super(name,age);
    }

    @Override
    public void work() {
        System.out.println("篮球运动员打篮球");
    }

}
