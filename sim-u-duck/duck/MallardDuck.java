package duck;

import behavior.quack.QuackSound;
import behavior.fly.FlyWithWings;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new QuackSound();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("저는 물오리입니다");
    }
}