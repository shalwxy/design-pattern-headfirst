package sim_u_duck.duck;

import sim_u_duck.behavior.fly.FlyNoWay;
import sim_u_duck.behavior.quack.QuackSound;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new QuackSound();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("저는 모형 오리입니다");
    }
}