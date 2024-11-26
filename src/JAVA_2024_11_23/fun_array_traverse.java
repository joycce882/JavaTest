package JAVA_2024_11_23;

import java.util.Random;
import java.util.Scanner;

// TODO: 2024/11/23 设计一个方法用于数组遍历
public class fun_array_traverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] arr1 = new int[sc.nextInt()];
//        array_traverse(arr1);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(1, 11);
        }
        array_traverse(arr1);

    }
    public static void array_traverse(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
