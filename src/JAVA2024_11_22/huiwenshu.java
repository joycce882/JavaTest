package JAVA2024_11_22;

import java.util.Scanner;

// TODO: 2024/11/22 回文数的联系
public class huiwenshu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int number = sc.nextInt();
            int reserve_number = reserve(number);
            if (number==reserve_number && number !=0){
                System.out.println(number+"这个数字是回文数");
            }
            else if (number==0) {
                break;

            } else
                System.out.println("这个数字不是回文数");

        }
    }
    public static int reserve(int number){
        int reserve=0;
        while (number !=0){
            int dight=number %10;
            if (reserve > Integer.MAX_VALUE /10){
                System.out.println("溢出");
                return 0;
            }
            reserve = reserve * 10 + dight;
            number /=10;
        }
        return reserve;
    }
}
