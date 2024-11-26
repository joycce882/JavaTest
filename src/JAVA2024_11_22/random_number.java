package JAVA2024_11_22;
import java.sql.SQLOutput;
import java.util.Random;

// TODO: 2024/11/22 random可以创建随机数
public class random_number {
    public static void main(String[] args) {
        Random r = new Random();

        // 下面的范围是从0开始的，从number-1结束;
        int number = r.nextInt(7,16);
        System.out.println(number);
    }


}
