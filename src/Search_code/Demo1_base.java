package Search_code;

public class Demo1_base {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int number= 8;
        System.out.println(basesearch(arr,number));

    }
    public static boolean basesearch(int[] arr,int number){
        for (int i: arr){
            if (number == i)
                return true;
        }
        return false;
    }
}
