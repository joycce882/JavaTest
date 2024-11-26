package JAVA2024_11_22;

import java.util.Arrays;
import java.util.Random;

// TODO: 2024/11/22 生成10个1~100之间的随机数存入数组
// 1) 求所有数据的和  2)求所有数据的平均数  3)统计有多少个数据小于平均数
public class annry_p_2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        int sum = 0,count = 0;
        double mean_value = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1,101);
            sum +=arr[i];
        }
        mean_value = (double)sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mean_value)
                count++;
        }
        System.out.println("所有的数据为："+ Arrays.toString(arr)+"\n所有数据的和为："+sum+"\n所有" +
                "数据的平均数为："+mean_value+"\n" +
                "比平均数小的有"+count+"个");
    }
}
