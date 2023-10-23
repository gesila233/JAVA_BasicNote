package StringBuilder_Demo;
//链式编程
public class test1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        /*sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        返回值是StringBuilder，且写的行数多，不好
        */

        sb.append("aaa").append("bbb").append("ccc");
        System.out.println(sb);

    }
}
