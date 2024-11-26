package java_2024_11_25;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_count = 0;
        int s_c_count = 0;
        int b_c_count=0;
        System.out.println("请输入一个字符串，我将统计大写字母小写字母和数字出现的次数！");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (char c:chars){
            if (c>=48 && c<=57){
                number_count++;
            } else if (c >= 65 && c <= 90) {
                b_c_count++;
            } else if (c>=97 && c <=122) {
                s_c_count++;
            }
        }
        System.out.println("这串字符串大写字母有"+b_c_count+"个，小写字母有"+s_c_count+"个，数字有"+number_count+"个");
    }
}
