package starbuzz.condiment;

import starbuzz.Baverage;

public class Soy extends CondimentDecorator {
    public Soy(Baverage baverage) {
        this.baverage = baverage;
    }

    @Override
    public double getCost() {
        return baverage.getCost() + switch (getSize()) {
            case TALL -> .15;
            case GRANDE -> .20;
            case VENTI -> .25;
        };
    }

    @Override
    public String getDescription() {
        return baverage.getDescription() + ", 두유";
    }
}
