package exception;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-03 11:29
 */


public class Demo01 {
    public static void main(String[] args)  {
        int a = 1;
        int b = 0;

        try {
            //System.out.println(a/b);//ArithmeticException
            new Demo01().a();     //StackOverflowError栈溢出
        }catch (ArithmeticException e){//捕获异常
            System.out.println("ArithmeticException");
        }catch (StackOverflowError e) {//捕获异常
            System.out.println("StackOverflowError");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Exception");
        }catch (Throwable e){
            //System.exit(1);//手动程序结束
            System.out.println("Throwable");
        }finally {//善后处理，一定执行
            System.out.println("finally");
        }


        try {
            //new Demo01().test(1, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("go on ");

    }
    public void a(){b();}
    public void b(){a();}

    public void test(int a, int b)  {
        //主动抛出异常
        if (b == 0) {
            throw new ArithmeticException();
        }
        System.out.println(a/b);
    }
    public void test2(int a, int b)  throws ArithmeticException{
        //方法上抛出异常
        System.out.println(a/b);
    }
}


