package String_Demo;
//字符串反转
/*
定义一个方法，实现字符串反转
录入一个字符串，调用该方法后，在控制台输出结果
 */
public class test8 {
    public static void main(String[] args) {
        String s = reverseString("abcdefg");
        System.out.println(s);
    }

    //方法
    public static String reverseString(String str){
        if (str == ""){
            return "";
        }

        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            //i依次表示字符串的每一个索引（倒着的
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }

}
