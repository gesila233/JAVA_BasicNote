package String_Demo;

import java.util.Scanner;

//已知正确的用户名和密码
//模拟用户登录
//共三次机会，登录之后有提示
public class test4 {
    public static void main(String[] args) {
        //正确的用户名和密码
        String rightUserName = "zhangsan";
        String rightKey = "123abc";

            //模拟登录
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<3 ; i++) {
            System.out.println("请输入用户名");
            String userName = sc.next();

            System.out.println("请输入密码");
            String key = sc.next();

            //比较
            if (userName.equals(rightUserName) && key.equals(rightKey)){
                System.out.println("登录成功");
                break;
            }
            else {
                if (i==2){
                    System.out.println("账户" +rightUserName+"被锁定，请联系客服xxx");
                }
                System.out.println("登录失败，用户名或密码有误");
                System.out.println("您还剩下" + (2-i) +"次机会");
            }
        }
    }
}
