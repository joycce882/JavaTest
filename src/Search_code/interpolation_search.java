package Search_code;

// 插值查找是对二分查找做的改进，可以让mid更加的偏向于查找的值
// mid =(max-min)* (key-min) / (max-min) + min
public class interpolation_search {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int number = 3;
        System.out.println(inter_search(arr1,number));

    }
    public static int inter_search(int[] arr,int number){
        int min=0;
        int max=arr.length-1;
        while (true){
            if (min > max)
                return -1;
            int mid = (max-min)*(number-arr[min]) / (arr[max]-arr[min]) + min;
            if(arr[mid] > number)
            {
                max = mid - 1;
            }
            else if(arr[mid] < number)
                min = mid + 1;  //说明number大于处在中间的数
            else
                return mid;  //找到了
        }
    }
}
