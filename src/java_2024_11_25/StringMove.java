package java_2024_11_25;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class StringMove {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串，我们将对其进行交换，每一次的交换结果都会列出来");
        Scanner sc = new Scanner(System.in);
        String s_begin = sc.nextLine();
        System.out.println("请输入一个数字，要求我们如果在调整后依旧回不到原字符串的情况下多少次停止");
        int number = sc.nextInt();
        String s = s_begin;
        for (int i=0;i<number;i++) {
            String S_After_Move = string_move(s);
            System.out.println("首位挪到末尾之后的结果为："+S_After_Move);
            s = S_After_Move;
            if (S_After_Move.equals(s_begin)){
                System.out.println("匹配成功，在经过"+(i+1)+"之后可以回到初始的字符串");
                break;
            }
            if ((i+1)==number){
                System.out.println("匹配失败，在经过"+(i+1)+"次之后不能返回初始的字符串");
            }
        }


    }
    public static String string_move(String s){
        char[] c = s.toCharArray();
        return swap_char_b_e(c);
    }

    // 这里不是交换，直接把第一个char加到最后一个
    public static String swap_char_b_e(char[] c){
        StringJoiner sj = new StringJoiner("");
        char temp = c[0];
        for (int i = 1; i < c.length; i++) {
            sj.add(String.valueOf(c[i]));
        }
        sj.add(String.valueOf(c[0]));
        return sj.toString();
    }
}
