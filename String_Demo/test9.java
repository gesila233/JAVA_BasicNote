package String_Demo;

import java.util.Scanner;

//金额转换
/*
把数字 转换为带单位的汉字
e.g.135
 */
public class test9 {
    public static void main(String[] args) {
        //录入金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 1000000) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }

        //写完一段，就测试一下
        //System.out.println(money);

        //定义一个变量，用来表示钱的大写
        String moneyChinese = "";

        //得到money的每一位数字
        while (true) {
            //从右往左获取数据
            int ge_wei = money % 10;
            //System.out.println(ge_wei);
            String Chinese_num = numToChinese(ge_wei);
            //System.out.println(num);
            //拼接
            //把转换后的大写拼到moneyChinese中
            moneyChinese = Chinese_num + moneyChinese;

            //去掉刚刚获取的数据
            money = money / 10;
            if (money == 0) {
                break;
            }
        }
        //System.out.println(moneyChinese);

        //补零
        while (moneyChinese.length() < 7) {
            moneyChinese = "零" + moneyChinese;
        }
        //System.out.println(moneyChinese);

        //插入单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String result = "";
        for (int i = 0; i < moneyChinese.length(); i++) {
            result = result + moneyChinese.charAt(i) + arr[i];
        }
        System.out.println(result);
    }

    //方法
    //转换数字(查表法)
    public static String numToChinese(int num) {
        String[] str = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return str[num];
    }
}
