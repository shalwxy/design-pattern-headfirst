package starbuzz.base;

import starbuzz.Baverage;

public class DarkRoast extends Baverage {
    public DarkRoast() {
        description = "다크 로스트";
    }

    @Override
    public double cost() {
        return .99;
    }
}
