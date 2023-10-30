package String_Demo;
//身份证信息查看
/*
7~14位：出生年月日
17位：性别（奇男偶女）
450111197205054878

人物信息为：
出生年月日：xxxx年x月x日
性别为：男/女
 */
public class test11 {
    public static void main(String[] args) {
        String id="450111197205054878";
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        String gender = id.substring(16,17);

        System.out.println("人物信息为：");
        System.out.println("出生年月日："+year+"年"+month+"月"+day+"日");

//        字符串转数字
//        int i = Integer.parseInt(String);

        int num = Integer.parseInt(gender);
        if (num % 2==0){
            System.out.println("性别为：女");
        }else {
            System.out.println("性别为：男");
        }
    }
}
