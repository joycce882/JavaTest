package polymorphicDemo;


public class Dog extends Anmial{
    private String color;
    private int age;


    public Dog() {
    }

    public Dog(String color, int age) {
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
        return "Dog{color = " + color + ", age = " + age + "}";
    }

//    public void eat(String something){
//        System.out.println("狗正在吃"+something);
//    }
    public void watch_home(){
        System.out.println("狗看家");
    }

    @Override
    void eat(String something) {
        System.out.println("狗正在吃"+something);
    }
}
