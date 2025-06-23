package sim_u_duck.duck;

import sim_u_duck.behavior.quack.QuackSound;
import sim_u_duck.behavior.fly.FlyWithWings;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new QuackSound();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("저는 물오리입니다");
    }
}