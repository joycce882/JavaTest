package JAVA_2024_11_23;

import java.util.Arrays;
import java.util.Random;

// TODO: 2024/11/23 实现随机5位的验证码，前四位是大写字母或者小写字母，最后一位是数字
public class yanzhengma {
    public static void main(String[] args) {
        //1.先实现前四位 2.再实现数字 3.进行拼接
        Random r = new Random();
        char[] cha = new char[52];
        for (int i = 0; i < cha.length; i++) {
            if (i <26){
                cha[i] = (char)(97+i);
            }
            else
                cha[i] = (char)(65+i-26);
        }
//        System.out.print(Arrays.toString(cha));
        // 实现字母随机
        String result = "";
        for (int i = 0; i < 4; i++) {
            result += cha[r.nextInt(cha.length)];
        }
//        System.out.println(result);
        // 加上数字完成
        result +=r.nextInt(10);
        System.out.println(result);
    }
}
