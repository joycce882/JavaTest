package abstract_instanceDemo;

public class PingPlayer extends Person implements Study_English {

    public PingPlayer(String name,int age){super(name,age);}
    @Override
    public void work() {
        System.out.println("乒乓球运动员在打球");
    }

    @Override
    public void study_english() {
        System.out.println("乒乓球运动员在学习英语");

    }
}
