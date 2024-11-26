package JAVA2024_11_22;

import java.util.Arrays;

public class arrnytest2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr1[i] = i+1;
            if (arr1[i] % 2 ==0)
                arr1[i] /=2;
            else
                arr1[i] *=2;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
