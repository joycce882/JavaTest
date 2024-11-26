package java_2024_11_24;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<phone> p_list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag)
        {
            System.out.println("是否需要添加手机，1继续添加，0直接退出：");
            int choice = sc.nextInt();
            if (choice==1){
                sc.nextLine();
                System.out.println("请输入手机品牌：");
                String brand = sc.nextLine();
                System.out.println("请输入手机价格：");
                double price = sc.nextDouble();
                System.out.println("请输入手机的颜色：");
                sc.nextLine(); //清除缓存
                String color = sc.nextLine();
                if (brand==null || price==0 || color==null)
                    break;
                phone p = new phone(brand, price, color);
                p_list.add(p);
            } else if (choice==0) {
                flag = false;
            }
        }
        System.out.println("您存储的手机有"+p_list.size()+"个"+"它们分别为：");
        for (phone p:p_list){
            System.out.println(p.getBrand()+"\t"+p.getPrice()+"\t"+p.getColor()+"\t");
        }

    }
}
