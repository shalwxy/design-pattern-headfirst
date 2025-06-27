package starbuzz.condiment;

import starbuzz.Baverage;

import java.util.List;

public class Soy extends CondimentDecorator {
    public Soy(Baverage baverage) {
        this.baverage = baverage;
        this.baverage.getDescription().add("두유");
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
    public List<String> getDescription() {
        return baverage.getDescription();
    }
}
