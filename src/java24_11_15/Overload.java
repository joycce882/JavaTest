package java24_11_15;

public class Overload {
    public static void main(String[] args) {
        num num1 = new num();
        num1.add(2,3,4,5,6);
    }
}
class num{
    void add(int...nums){
        int res=0;
        for (int num : nums) {
            res += num;
        }
        System.out.println(res);
    }
}
