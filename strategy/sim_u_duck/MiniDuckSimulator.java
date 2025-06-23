package sim_u_duck;

import sim_u_duck.behavior.fly.FlyRocketPowered;
import sim_u_duck.duck.Duck;
import sim_u_duck.duck.MallardDuck;
import sim_u_duck.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}