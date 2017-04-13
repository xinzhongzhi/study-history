public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Main.doWork();
        Main.p();/*调用*/
        Main.pValue("hello");//调用
        int age =  Main.getAge();
        System.out.println(age);

        int sum = Main.getSum(3,4);
        System.out.println(sum);
    }

    /*无参数 无返回*/
    /*需求 :定义一个方法专门打印---------*/
    static void p(){

        System.out.println("---------");//调用方法
    }
    /*有参数 无返回值*/
    /*需求:打印任意值*/
    static void pValue(String va){

        System.out.println(va);//传递这个string参数
    }
    /*无参数 有返回值*/
    /*需求:返回我的年龄*/
    static int getAge(){

        return  17;
    }
    /*有参数有返回值*/
    /*求两个数之和*/
    static int getSum(int a,int b){
            return  a+b;

    }

    /*不同的返回结果代表返回的含义
    * 0 发送成功
    * 1 发送失败
    * 2 已经接受*/
    static int  sendMsg( String phoneNu,String content){/*入参的参数 代表电话号码和内容*/

        /*发送短信的逻辑代码*/
        return  int 类型的值
    }
    /*实现调用部分*/





    static void doWork(){
        System.out.println("我是你爸爸");//调用方法

    }
    public static void work(){
        System.out.println("我是你的二号爸爸");

    }
}
