package Sort;

import java.util.Arrays;

public class insert_sort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 3};
        System.out.println(Arrays.toString(insertsort(arr)));

    }
    public static int[] insertsort(int[] arr){
        int startindex = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                startindex = i+1;
                break;
            }
        }
        // 找到数组中前startindex个有序的元素
        for (int i = startindex; i < arr.length; i++) {

            // 记录当前插入数据的索引
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }
}
