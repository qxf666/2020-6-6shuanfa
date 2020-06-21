package two;

public class test6 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int key = binarySearch(0, 4, array, 6);
        System.out.println(key);
    }

    public static int binarySearch(int low, int high, int[] array, int key) {
        if (low <= high) {
            if (array[(low + high) / 2] == key) {
                return (low + high) / 2;
            } else if (array[(low + high) / 2] < key) {
                return binarySearch((low + high) / 2 + 1, high, array, key);
            } else {
                return binarySearch(low, (low + high) / 2 - 1, array, key);

            }
        } else
            return -low - 1;
    }
}
