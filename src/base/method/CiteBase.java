package base.method;
public class CiteBase {//值传递——基本类型 String

        public static void main(String[] args) {
            // 基本数据类
            String s = "hello";

            change(s);//
            System.out.println("s = " + s);

        }


        public  static void change(String s) {

            s = "world";  //类似str = new String("world");为值传递
            System.out.println("str = "+ s);

        }
}

