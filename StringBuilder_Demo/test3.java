package StringBuilder_Demo;
//拼接字符串
/*
定义一个方法，把int数组中的数据按指定的格式拼成一个字符串返回
调用该方法，在控制台输出结果

例如，int[] arr = {1,2,3};
输出 [1,2,3]
 */
public class test3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = arrToString(arr);
        System.out.println(s);
    }

    //方法
    public static String arrToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
