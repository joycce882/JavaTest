package JAVA_2024_11_23;
// TODO: 2024/11/23 复制全部数组

import java.util.Arrays;

public class array_copyall {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] new_arr = copy_array(arr);
        System.out.println(Arrays.toString(new_arr));


    }
    public static int[] copy_array(int[] array){
        int[] array_copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array_copy[i] = array[i];
        }
        return array_copy;
    }
}
