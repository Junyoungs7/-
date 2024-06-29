package 전략패턴;

public abstract class Duck {
    private flyable flyable;

    public Duck (flyable flyable){
        this.flyable = flyable;
    }

    public abstract void display();

    public void quack(){
        System.out.println("꽥꽥");
    }

    public void swim(){
        System.out.println("swim");
    }

    public void fly(){
        flyable.fly();
    }

    public void changeFly(flyable flyable){
        this.flyable = flyable;
    }
}
