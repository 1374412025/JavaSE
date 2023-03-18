package base.array;

public class UseArray {//数组使用
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        //打印全部元素
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" "+nums[i]);
        }

        //计算所有元素的和
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.print(" 元素和： "+sum);

        //找最大值
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i])
                max = nums[i];
        }
        System.out.println("    最大值： "+max);

        //增强for
        int[] arrays = {1, 2, 3, 4, 5};
        for (int array : arrays) {//JDK1.5 没有下标
            System.out.print(" "+array);
        }
        System.out.println();

        //数组当参数，返回值为参数
        //反转数组
        int[] reArrays= reverse(arrays);//反转完成
        printArray(reArrays);
    }

    public static void printArray(int[] arrays){//打印数组
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("arrays["+i+"]: " + arrays[i]+" ");
        }
        System.out.println();
    }

    public static int[] reverse(int[] arrays){//反转数组
        int[] result = new int[arrays.length];
        for (int i = 0; i <arrays.length; i++) {
            result[arrays.length - 1 - i] = arrays[i];
        }
        System.out.println("反转完成");
        return result;
    }
}
