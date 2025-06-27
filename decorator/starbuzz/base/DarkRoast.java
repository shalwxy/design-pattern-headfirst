package starbuzz.base;

public class DarkRoast extends BaseBaverage {
    public DarkRoast() {
        this.description = "다크 로스트";
    }

    @Override
    public double getCost() {
        return switch (getSize()) {
            case TALL -> .99;
            case GRANDE -> 1.09;
            case VENTI -> 1.19;
        };
    }
}
