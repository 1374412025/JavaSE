package oop.Demo08;

//静态导入包
import static java.lang.Math.random;
import static java.lang.Math.PI;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-01 17:52
 */


public class Demo08 {//关键字静态static

    private static int age;//静态的变量，可以被多个类实例操作(多线程)
    private double score;//非静态的变量

    static{//第1个加载  且只执行一次
        System.out.println("静态代码块");
    }
    {//第2个加载 用来赋初值
        System.out.println("匿名代码块");
    }
    public Demo08(){//第3个加载
        System.out.println("无参构造方法");
    }

    public static void go(){
        System.out.println("静态方法");
        //System.out.println(score);静态方法无法直接访问非静态属性
    }
    public void run(){
        System.out.println("非静态方法");
        //go();非静态方法可以直接调用静态方法
    }
    public static void main(String[] args) {

        Demo08 s1 = new Demo08();
        Demo08 s2 = new Demo08();

        System.out.println(Demo08.age);//使用类名访问
        //System.out.println(Demo08.score);//non-static field
        System.out.println(age);
        System.out.println(s1.age);
        System.out.println(s1.score);
        //======================================================
        s1.go();
        Demo08.go();
        //run();//non-static method

        s2.run();
        new Demo08().run();
        //======================================================
        System.out.println(random());
        System.out.println(PI);
    }
}
