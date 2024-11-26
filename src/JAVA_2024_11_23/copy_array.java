package JAVA_2024_11_23;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

// TODO: 2024/11/23 定义一个方法copyarray(int[] arr,int from,int to),将数组索引from到
// TODO: 2024/11/23 to的元素复制到新数组中，将新数组返回。
public class copy_array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr1_copy = array_copyrange(arr1,0,2);
        System.out.println(Arrays.toString(arr1_copy));

    }
    @Contract(pure = true)
    public static int @NotNull [] array_copyrange(int[] arr1, int from, int to){
        int[] arr_copy = new int[to-from+1];
        for (int i = from, j = 0; i <= to && j <=to-from; i++,j++) {
            arr_copy[j] = arr1[i];
        }
        return  arr_copy;
    }
}

