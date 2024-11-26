package JAVA_2024_11_23;

import java.util.Objects;
import java.util.Scanner;

// TODO: 2024/11/23 机票价格按照淡旺季，头等舱和经济舱收费，输入机票原价，月份和头等舱或经济舱。
// TODO: 2024/11/23 按照如下规则计算机票价格，5~10月头等舱9折，经济舱8.5折，淡季头等舱7折，经济舱6.5折
public class planepricetest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double origin_price = sc.nextDouble();
        System.out.println("请输入乘坐月份：");
        int month = sc.nextInt();
        sc.nextLine(); // 清理缓冲区的换行符 否则直接跳过了space的输入
        System.out.println("请输入舱位：");
        String space = sc.nextLine();
        double final_price = price_calc(origin_price,month,space);
        System.out.println("最后计算得到的价格为："+final_price);
    }
    public static double price_calc(double origin_price,int month,String space){
        if (month >=5 && month <=10){
            if (Objects.equals(space, "头等舱")){
                return origin_price * 0.9;
            }
            else
                return origin_price * 0.85;
        } else if ((month >=1 && month <5) || (month >=11 && month <=12)) {
            if (Objects.equals(space, "头等舱")){
                return origin_price * 0.7;
            }
            else
                return origin_price * 6.5;
        }
        else
            return -1;
    }
}
