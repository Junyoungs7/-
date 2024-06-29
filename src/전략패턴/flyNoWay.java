package 전략패턴;

public class flyNoWay implements flyable{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
