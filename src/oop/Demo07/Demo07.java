package oop.Demo07;



/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-01 17:04
 */


public class Demo07 {//类型之间的转化——父 子

    public static void main(String[] args) {
        //父（高）              子（低）
        Person obj = new Student();

        Student student = (Student)obj;
        student.go();
        //等同下一行
        ((Student) obj).go();
        //将person强制转换成Student类型，就可以使用Student类型的方法

        Student stu = new Student();
        stu.go();

        Person person = stu;//子类转父类，低转高默认转换，不用()强制
        //person.go()//报错，子类转父类可能丢失 方法
        ((Student) person).go();
    }
}
