package starbuzz.base;

import starbuzz.Baverage;

public class HouseBlend extends Baverage {
    public HouseBlend() {
        this.description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return switch (this.size) {
            case TALL -> .89;
            case GRANDE -> .99;
            case VENTI -> 1.09;
        };
    }
}
