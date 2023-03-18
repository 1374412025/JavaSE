package exception;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2023-03-17 15:19
 */


public class Demo02 {
    public void calulate(int a , int b) throws Exception {
        if(b==0){
            throw new Exception();
        }
        System.out.println(a/b);
    }
    public void a(){b();}
    public void b(){a();}

    public static void main(String[] args) {
        try{
            new Demo02().calulate(3,0);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("抓到一个错误");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            new Demo02().a();
        }catch (StackOverflowError e){
            System.out.println("栈溢出");
        }finally {
            System.out.println("finally");
        }
    }
}
