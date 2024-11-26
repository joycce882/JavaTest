package java_2024_11_24;

import java.util.ArrayList;

public class GrilFriendBackAgeAndObject {
    public int count;
    public double age;
    ArrayList<GrilFriend> g_list = new ArrayList<>();


    public GrilFriendBackAgeAndObject() {
    }


    public GrilFriendBackAgeAndObject(int count, double age, ArrayList<GrilFriend> g_list) {
        this.count = count;
        this.age = age;
        this.g_list = g_list;
    }

    /**
     * 获取
     * @return age
     */
    public double getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(double age) {
        this.age = age;
    }

    /**
     * 获取
     * @return g_list
     */
    public ArrayList<GrilFriend> getG_list() {
        return g_list;
    }

    /**
     * 设置
     * @param g_list
     */
    public void setG_list(ArrayList<GrilFriend> g_list) {
        this.g_list = g_list;
    }


    /**
     * 获取
     * @return count
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }
}
