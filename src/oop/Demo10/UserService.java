package oop.Demo10;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-02 14:38
 */

//interface 定义的关键字，接口都需要有实现类
public interface UserService {
    //常量，public,static,final
    public int  AGE = 99;

    //接口中的所有定义其实都是抽象的、 abstract  public
    public void run();//{}不让写实现

    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
