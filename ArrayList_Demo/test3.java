package ArrayList_Demo;
//创建集合
//自定义类型
import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1=new Student("zhangsan",21);
        Student s2=new Student("lisi",24);

        //添加元素
        list.add(s1);
        list.add(s2);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
