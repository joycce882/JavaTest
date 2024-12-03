package Sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        System.out.println(Arrays.toString(quick_one(arr)));

    }
    public static int[] quick_one(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int basenumber = arr[0];

        while (start != end) {
            while (true) {
                if (arr[end] < basenumber || end <=start)
                    break;
                end--;
            }
            while (true) {
                if (arr[start] > basenumber || end <=start)
                    break;
                start++;
            }
            // 找到两个数字后进行交换位置
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[start];
        arr[start] = basenumber;
        arr[0] = temp;
        return arr;
    }
}
