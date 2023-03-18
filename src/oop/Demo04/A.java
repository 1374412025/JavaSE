package oop.Demo04;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-01 11:50
 */


public class A extends B {//子类
    public String  name="儿子";
    public A() {
        System.out.println("a");
    }

    public  static void test(){
        System.out.println("A-test,静态");
    }

    @Override//注解，有功能的注释
    public void test1() {
        //super.test1();
        System.out.println("A-test");
    }
    public void son(){
        System.out.println("son");
    }
}
