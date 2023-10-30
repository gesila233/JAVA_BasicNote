package String_Demo;
//比较
public class test3 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1==s2);

        //基本数据类型：比内容
        //引用数据类型：比地址值

        //比较两个对象中的内容是否相等
        boolean res1 = s1.equals(s2);
        System.out.println(res1);

        String s3 = "ABC";
        boolean res2=s1.equalsIgnoreCase(s3);
        System.out.println(res2);
    }
}
