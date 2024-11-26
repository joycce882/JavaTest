package JAVA2024_11_22;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

// TODO: 2024/11/22 定义一个数组，存入1,2,3,4,5.按照要求交换索引对应的元素
public class array_p_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println("调换前的数组为："+ Arrays.toString(arr));
        int first_index = sc.nextInt();
        int second_index = sc.nextInt();
        int temp = 0;
        if (first_index < 0 || first_index >= arr.length || second_index < 0 || second_index >= arr.length)
            System.out.println("越界");
        else {
            temp = arr[first_index];
            arr[first_index] = arr[second_index];
            arr[second_index] = temp;
        }
        System.out.println("调换的数组为："+ Arrays.toString(arr));
    }
}
