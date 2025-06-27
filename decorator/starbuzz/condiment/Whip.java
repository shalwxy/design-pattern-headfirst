package starbuzz.condiment;

import starbuzz.Baverage;

import java.util.List;

public class Whip extends CondimentDecorator {
    public Whip(Baverage baverage) {
        this.baverage = baverage;
        this.baverage.getDescription().add("휘핑크림");
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
    public List<String> getDescription() {
        return baverage.getDescription();
    }
}
