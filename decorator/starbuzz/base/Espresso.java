package starbuzz.base;

import starbuzz.Baverage;

public class Espresso extends Baverage {
    public Espresso() {
        this.description = "에스프레소";
    }

    @Override
    public double cost() {
        return switch (this.size) {
            case TALL -> 1.99;
            case GRANDE -> 2.09;
            case VENTI -> 2.19;
        };
    }
}
