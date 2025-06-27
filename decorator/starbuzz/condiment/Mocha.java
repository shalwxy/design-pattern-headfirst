package starbuzz.condiment;

import starbuzz.Baverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Baverage baverage) {
        this.baverage = baverage;
    }

    @Override
    public double getCost() {
        return baverage.getCost() + switch (getSize()) {
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
