package JAVA2024_11_22;

import java.util.Scanner;

// TODO: 2024/11/22 给定两个整数，被除数和除数，将两个数相除，不适用乘法除法和%
public class chufa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int beichushu = sc.nextInt();
        int chushu = sc.nextInt();
        int[] zhi = new int[2];
        zhi = chufa_fu(beichushu,chushu);
        System.out.println("这两个数相除得到的商为："+zhi[0]+"，余数为："+zhi[1]);
    }

    public static int[] chufa_fu(int number,int chushu){
        int shang = 0;
        int yushu = 0;
        while (number - chushu >= 0){
            number -=chushu;
            shang++;
        }
        yushu = number;
        int[] zhi = new int[2];
        zhi[0]=shang;
        zhi[1] = yushu;
        return zhi;
    }
}
