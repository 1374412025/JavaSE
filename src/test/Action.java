package test;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-02 12:48
 */


//抽象类的所有方法，子类都必须要实现父类的方法，除非子类也是抽象类
public class Action extends Test {
    @Override
    public void doSomethiing() {
    }
    public Action (){
        super();
    }

    public static void main(String[] args) {
        Action action = new Action();
        System.out.println(action.a);
        Action action1 = new Action();
        System.out.println(action1.a);
    }
}