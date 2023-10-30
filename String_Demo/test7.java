package String_Demo;
//拼接字符串
/*
定义一个方法，把int数组中的数据按指定的格式拼成一个字符串返回
调用该方法，在控制台输出结果

例如，int[] arr = {1,2,3};
输出 [1,2,3]
 */
public class test7 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(arrToString(array));
    }

    //方法
    public static String arrToString(int[] arr){
        if (arr == null){
            return "";
        }

        if (arr.length ==0){   //int[] arr = new int[0];   长度为0的数组，不能存数据，没有意义
            return "[]";
        }

        String str1 ="";
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1){
                str1 = str1 + arr[i] + ",";
            }else {
                str1 = str1 + arr[i];
            }
        }
        str1 = "[" + str1 + "]";
        return str1;
    }
}
