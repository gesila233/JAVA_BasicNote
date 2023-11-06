package ArrayList_Demo;

import java.awt.*;
import java.util.ArrayList;

/*
定义javabean类，phone
phone属性：品牌，价格
main方法中定义一个集合，存入三个手机对象
分别为：小米，1000；苹果，8000；锤子，2999
定义一个方法，将价格低于3000的手机信息返回
 */
public class test6 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

//        Phone ph1 = new Phone();
//        Phone ph2 = new Phone();
//        Phone ph3 = new Phone();
//        ph1.setBrand("小米");
//        ph1.setPrice(1000);
//        ph2.setBrand("苹果");
//        ph2.setPrice(8000);
//        ph3.setBrand("锤子");
//        ph3.setPrice(2999);

        Phone ph1 = new Phone("小米", 1000);
        Phone ph2 = new Phone("苹果", 8000);
        Phone ph3 = new Phone("锤子", 2999);

        list.add(ph1);
        list.add(ph2);
        list.add(ph3);

        //集合要遍历着打印
        ArrayList<Phone> res = get_phone_infromation(list);

//        ArrayList<Phone> res =new ArrayList<>();
//        res=get_phone_infromation(list);    一样

        for (int i = 0; i <res.size() ; i++) {
            Phone p=res.get(i);
            System.out.println(p.getBrand()+","+p.getPrice());
        }
    }

    //方法
    public static ArrayList<Phone> get_phone_infromation(ArrayList<Phone> list) {
        ArrayList<Phone> resultlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int pri = p.getPrice();
            if (pri < 3000) {
                resultlist.add(p);
            }
        }
        return resultlist;
    }
}
