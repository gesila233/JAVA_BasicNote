package String_Demo;
//敏感词替换
public class test13 {
    public static void main(String[] args) {
        String talk="你完的真好，以后不要再玩了，cnm，sb";
        //敏感词库
        String[] arr={"cnm","sb","ntmd"};
        //循环得到每一个敏感词，依次替换
        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
