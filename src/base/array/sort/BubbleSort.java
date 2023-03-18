package base.array.sort;

import java.util.Arrays;

public class BubbleSort {//冒泡排序
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        int[] array1 = {1,2,3,5,4};
        int[] bubArray;
        bubArray = bubbleSortOpt(array1);
        System.out.println(Arrays.toString(bubArray));
    }


    public static int[] bubbleSort(int[] a){
        int temp = 0;
        int num=0;
        for (int i = 0; i < a.length - 1; i++) {//判断轮次
            for (int j = 0; j < a.length - 1 - i; j++) {//每轮下两辆对比
                if (a[i] > a[i + 1]) {
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
                num++;
            }
        }
        System.out.println("对比次数 ："+num);
        return a;
    }

    public static int[] bubbleSortOpt(int[] a){//
        int temp = 0;
        int num=0;
        for (int i = 0; i < a.length - 1; i++) {//判断轮次
            boolean flag =false;
            for (int j = 0; j < a.length - 1 - i; j++) {//每轮下两辆对比
                if (a[i] > a[i + 1]) {
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    flag = true;
                }
                num++;
            }
            if(!flag)
                break;
        }
        System.out.println("对比次数 ："+num);
        return a;
    }



}
