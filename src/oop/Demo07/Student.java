package oop.Demo07;


/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-10-27 17:13
 */
//学生类 is 人;  学生是派生类，人是父类
public class Student extends Person {

    //属性：字段
    private String test = "学生";


    //构造方法
    public Student(){
        System.out.println("Student无参构造");
    }

    public void test(String test) {
        System.out.println(test);
        System.out.println(this.test);
        System.out.println(super.test);
    }
    public void go(){
        System.out.println("这是学生独有方法！");
    }
    public void print(){
        System.out.println("Student");
    }
    public void test1(){
        print();
        this.print();
        super.print();//私有的无法直接调用
    }
}
