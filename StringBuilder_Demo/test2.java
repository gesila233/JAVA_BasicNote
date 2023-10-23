package StringBuilder_Demo;

import java.util.Scanner;

//对称字符串
/*
键盘接收一个字符串
程序判断该字符串是否对称，并在控制台打印是或不是
 */
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();

        //思路：对称，即 正着 和 反着 是一样的
        //反转字符串

        /*StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.reverse();
        String str2 = sb.toString();
         */

        String result = new StringBuilder().append(str1).reverse().toString();

        //比较

        if (result.equals(str1)){
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }
    }
}
