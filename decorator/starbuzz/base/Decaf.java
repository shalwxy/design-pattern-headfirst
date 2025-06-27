package starbuzz.base;

import starbuzz.Baverage;

public class Decaf extends Baverage {
    public Decaf() {
        this.description = "디카페인";
    }

    @Override
    public double cost() {
        return switch (this.size) {
            case TALL -> 1.05;
            case GRANDE -> 1.15;
            case VENTI -> 1.25;
        };
    }
}
