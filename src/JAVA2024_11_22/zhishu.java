package JAVA2024_11_22;

import java.util.Scanner;

// TODO: 2024/11/22 判断是否是质数
public class zhishu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean flag = true;
        // TODO: 2024/11/22 方法1 循环次数（number-1）/2
//        for (int i =2;i<(number-1) / 2;i++ ){
//            if(number % i ==0){
//                flag = false;
//                break;
//            }
//        }
        // TODO: 2024/11/22 方法2 循环次数sqrt
        // 9 * 9 = 81
//        9.1 * 9.1 >81  8.9 * 8.9 < 81
        // 一个数可以由一个小于等于其平方根的数和一个大于等于其平方根的数相乘而得，
        // 可以简化计算次数
        for (int i =2;i<= (int)Math.sqrt(number);i++ ){
            if(number % i ==0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(number+"是一个质数");
        }
        else
            System.out.println(number+"不是一个质数");
    }
}
