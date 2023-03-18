package base.base;

public class EscapeChar {
    public static void main(String[] args) {
        //转义字符 \
        // \t 制表符 tab
        // \n 换行
        // \ u Unicode表转换

        System.out.println("Hello\tworld");//Hello	world
        System.out.println("");
        System.out.println("Hello\nworld");//Hello
        System.out.println(" ");           //world
        System.out.println("Hello\bworld");//Hellworld
        System.out.println(" ");
        System.out.println("Hello\fworld");//Helloorld
        System.out.println(" ");
        System.out.println("Hello\rworld");//world
        System.out.println(" ");
        System.out.println("Hello\\world");//Hello\world
        System.out.println(" ");
        System.out.println("Hello\'world");//Hello'world
        System.out.println(" ");
        System.out.println("Hello\"world");//Hello"world
        System.out.println(" ");
        System.out.println("Hello\0world");//Hello world
        System.out.println(" ");
        System.out.println("Hello world");
    }
}
