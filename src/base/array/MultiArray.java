package base.array;

public class MultiArray {
    public static void printArray(int[] arrays){//打印数组
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("arrays["+i+"]: " + arrays[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {//多维数组
        int[][] arrays = {{1, 2}, {3, 4}, {5, 6},{7,8}};
        /*
        1,2 arrays[0]
        3,4 arrays[1]
        5,6 arrays[2]
        7,8 arrays[3]
         */
        System.out.println(arrays[0]);//[I@1b6d3586
        printArray(arrays[0]);//arrays[0]: 1 arrays[1]: 2

        System.out.println("arrays.length:"+arrays.length);//arrays.length:4
        System.out.println("arrays[0].length:"+arrays[0].length);//arrays[0].length:2

        for (int i = 0; i <arrays.length ; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.println(arrays[i][j]);
            }
        }

    }
}
