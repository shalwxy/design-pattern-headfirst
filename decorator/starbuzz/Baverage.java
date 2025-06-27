package starbuzz;

public abstract class Baverage {
    public enum Size { TALL, GRANDE, VENTI };
    protected String description = "제목 없음";

    protected Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String string() {
        return String.format("%s (%s) $%f", getDescription(), getSize(), cost());
    }
}
