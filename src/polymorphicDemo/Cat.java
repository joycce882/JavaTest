package polymorphicDemo;

public class Cat extends Anmial{
    private String color;
    private int age;


    public Cat() {
    }

    public Cat(String color, int age) {
        this.color = color;
        this.age = age;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Cat{color = " + color + ", age = " + age + "}";
    }

    @Override
    void eat(String something) {
        System.out.println("猫正在吃"+something);
    }

//    public void eat(String something){
//        System.out.println("猫正在吃"+something);
//    }
    public void catch_mouse(){
        System.out.println("猫抓老鼠");
    }
}
