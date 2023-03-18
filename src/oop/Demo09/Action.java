package oop.Demo09;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-02 11:13
 */

//抽象类的所有方法，子类都必须要实现父类的方法，除非子类也是抽象类
public class Action extends Abstract {
    @Override
    public void doSomethiing() {
        System.out.println("做点什么");
    }
    public Action(){super();}//构造器,继承抽象类的构造
    public static void main(String[] args) {
        Action action = new Action();
        System.out.println(action.a);//6
        action.doSomethiing();
    }

}
