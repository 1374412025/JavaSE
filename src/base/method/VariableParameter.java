package base.method;

import java.util.Arrays;

public class VariableParameter {//可变参数  实质是数组

    public static void main(String[] args) {
        test(1,2,3,3,5);
        printMax(1,2,3,5,6,7,88,75,22);
        printMax(new double[]{1,2,4,5,6});
    }

    public static void test(float a,int...i){//输出可变参数第一个
        //System.out.println(a);
        System.out.println(i[0]);
        System.out.println(Arrays.toString(i));//[2, 3, 3, 5]
    }
    
    public  static  void printMax(double...nums){//找最大值
        if (nums.length == 0) {
            System.out.println("no argumnet passd");
            return;
        }
        double result = nums[0];

        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]>result)
                result = nums[i];
        }
        System.out.println("The Max Value Is :"+result);
    }
}
