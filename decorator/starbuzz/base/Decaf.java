package starbuzz.base;

public class Decaf extends BaseBaverage {
    public Decaf() {
        this.description = "디카페인";
    }

    @Override
    public double getCost() {
        return switch (getSize()) {
            case TALL -> 1.05;
            case GRANDE -> 1.15;
            case VENTI -> 1.25;
        };
    }
}
