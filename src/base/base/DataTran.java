package base.base;

public class DataTran {
    public static void main(String[] args) {
        int i = 128;
        byte b= (byte)i;    //高到低，强制转换 	(类型)变量名
        System.out.println(b);//-128;byte最大127，所以内存溢出

        double d = i;       //低到高，自动转换
        System.out.println(d);
//        - 不能对布尔值转换
//        - 不能把对象转换为不相干的类型
//        - 转换时候可能存在内存溢出，或者精度问题
//        - 高转低，强制转换
        System.out.println();
        System.out.println((int)23.7);//23
        System.out.println((int)-45.89f);//-45

        System.out.println();
        char c ='a';
        int num= c+1;
        System.out.println(num);//98
        System.out.println((char)num);//b
//=================================================================
//操作比较大的时候，注意溢出
        int money= 10_0000_0000;//数字之间可以用下划线分割
        int year =20;
        int total =money*year;  //-1474836480   溢出
        long total2 = money*year;//-1474836480
                    //默认int 转换前就以int计算，已经出现溢出问题了
        long total3 = money*(long)year;//20000000000
        long total4 = (long)money*year;//20000000000
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(total4);

    }
}

