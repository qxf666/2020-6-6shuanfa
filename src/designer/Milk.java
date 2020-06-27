package designer;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setPrice(2.0f);
        setDes("牛奶");
    }
}
