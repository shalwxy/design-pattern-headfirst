package duck;

import behavior.fly.FlyNoWay;
import behavior.quack.QuackSound;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new QuackSound();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("저는 모형 오리입니다");
    }
}