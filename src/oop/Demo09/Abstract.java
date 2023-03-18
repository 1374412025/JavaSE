package oop.Demo09;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-02 11:13
 */

//abstract 抽象类	类extends单继承
public abstract class Abstract {//抽象类
    int a = 5;
    public Abstract(){a++;}//无参构造函数
    //约束    有人帮我们实现
    //abstract 抽象方法 有方法名，没有方法实现，方法体
    public abstract void doSomethiing();//抽象方法

}