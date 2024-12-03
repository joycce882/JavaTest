package java_2024_12_3;

public class Regex_Demo {
    public static void main(String[] args) {
        // 这里判断手机号的正确与否
        // 手机号应该是11位 第一位永远为1 第二位不能是2 3--11位可以为任意数字
        String regex_1 = "1[3-9]\\d{9}";
        System.out.println("13893869626".matches(regex_1));

        // 判断座机号码
        // 分为三部分
        String regex_2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("0931-8927392".matches(regex_2));
    }
}
