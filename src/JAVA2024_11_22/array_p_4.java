package JAVA2024_11_22;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// TODO: 2024/11/22 有一个数组，随机存入元素，要求打乱数据顺序
public class array_p_4 {
    public static void main(String[] args) {
        System.out.println("请输入随机数组中的元素数量：");
        Scanner sc = new Scanner(System.in);
        int number_count = sc.nextInt();
        Random r = new Random();
        int[] arr = new int[number_count];
        for (int i = 0; i < number_count; i++) {
            arr[i] = r.nextInt(1,11);
        }
        // 打印数组
        System.out.println("之前的数组为："+ Arrays.toString(arr));
        // 打乱数组
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            int random_number;
            do {
                random_number = r.nextInt(1,number_count+1 );
            }while (random_number == i);
            arr[i] = arr[random_number];
            arr[random_number] = temp;
        }
        System.out.println("交换完成之后的数组为："+Arrays.toString(arr));
    }
}
