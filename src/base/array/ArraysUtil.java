package base.array;
import java.util.Arrays;
public class ArraysUtil {//工具类Arrays类 java,util.Arrays
    public static void main(String[] args) {

        int[] a = {1, 2, 4, 777, 666, 222, 3};
        int[] b = {1, 2, 4, 777, 666, 222, 3};
        int[] c = {2, 2, 4, 777, 666, 222, 3};
        System.out.println(a);//[I@1b6d3586

        //打印数组元素——已有工具类 toString
        System.out.println(Arrays.toString(a));
            //自写工具类
            System.out.println("自写工具类：");
            printArrays(a);

        //对比    equals
        System.out.print("a,b对比： ");
        System.out.println(Arrays.equals(a, b));

        //升序排序  sort
        Arrays.sort(a);
        System.out.println("升序排序后：");
        System.out.println(Arrays.toString(a));

        //填充      fill
        Arrays.fill(a,2,4,0);
        System.out.println("2,4填充后：");
        System.out.println(Arrays.toString(a));

        //查找数组元素    binarySearch
        Arrays.sort(b);
        System.out.println(Arrays.binarySearch(b, 222));
    }

    //打印数组元素——重复造轮子
    public static void printArrays(int[] a) {
        System.out.print("[");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if(i<a.length-1)
                System.out.print(", ");
            else
                System.out.println(']');
            //这是测试

        }
    }
}
