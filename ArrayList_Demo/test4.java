package ArrayList_Demo;

import java.util.ArrayList;
import java.util.Scanner;

//学生数据来自键盘录入
public class test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        //键盘录入并添加
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student stu = new Student();
            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age =sc.nextInt();

            stu.setName(name);
            stu.setAge(age);

            list.add(stu);
        }

        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
