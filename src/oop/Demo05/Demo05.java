package oop.Demo05;


/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-01 15:36
 */


public class Demo05 {//多态

    public static void main(String[] args) {

        //一个对象的实际类型是确定的,new出来的
        //但可以指向的引用类型不确定
        A a = new A();
        B b = new B();

        B c = new A();//父类的引用指向子类的实例对象
        //A d = new B();反之不行
        Object e = new A();
        Object f = new B();

        a.father();
        b.father();
        c.father();
        System.out.println(a.getClass());
        System.out.println(b.getClass());
        System.out.println(c.getClass());
        a.son();
        //b.son();//父类的引用没有son方法
        //c.son();
        ((A)c).son();//强制转换c为子类，高转低强制转
        //对象能执行哪些方法，取决于对象的类型，跟new关系不大



    }
}
