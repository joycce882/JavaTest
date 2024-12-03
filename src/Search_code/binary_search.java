package Search_code;

// TODO: 2024/12/3 二分查找要求数组是有序的
public class binary_search {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5,7,8};
        int number = 1;
        System.out.println(binarySearch(arr1,number));

    }
    public static int binarySearch(int[] arr,int number){
        int min=0;
        int max=arr.length-1;
        while (true){
            if (min > max)
                return -1;
            // 改变mid的值
            int mid = (min + max) / 2;
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
