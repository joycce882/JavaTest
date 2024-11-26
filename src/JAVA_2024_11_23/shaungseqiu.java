package JAVA_2024_11_23;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// TODO: 2024/11/23 双色球系统，6个红球和1个篮球组成，红球1--33选择，蓝球1--16选择
public class shaungseqiu {
    public static void main(String[] args) {
        int[] origin = generate_number();
        System.out.println("中奖的双色球为："+Arrays.toString(origin));
        Scanner sc = new Scanner(System.in);
        int[] arr_own = new int[7];
        boolean flag = true;
        while (flag) {
            System.out.println("请输入是否进行抽奖，1代表进行，2代表退出！");
            int sign = sc.nextInt();
            if (sign == 1) {
                System.out.println("请输入您的号码，以空格隔开：");
                sc.nextLine();
                String input = sc.nextLine();
                String[] numbers = input.split(" ");
                int i = 0;
                for (String number : numbers) {
                    arr_own[i] = Integer.parseInt(number);
                    i++;
                }
                System.out.println("您的号码为：" + Arrays.toString(arr_own));

                System.out.println("开始了！！");
                System.out.println("你的获奖金额为：" + lottery_account(arr_own,origin));

            }
            else if (sign==0) {
                flag=false;
            }

        }
    }

        public static int[] generate_number () {
            Random r = new Random();
            int[] arr = new int[7];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = r.nextInt(1, 34);
            }
            arr[arr.length - 1] = r.nextInt(1, 17);
            System.out.println(arr);
            return arr;
        }

        public static int lottery_account ( int[] array, int[] arr){
            int red_cout = 0;
            int blue_cout = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == arr[i]) {
                    red_cout++;
                }
            }
            if (array[array.length - 1] == arr[arr.length - 1]) {
                blue_cout++;
            }
            if (red_cout == 0 && blue_cout == 0) {
                return -1;
            } else if ((red_cout == 0 && blue_cout == 1) || (red_cout == 1 && blue_cout == 1) ||
                    (red_cout == 2 && blue_cout == 1))
                return 5;
            else if ((red_cout == 3 && blue_cout == 1) || (red_cout == 4 && blue_cout == 0))
                return 10;
            else if ((red_cout == 4 && blue_cout == 1) || (red_cout == 5 && blue_cout == 0))
                return 200;
            else if (red_cout == 5 && blue_cout == 1)
                return 3000;
            else if (red_cout == 6 && blue_cout == 0)
                return 5000000;
            else if (red_cout == 6 && blue_cout == 1)
                return 100000000;
            return 0;

        }


}
