package Sort;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 23, 25, 2, 167, 24, 7, 9, 574, 25, 25};
        System.out.println(Arrays.toString(bubblesort(arr)));
        
    }
    public static int[] bubblesort(int[] arr){
        if (arr==null)
            System.out.println("数组为空，已退出");
        if (arr != null) {
            for (int j = 0; j < arr.length-1; j++) {
                for (int i = 0; i < arr.length - j - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
        }
        return arr;
    }
}
