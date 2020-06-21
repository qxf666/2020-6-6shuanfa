package two;
//选择排序算法
public class test7 {
    public static void main(String[] args) {
        int[] array = {2, 9, 5, 4, 8, 1, 6};
        for (int i = 0; i < array.length - 1; i++) {
            //select smallest number
            for (int j = i; j < array.length - 1; j++) {
                int min = i;
                int temp;
                if (array[j] < array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int i:array){
            System.out.println(i+"   ");
        }
    }
}

