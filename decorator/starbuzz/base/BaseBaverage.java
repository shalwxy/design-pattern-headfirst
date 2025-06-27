package starbuzz.base;

import starbuzz.Baverage;

import java.util.List;

public abstract class BaseBaverage implements Baverage {
    protected List<String> description;

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
    public List<String> getDescription() {
        return this.description;
    }
}
