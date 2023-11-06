package ArrayList_Demo;

import java.util.ArrayList;
import java.util.Scanner;

//判断对象是否存在
/*
main方法中定义一个集合，存入三个用户对象
用户属性为 id,username,password
定义一个方法，根据id查找对应的用户信息
如果存在，返回true
如果不存在，返回false
 */
public class test5 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            User u = new User();
            System.out.println("请输入id");
            int id = sc.nextInt();
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            u.setId(id);
            u.setUsername(username);
            u.setPassword(password);

            list.add(u);
        }

        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            System.out.println(u.getId()+","+u.getUsername()+","+u.getPassword());
        }

        boolean result = search(list,2);
        System.out.println(result);
    }

    public static boolean search(ArrayList<User> list,int id) {
        for (int i = 0; i < list.size(); i++) {
            /*
            这个 或者下面的
            if(list.get(i).getId() == id){return true;}
            */
            User u = new User();
            u = list.get(i);
            if (u.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
