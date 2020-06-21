package two;
//二分查找法
public class test5 {
    public static void main(String[] args) {
        int[] array={1,3,5,7,9};
        int key= binarySearch(0,4,array,4);
        System.out.println(key);
    }
    public static int binarySearch(int low,int high,int[] array,int key) {
        if (low==high&&array[low]!=key){
            return -1;
        }
        if(array[(low+high)/2]>key){
            return binarySearch(low,(low+high)/2-1,array,key);
        }
        if (array[(low+high)/2]<key){
            return binarySearch((low+high)/2+1,high,array,key);
        }
        else
            return (low+high)/2;
    }
}
