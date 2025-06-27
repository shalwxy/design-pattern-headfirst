package starbuzz.condiment;

import starbuzz.Baverage;
import starbuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Baverage baverage) {
        this.baverage = baverage;
    }

    @Override
    public double cost() {
        return baverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return baverage.getDescription() + ", 모카";
    }
}
