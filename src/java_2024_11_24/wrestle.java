package java_2024_11_24;

public class wrestle {
    private String name;
    private  int blood;


    public wrestle() {
    }

    public wrestle(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String toString() {
        return "wrestle{name = " + name + ", blood = " + blood + "}";
    }

    // TODO: 2024/11/24 这里返回一个数组，number代表是随机的攻击数值，wr.blood代表的是剩余的blood
    public int[] attack(wrestle wr, int number){
        int[] blood_box = new int[2];
        wr.blood -=number;
        blood_box[0] = number;
        blood_box[1] = wr.blood;
        return blood_box;
    }
}
