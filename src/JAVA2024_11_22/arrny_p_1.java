package JAVA2024_11_22;

// TODO: 2024/11/22 已知数组元素为{33,5,22,44,55}，找出最大值并打印
public class arrny_p_1 {
    public static void main(String[] args) {
        int[] arr1 = {33,5,22,44,55};
        int max_number = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (max_number < arr1[i])
                max_number = arr1[i];
        }
        System.out.println("最大值为："+max_number);
    }
}
