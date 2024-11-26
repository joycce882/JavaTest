package java_2024_11_25;

public class StringBuliderTest {
    public static void main(String[] args) {
        // Attention：此时的StringBuilder只是一个容器
        StringBuilder sb = new StringBuilder();
        String s1  = "Hello,";
        String s3 = "World!";
        sb.append(s1);
        sb.append(s3);
        String s = sb.toString(); // 将sb中的内容转化为String类型的
        System.out.println(s);

    }
}
