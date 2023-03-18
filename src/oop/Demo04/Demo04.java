package oop.Demo04;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-01 11:45
 */


public class Demo04 {//方法重写

    public static void main(String[] args) {
        A a = new A();//子类不能new父类       A-test,静态
        a.test();//A-test,静态
        a.test1();//A-test
        System.out.println("================");
        //父类的引用，指向了子类
        B b = new A();//父类可以new子类         B-test,静态
        b.test();//B-test,静态
        // 用B声明,此时已经加载B的静态,后面A实例化不能重写test(),但是可以重写test1()
        b.test1();//A-test 子类重写了父类方法
        System.out.println(b.name);
        System.out.println("================");
        System.out.println(b.getClass());
        System.out.println(a.getClass());


    }

}
