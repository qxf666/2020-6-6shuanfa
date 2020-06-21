package two;

public class test4 {
    public static void main(String[] args) {
        char[] array=new char[100];
        int[] a=new int[26];
        for(int i=0;i<100;i++){
            array[i]=randomCharacter();
        }
        for(char i:array){
            System.out.print(i);
        }
        System.out.println();
        System.out.println();
        int count;
        for (int i=0;i<100;i++){
            count=array[i]-'a';
            a[count]++;
        }
        char ch;
        int times=0;
        for (int i=0;i<26;i++){
            ch=(char)(i+'a');
            if (a[i]!=0) {
                times++;
                if(times%10==0)
                    System.out.println(a[i] + " " + ch + " ");
                else
                    System.out.print(a[i] + " " + ch + " ");
            }
        }
    }
    public static char randomCharacter(){
        int randomnumber=(int)(Math.random()*('z'-'a'+1))+'a';
        return (char)randomnumber;
    }
}
