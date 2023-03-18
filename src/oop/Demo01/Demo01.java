package oop.Demo01;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description
 * @date: 2022-10-27 16:54
 */
//Demo01 类
public class Demo01 {  //
    //main方法
    public static void main(String[] args) {

        //类：抽象的，实例化
        //类实例化后会返回一个自己的对象
        //person对象就是Person类的一个具体实例
        //构造器   Person
        Person person = new Person();//Person无参构造
        //System.out.println(person.gender);//报错
        System.out.println(person.getGender());//null
        System.out.println(person.name);//null
        System.out.println(person.age);//0
        person.name = "路人乙";
        person.age = 22;
        person.setGender("男");//私有变量gender不能直接访问
        person.print();//Person
        System.out.println(person.name);//路人乙
        System.out.println(person.age);//22
        System.out.println(person.getGender());//男

        System.out.println("==========有参构造==========");
        Person person1 = new Person("路人甲");//有参构造
        System.out.println(person1.name);//路人甲
        System.out.println(person1.age);//0
        System.out.println(person1.getGender());//null
        person1.say();//吼叫


    }

}
