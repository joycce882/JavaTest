package abstract_instanceDemo;

public class PingCoach extends Person implements Study_English{

    public PingCoach(String name,int age){
        super(name,age);
    }
    @Override
    public void work() {
        System.out.println("乒乓球教练在教球");
    }

    @Override
    public void study_english() {
        System.out.println("乒乓球教练在学习英语");
    }
}
