package array_demo;

//3.存在
//定义一个方法，判断数组中某一个数是否存在，将结果返回给调用处
public class test3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 23, 45, 66};
        boolean result = if_exist(arr, 66);
        System.out.println(result);
    }


    //方法
    public static boolean if_exist(int[] arr, int elem) {
        boolean exist;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                return true;
            }
        }
        return false;
    }

}
