package JAVA_2024_11_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// TODO: 2024/11/23 判断101--200之间有多少个素数，并且输出所有的素数
public class zhishufind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始的数字：");
        int begin = sc.nextInt();
        System.out.println("请输入结束的数字：");
        int end = sc.nextInt();
        array_number_back arr = cala(begin,end);
        System.out.println("全部的数组为：");
        System.out.println(arr.array);
        System.out.println("素数的个数为：");
        System.out.println(arr.number);

    }
    public static array_number_back cala(int begin,int end){
        if (begin==1)
            begin=2;
        int count=0;
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = begin; i <= end; i++) {
            boolean flag = true;
            for (int j = 2;j<= Math.sqrt(i);j++)
            {
                if (i % j ==0)
                {
                    flag = false;
                    break;
                }
            }
            if (flag){
                count++;
                arr1.add(i);
            }
        }
        return new array_number_back(arr1,count);

    }
}
class array_number_back{
    ArrayList<Integer> array;
    int number;
    public array_number_back(ArrayList<Integer> array, int number){
        this.array = array;
        this.number = number;
    }
}
