package JAVA2024_11_22;

// TODO: 2024/11/22 逢七必过游戏
public class fengqiguo {
    public static void main(String[] args) {
        int i = 0;
        for (;i<=100;i++){
            if (i % 10 != 7 && i / 10 % 10 != 7 && i % 7 != 0){
                System.out.println(i);
            }
            else
                System.out.println("过");
        }

    }
}
