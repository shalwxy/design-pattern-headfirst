package starbuzz.base;

import starbuzz.Baverage;

public abstract class BaseBaverage implements Baverage {
    protected String description = "기본 음료";

    protected Size size = Size.TALL;
    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public Size getSize() {
        return this.size;
    }

    @Override
    public abstract double getCost();

    @Override
    public String getDescription() {
        return this.description;
    }
}
