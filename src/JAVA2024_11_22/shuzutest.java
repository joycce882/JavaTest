package JAVA2024_11_22;

// TODO: 2024/11/22 判断能被3整除的数字有几个

public class shuzutest {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int count=0;
        for (int i = 0; i < 10; i++) {
            arr1[i] = i+1;
            if (arr1[i] % 3 ==0)
                count++;
        }
        System.out.println("能被3整除的数字有"+count+"个。");

    }
}
