package base.method;
import oop.Demo03.Person;
public class CiteObject {//引用传递——引用类型

    public static void main(String[] args) {
        // 引用类型
        Person person = new Person();//实例化//Person无参构造
        person.setName("wang");

        change(person);
        System.out.println("main = "+person.getName());

    }

    public static void change(Person person) {
        //person = new Person();//创建一个对象，指向新地址，类似值传递了
        person.setName("java");
        System.out.println("The name is :" + person.getName());//The name is :java
        //有person = new Person();时,main:wang   否则main:java
    }


}
