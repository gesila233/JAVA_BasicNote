package array_demo;

//4.复制
/*需求：定义一个方法 copyOfRange(int[] arr,int from,int to)
功能：将数组arr中从索引from（包含from）开始，到索引to结束（不包含to）的元素复制到新数组中，将数组返回
 */
public class test4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] new_arr = copyOfRange(arr, 4, 8);
        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i]+" ");
        }
    }

    //方法
    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] copyArr = new int[to-from];
        for (int i = from,k=0; i < to; i++,k++) {
            copyArr[k] = arr[i];
        }
        return copyArr;
    }
}
