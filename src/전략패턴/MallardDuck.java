package 전략패턴;

public class MallardDuck extends Duck{
    public MallardDuck(전략패턴.flyable flyable) {
        super(flyable);
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
