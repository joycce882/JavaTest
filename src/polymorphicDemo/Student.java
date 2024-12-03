package polymorphicDemo;

public class Student extends Person{

    public void show(){
        System.out.println("学生的姓名为："+this.getName()+"，年龄为："+this.getAge());
    }

}
