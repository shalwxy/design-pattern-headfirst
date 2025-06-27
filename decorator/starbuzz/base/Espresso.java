package starbuzz.base;

public class Espresso extends BaseBaverage {
    public Espresso() {
        this.description = "에스프레소";
    }

    @Override
    public double getCost() {
        return switch (getSize()) {
            case TALL -> 1.99;
            case GRANDE -> 2.09;
            case VENTI -> 2.19;
        };
    }
}
