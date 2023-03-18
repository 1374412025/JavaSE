package oop.Demo07;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-10-28 11:24
 */


public class Person {
    //属性
    String name;
    int age;
    private String gender;//属性私有

    protected String test = "人类";


    //方法
    public Person(){
        System.out.println("Person无参构造");
    }
    public Person(String name){
        this.name=name;
    }
    public Person(String name, int age ){
        this.name=name;
        this.age=age;
    }

    protected void print(){
        System.out.println("Person");
    }

    public void say(){
        System.out.println("吼叫");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
