package two;

public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println(i+"j");
            for (int j = 0; j < 9; j++) {
                if ( j == 1)
                    break;
                System.out.println("j="+j);
            }
        }
    }
}
