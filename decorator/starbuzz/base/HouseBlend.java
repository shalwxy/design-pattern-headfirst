package starbuzz.base;

public class HouseBlend extends BaseBaverage {
    public HouseBlend() {
        this.description = "하우스 블렌드 커피";
    }

    @Override
    public double getCost() {
        return switch (getSize()) {
            case TALL -> .89;
            case GRANDE -> .99;
            case VENTI -> 1.09;
        };
    }
}
