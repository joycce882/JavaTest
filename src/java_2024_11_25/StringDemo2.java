package java_2024_11_25;
// TODO: 2024/11/25 键入一个字符串，在控制台进行遍历

import java.util.Formattable;
import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串，我将遍历该字符串！");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (char c:chars){
            System.out.print(c+"\t");
        }
    }
}
