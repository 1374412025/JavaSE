package oop.Demo11;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-03 9:13
 */


public class Application {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner  inner = outer.new Inner();

        inner.getID();//10
        inner.in();//这是内部类的方法
                //inner.out();//不能直接访问外部方法
        inner.getout();//这是外部类的方法


    }
}
