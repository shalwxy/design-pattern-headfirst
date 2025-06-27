package starbuzz.condiment;

import starbuzz.Baverage;

import java.util.List;

public abstract class CondimentDecorator implements Baverage {
    protected Baverage baverage;

    @Override
    public void setSize(Size size) {
        baverage.setSize(size);
    }

    @Override
    public Size getSize() {
        return baverage.getSize();
    }

    @Override
    public abstract double getCost();

    @Override
    public abstract List<String> getDescription();
}
