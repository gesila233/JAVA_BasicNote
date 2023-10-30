package String_Demo;

//手机号屏蔽
/*
把手机号中间四位屏蔽掉，如
123 4567 8900
123 **** 8900
 */
public class test10 {
    public static void main(String[] args) {
        String number = "18823459876";
        //获取前四位
        String start = number.substring(0, 3);
        String end = number.substring(7);
        String result = start + "****" + end;
        System.out.println(result);
    }
}
