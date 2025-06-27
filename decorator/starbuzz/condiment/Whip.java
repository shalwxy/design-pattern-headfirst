package starbuzz.condiment;

import starbuzz.Baverage;

public class Whip extends CondimentDecorator {
    public Whip(Baverage baverage) {
        this.baverage = baverage;
    }

    @Override
    public double getCost() {
        return baverage.getCost() + switch (getSize()) {
            case TALL -> .10;
            case GRANDE -> .15;
            case VENTI -> .20;
        };
    }

    @Override
    public String getDescription() {
        return baverage.getDescription() + ", 휘핑크림";
    }
}
