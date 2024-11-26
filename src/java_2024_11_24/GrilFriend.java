package java_2024_11_24;

public class GrilFriend {
    private String name;
    private int age;
    private String gender;
    private String hobit;

    public GrilFriend() {
    }

    public GrilFriend(String name, int age, String gender, String hobit) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobit = hobit;
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

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return hobit
     */
    public String getHobit() {
        return hobit;
    }

    /**
     * 设置
     * @param hobit
     */
    public void setHobit(String hobit) {
        this.hobit = hobit;
    }

    public String toString() {
        return "GrilFriend{name = " + name + ", age = " + age + ", gender = " + gender + ", hobit = " + hobit + "}";
    }
}
