package JAVA_2024_11_23;
// TODO: 2024/11/23 进行抽奖，共有{2,588,888,1000,10000}金额，抽奖随机且不重复

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lottery_fun {
    public static void main(String[] args) {
        System.out.println("我要开大了");
        System.out.println("请你在键盘输入0或者1，其中1代表抽奖，0代表退出");
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 588, 888, 1000, 10000));
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag){
            int choujiang_flag = sc.nextInt();
            if(choujiang_flag==1){
                int number = choujiang(arr);
                if (number==-1){
                    flag = false;
                    System.out.println("抽奖失败，奖池为空");
                }
                else
                    System.out.println("您抽中的金额为："+number);
            }
            else
                flag = false;

        }

    }
    public static int choujiang(ArrayList<Integer> arr){
        if (arr.size()==0)
            return -1;
        else
        {
            Random r = new Random();
            int index = r.nextInt(arr.size());
            int number = arr.get(index);
            arr.remove(index);
            return number;
        }
    }
}
