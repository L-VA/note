import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

       CreateRandom cr = new CreateRandom();
       PrintArray pa = new PrintArray();
       BubbleSort bs = new BubbleSort();

        //输出随机字符串数组
        int[] arr = cr.createRandoms(10,100);

        //输出数组
        pa.printArray(arr);
        //排序
        bs.bubbleSort(arr);
        pa.printArray(arr);


    }
}

/**
 * 生成一个随机数组
 */
class CreateRandom{
    public  int[]  createRandoms(int num, int bound){
        int[] numbers = new int[num];
        Random rand = new Random();
        for(int i=0;i<num;i++){
            numbers[i] = rand.nextInt(bound);
        }
        return numbers;
    }
}

/**
 * 数组输出
 */
class PrintArray{
    public void printArray(int[] arr){
        int len = arr.length;
        System.out.print("["+arr[0]);
        for(int i=1;i<len;i++){
            System.out.print(","+arr[i]);
        }
        System.out.println("]");
    }
}

/**
 * 冒泡排序
 */
class BubbleSort{
    public int[] bubbleSort(int[] arr){
        int len = arr.length;
        int temp;
        for (int j=1;j<=len-1;j++){
            for(int i=0;i<len-j;i++){
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}
