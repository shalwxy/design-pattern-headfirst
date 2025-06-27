package starbuzz.base;

import starbuzz.Baverage;

public class Decaf extends Baverage {
    public Decaf() {
        description = "디카페인";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
