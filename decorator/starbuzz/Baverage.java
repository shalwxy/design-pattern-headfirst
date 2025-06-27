package starbuzz;

public abstract class Baverage {
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;
    protected String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public String string() {
        return String.format("%s $%f", getDescription(), cost());
    }
}
