package starbuzz.condiment;

import starbuzz.Baverage;
import starbuzz.CondimentDecorator;

public class Milk extends CondimentDecorator {
    public Milk(Baverage baverage) {
        this.baverage = baverage;
    }

    @Override
    public double cost() {
        return baverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return baverage.getDescription() + ", 우유";
    }
}
