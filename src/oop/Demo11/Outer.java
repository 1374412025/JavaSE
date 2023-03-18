package oop.Demo11;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-03 9:10
 */


public class Outer  {

        private static int id = 10;

        public void out(){
            System.out.println("这是外部类的方法");
        }
        public static void read_id(){
            System.out.println(id);
        }

        public class Inner{//成员内部类
            public void in(){
                System.out.println("这是内部类的方法");
            }
            //访问外部类的私有属性
            public void getID(){
                System.out.println(id);
            }
            //访问外部类的方法(私有公有都可以访问）
            public void getout(){
                out();
            }
        }
        public static class StaticInner{//静态内部类
            public void inStatic(){
                System.out.println("这是静态内部类的方法");
            }
            public void getIDStatic(){
                System.out.println(id);
            }
            public void getoutStatic(){
                //out();静态内部类无法直接访问费静态属性
                read_id();
            }
        }

        public void method(){//在方法里面写内部类
            class PartInner{//局部内部类
                public void inPart(){
                    System.out.println("局部内部类的方法");
                }
            }
        }

    public static void main(String[] args) {
        System.out.println("1");
        //没有名字初始化类，不用将实例保存在比那两种
        new Apple().eat();//匿名内部类
        TestService testService = new TestService(){
            @Override
            public void Hello() {
            }
        };
    }
}
class Apple{
    public void eat(){
        System.out.println("吃苹果");
    }
    public static void main(String[] args) {
        System.out.println("2");
    }
}

interface TestService{
    void Hello();
}