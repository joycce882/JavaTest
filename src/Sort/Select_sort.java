package Sort;

import java.util.Arrays;

// TODO: 2024/12/3 与冒泡排序有异曲同工之妙，冒泡排序是从后面最开始有序的，选择排序是从最前面开始有序的
public class Select_sort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 23, 25, 2, 167, 24, 7, 9, 574, 25, 25};
        int[] arr2 = {3, 1, 4, 5, 2};
        int[] arr_result = sel_sort(arr2);
        System.out.println(Arrays.toString(arr_result));
    }
    public static int[] sel_sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
