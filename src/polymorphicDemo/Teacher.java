package polymorphicDemo;

public class Teacher extends Person {
    public void show(){
        System.out.println("老师的姓名为："+this.getName()+"，年龄为："+this.getAge());
    }
}
