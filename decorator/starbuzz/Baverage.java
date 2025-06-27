package starbuzz;

public interface Baverage {
    public enum Size { TALL, GRANDE, VENTI };
    public void setSize(Size size);
    public Size getSize();
    public double getCost();
    public String getDescription();
}
