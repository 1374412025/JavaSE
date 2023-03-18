package base.scanner;

import java.util.Scanner;

public class ScanStr {//输入Sting数据类型
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收： ");
        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输出的内容"+str);
        }

        System.out.println("使用nextLine方式接收： ");
        //判断用户有没有输入字符串
        if (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输出的内容"+str);
        }

        //凡是输入IO流的类如果不关闭会一直占用资源，习惯关掉
        scanner.close();

    }
}
