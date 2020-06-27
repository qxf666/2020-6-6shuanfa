package designer;

public class Decorator extends Drink{
    Drink obj;
    public Decorator(Drink drink){
        obj=drink;
    }
    @Override
    public float cost() {
        return (super.getPrice()+obj.cost());
    }
    public String getDes(){
        return super.getDes()+"  "+cost()+"&&"+obj.getDes();
    }
}
