package String_Demo;

import java.util.Scanner;

//统计字符次数
/*
录入一个字符串
分别统计大写、小写、数字出现的次数
 */
public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符");
        String str1 = sc.next();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if(c >= 'a' && c <= 'z'){
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <='9') {      //注意这儿是 '0' '9',不是0 9。因为char类型变量参与计算时会自动提升为int，
                                                   // 查询ascII码表。如果写0 9，查的是ascII为0 9的东西
                numberCount++;
            }
        }

        System.out.println("大写字符出现的次数为"+bigCount);
        System.out.println("小写字符出现的次数为"+smallCount);
        System.out.println("数字出现的次数为"+numberCount);
    }

}
