package study_2023_10_11;

public class User {
    //变量
    private String name;
    private int key;
    private int check_key;
    private String email;
    private char gender;
    private int age;

    //插件PTG，更快速方便地生产Javabean
    /*
    鼠标右键
    Ptg to Javabean
    (可能因为JAVA8.0,或者IDEA是社区版啥的，暂时用不了
     */

    //空参
    /*快捷键生成空参：
    alt+Fn+insert
    Constructor
    Select None
     */
    public User(){}

    //带参
    /*快捷键生成带参：
    alt+Fn+insert
    Constructor
    ctrl+a
    ok
     */

    public User(String name, int key, int check_key, String email, char gender, int age) {
        this.name = name;
        this.key = key;
        this.check_key = check_key;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    //方法

    /*快捷键生成带参：
    alt+Fn+insert
    Getter and Setter
    ctrl+a
    ok
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getCheck_key() {
        return check_key;
    }

    public void setCheck_key(int check_key) {
        this.check_key = check_key;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}