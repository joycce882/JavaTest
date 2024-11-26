package java_2024_11_24;

import com.sun.source.tree.WhileLoopTree;

import java.net.http.HttpRequest;
import java.util.Random;
import java.util.Scanner;

// TODO: 2024/11/24 创建了一个文字版的摔跤游戏，谁血量先为0谁就输
public class wrestle_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        wrestle wr1 = new wrestle("乔峰", 100);
        wrestle wr2 = new wrestle("段誉", 100);
        boolean flag = true;
        while (flag){
            System.out.println("请输入你的英雄，0代表退出，1代表乔峰，2代表段誉：");
            int hero = sc.nextInt();
            int attack_blood = r.nextInt(1,11);
            if (hero == 0){
                flag = false;
            }
            else if (hero == 1) {
                int[] blood_box;
                blood_box = wr1.attack(wr2,attack_blood);
                if (blood_box[1] <=0){
                    System.out.println("段誉已经输了哈哈哈");
                    flag = false;
                }
                else
                {
                    System.out.println("乔峰攻击了段誉，攻击的血量为："+blood_box[0]+"段誉剩余的" +
                            "血量为："+blood_box[1]);
                }
            }
            else if (hero == 2) {
                int[] blood_box;
                blood_box = wr2.attack(wr1,attack_blood);
                if (blood_box[1] <=0){
                    System.out.println("乔峰已经输了哈哈哈");
                    flag = false;
                }
                else
                {
                    System.out.println("段誉攻击了乔峰，攻击的血量为："+blood_box[0]+"乔峰剩余的" +
                            "血量为："+blood_box[1]);
                }
            }

        }
    }


}
