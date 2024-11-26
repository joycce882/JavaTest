package JAVA_2024_11_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// TODO: 2024/11/23 加密数字 先得到每位数，每位数加5，再对10取余，最后将所有的数字反转得到新数
public class encrypt_number {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码：");
        int number = sc.nextInt();
        String number_string = String.valueOf(Math.abs(number));
        for (int i = 0; i < number_string.length(); i++) {
            arr1.add(Integer.parseInt(String.valueOf(number_string.charAt(i))) );
        }
        // 以上得到的初始的密码，接下来进行加密；
        int[] mid = new int[arr1.size()];
        for (int i = 0; i < arr1.size(); i++) {
            mid[i] = (arr1.get(i) + 5) % 10;
        }
        int[] end_arr = new int[mid.length];
        for (int i = 0, j = mid.length-1; i < mid.length; i++,j--) {
            end_arr[i] = mid[j];
        }
        System.out.println("最后加密的结果为："+ Arrays.toString(end_arr));
    }
}
