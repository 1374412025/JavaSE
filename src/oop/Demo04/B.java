package oop.Demo04;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-01 11:50
 */


public class B {//父类
    public String  name="父亲";


    public B() {
        System.out.println("b");
    }

    public static void test(){
        System.out.println("B-test,静态");
    }
    public  void test1(){
        System.out.println("B-test");
    }
    public void father(){
        System.out.println("father");
    }


}
