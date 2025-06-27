package starbuzz.condiment;

import starbuzz.Baverage;

import java.util.List;

public class Mocha extends CondimentDecorator {
    public Mocha(Baverage baverage) {
        this.baverage = baverage;
        this.baverage.getDescription().add("모카");
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
    public List<String> getDescription() {
        return baverage.getDescription();
    }
}
