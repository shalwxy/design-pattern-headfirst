package starbuzz.condiment;

import starbuzz.Baverage;
import starbuzz.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Baverage baverage) {
        this.baverage = baverage;
    }

    @Override
    public double cost() {
        return baverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return baverage.getDescription() + ", 휘핑크림";
    }
}
