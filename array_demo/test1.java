package array_demo;

//练习-数组类

//1.遍历
//设计一个方法用于数组遍历，要求遍历的结果在一行上。例如：[11,22,33,44,55]

public class test1 {
    public static void main(String[] args) {
        int[] a = {11,22,33,44,55};
        printArray(a);
    }

    //定义方法
    public static void printArray(int[] array){
        System.out.print('[');
        for(int i=0 ; i<array.length ; i++) {
            if(i==array.length-1){
                System.out.print(array[i]);
            }
            else {
                System.out.print(array[i]+",");
            }
        }
        System.out.println(']');
    }
}
