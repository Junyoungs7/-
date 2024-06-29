package 전략패턴;

public class flyWithWings implements flyable{
    @Override
    public void fly() {
        System.out.println("I can fly with wings");
    }
}
