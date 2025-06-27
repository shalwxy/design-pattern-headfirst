package starbuzz.condiment;

import starbuzz.Baverage;
import starbuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Baverage baverage) {
        this.baverage = baverage;
    }

    @Override
    public double cost() {
        return baverage.cost() + switch (this.size) {
            case TALL -> .20;
            case GRANDE -> .25;
            case VENTI -> .30;
        };
    }

    @Override
    public String getDescription() {
        return baverage.getDescription() + ", 모카";
    }
}
