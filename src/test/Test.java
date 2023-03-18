package test;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-02 12:47
 */


//abstract 抽象类	类extends单继承
public abstract class Test {//抽象类
    int a = 5;
    //约束    有人帮我们实现
    //abstract 抽象方法 有方法名，没有方法实现，方法体
    public abstract void doSomethiing();
    public Test(){a++;}
}
