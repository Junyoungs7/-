import 전략패턴.Duck;
import 전략패턴.MallardDuck;
import 전략패턴.flyNoWay;
import 전략패턴.flyWithWings;

public class Main {
    public static void main(String[] args) {
        strategyPattern();
    }

    public static void strategyPattern(){
        Duck duck = new MallardDuck(new flyWithWings());
        duck.fly();
        duck.changeFly(new flyNoWay());
        duck.fly();
    }
}