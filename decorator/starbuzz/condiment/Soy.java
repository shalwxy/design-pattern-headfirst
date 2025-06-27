package starbuzz.condiment;

import starbuzz.Baverage;
import starbuzz.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Baverage baverage) {
        this.baverage = baverage;
    }

    @Override
    public double cost() {
        return baverage.cost() + switch (this.size) {
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
