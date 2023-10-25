package array_demo;

//2.最大值
//设计一个方法求数组的最大值，并将最大值返回

public class test2 {
    public static void main(String[] args) {
        int[] array = {-1,1,2,3,4,5};
        int result = array_Max(array);
        System.out.println(result);
    }


    public static int array_Max(int[] arr){
        int max_arr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max_arr < arr[i]){
                max_arr = arr[i];
            }
        }
        return max_arr;
    }

}
