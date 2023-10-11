package study_2023_10_11;

public class UserTest {
    public static void main(String[] args) {
        //调用空参构造
        //User u = new User();

        User s = new User("张三",123,123,"1234@qq.com",'女',80);
        System.out.println(s.getAge());
        System.out.println(s.getCheck_key());
    }
}
