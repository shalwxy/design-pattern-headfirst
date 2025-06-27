package starbuzz;

public abstract class Baverage {
    protected String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public String string() {
        return String.format("%s $%f", getDescription(), cost());
    }
}
