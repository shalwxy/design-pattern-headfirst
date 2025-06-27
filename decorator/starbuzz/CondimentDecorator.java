package starbuzz;

public abstract class CondimentDecorator extends Baverage {
    protected Baverage baverage;

    public abstract String getDescription();

    public void setSize(Size size) {
        this.size = size;
        baverage.setSize(size);
    }
}
