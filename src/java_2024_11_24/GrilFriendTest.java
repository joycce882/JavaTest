package java_2024_11_24;

import java.util.ArrayList;
import java.util.Scanner;

public class GrilFriendTest {
    public static void main(String[] args) {
        ArrayList<GrilFriend> g_list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag)
        {
            System.out.println("是否需要添加女友，1继续添加，0直接退出：");
            int choice = sc.nextInt();
            if (choice==1){
                sc.nextLine();
                System.out.println("请输入女友姓名：");
                String name = sc.nextLine();
                System.out.println("请输入女友年龄：");
                int age = sc.nextInt();
                sc.nextLine(); //清除缓存
                System.out.println("请输入女友的性别：");
                String gender = sc.nextLine();
                System.out.println("请输入女友的爱好：");
                String hobit = sc.nextLine();
                if (name==null || age==0 || gender==null || hobit==null)
                    break;
                GrilFriend g = new GrilFriend(name, age, gender, hobit);
                g_list.add(g);
            } else if (choice==0) {
                flag = false;
            }
        }
        GrilFriendBackAgeAndObject gao = calc_aver_age(g_list);
        System.out.println("您的这几个女友的平均年龄为："+gao.age+"\n没有超过平均年龄的有"+gao.count+"个\n他们的信息分别为：");
        for (GrilFriend g_left : gao.g_list){
            System.out.println(g_left.getName()+"\t"+g_left.getAge()+"\t"+g_left.getGender()+
                    "\t"+g_left.getHobit()+"\t");
        }

    }
    public static GrilFriendBackAgeAndObject calc_aver_age(ArrayList<GrilFriend> array){
        int count=0;
        int sum=0;
        ArrayList<GrilFriend> g_low_average_age = new ArrayList<>();
        GrilFriendBackAgeAndObject gao = new GrilFriendBackAgeAndObject();
        for(GrilFriend g:array){
            count++;
            sum +=g.getAge();
        }
        double average_age = (double) sum/count;
        int low_age_count = 0;
        for (GrilFriend g:array){
            if (g.getAge() < average_age){
                low_age_count++;
                g_low_average_age.add(g);
            }
        }
        gao.setCount(low_age_count);
        gao.setAge(average_age);
        gao.setG_list(g_low_average_age);
        return gao;
    }
}
