package oop.Demo10;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-02 14:59
 */

//抽象类：extends 单继承
//类 可以实现接口 implement 接口
//实现了接口的类， 就需要重写接口中的方法

//接口实现伪多继承
public class UserServiceImpl implements UserService,TimeService{
    @Override
    public void run() {

    }

    @Override
    public void add(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }

    @Override
    public void timer() {

    }
}
