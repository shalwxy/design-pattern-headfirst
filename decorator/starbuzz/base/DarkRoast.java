package starbuzz.base;

import starbuzz.Baverage;

public class DarkRoast extends Baverage {
    public DarkRoast() {
        this.description = "다크 로스트";
    }

    @Override
    public double cost() {
        return switch (this.size) {
            case TALL -> .99;
            case GRANDE -> 1.09;
            case VENTI -> 1.19;
        };
    }
}
