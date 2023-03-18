package exception;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-03 14:39
 */

public class Test {
    //可能会存在异常的方法
    public void way1(int a) throws MyException {
        System.out.println("方法一传递的参数"+a);

        if (a > 10) {
            throw new MyException(a);//抛出异常
        }
        System.out.println("方法一完毕");//出错后会中断,不会打印

    }

    public void way2(int a )  {
        System.out.println("方法二传递的参数"+a);
        if (a > 10) {
            try {
                throw new MyException(a);//try结束
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
        System.out.println("方法二完成");//出错也会打印，因为try是监督，不会打断
    }

    public static void main(String[] args)  {
//        try {
//            new Test().way1(11);//way1为非静态,需要new,
//        }catch (MyException e){//捕获异常命名为e
//            e.printStackTrace();//最后打出异常信息
//            System.out.println("way1出现错误");
//        }
        new Test().way2(11);//方法二在方法中已经处理了异常,可以直接调用
        System.out.println("go on ");

    }
}
