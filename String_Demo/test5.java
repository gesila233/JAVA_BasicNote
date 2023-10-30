package String_Demo;

import java.util.Scanner;

//遍历字符串
public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1 = sc.next();

        //遍历
        for (int i = 0; i < s1.length(); i++) {
            //i依次表示字符串的每一个索引
            char c = s1.charAt(i);
            System.out.println(c);
        }
    }
}
