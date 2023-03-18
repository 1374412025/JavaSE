package oop.Demo03;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-10-31 15:35
 */


public class Demo03 {//继承，super
    public static void main(String[] args) {

        Student student = new Student();//无参构造
        Person person =new Person("小王");
        student.say();//继承父类方法
        student.test("demo");//super是对父类对象的引用
        student.test1();//
    }
}
