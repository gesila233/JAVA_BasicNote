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
public class test12 {
    public static void main(String[] args) {
        String id = "450111197205054878";
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        char gender = id.charAt(16);

        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");

        //利用ASCII码表进行转换
//        '0'->48
//        '1'->49
//        '2'->50
//        ...
//        'x'- 48  == x
//        字符在运算里，会自动转为整数

        int num = gender - 48;
        if (num % 2 == 0) {
            System.out.println("性别为：女");
        } else {
            System.out.println("性别为：男");
        }
    }
}
