package base.array;

import java.util.Arrays;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-10-27 11:46
 */
public class SparseArray {//稀疏数组
    public static void main(String[] args) {
        //创建二维数组
        int[][] array1 = new int[11][11];

        array1[1][2] = 1;
        array1[2][3] = 2;
        System.out.println("输出原始数组 ");
        for (int[] ints : array1) //打印二维稀疏数组
            System.out.println(Arrays.toString(ints));

        //转换为稀疏数组保存
        int[][] array2;
        array2 = sparseArray(array1);

        //还原成二维数组
        int[][] array3;
        array3 = restoreArray(array2);

    }

    public static int[][] sparseArray(int[][] array) {//转换为稀疏数组保存
        //1.计算有效数总数
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array.length; j++) {
                if(array[i][j]!=0)
                    sum++;
            }
        }
        //2.创建稀疏数组
        int[][] array1= new int[sum+1][3];//稀疏数组
        array1[0][0]= array.length;
        array1[0][1]=array[0].length;
        array1[0][2]=sum;
        //3.遍历二维数组，将有效值放入稀疏数组
        int count=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0) {
                    count++;
                    array1[count][0]=i;
                    array1[count][1]=j;
                    array1[count][2]=array[i][j];
                }
            }
        }
        //4.打印二维稀疏数组
        System.out.println("输出稀疏数组: ");
        for (int[] ints : array1)
            System.out.println(Arrays.toString(ints));
        return array1;

    }

    public static int[][] restoreArray(int[][] array){//还原稀疏矩阵
        //初始化二维数组   初始化大小为稀疏矩阵01,02
        int[][] array1 = new int[array[0][0]][array[0][1]];
        //遍历稀疏矩阵，将值填入二维数组
        for (int i = 1; i < array.length; i++)
            array1[array[i][0]][array[i][1]]=array[i][2];
        //打印二维稀疏数组还原后
        System.out.println("输出稀疏数组还原后: ");
        for (int[] ints : array1)
            System.out.println(Arrays.toString(ints));
        return array1;
    }
}
