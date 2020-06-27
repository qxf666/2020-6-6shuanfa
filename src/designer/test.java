package designer;

public class test {
    public static void main(String[] args) {
        Drink longBlack=new LongBlack();
        longBlack=new Milk(longBlack);
        //一杯长黑咖啡加上配料牛奶
        System.out.println(longBlack.getDes());
    }
}
