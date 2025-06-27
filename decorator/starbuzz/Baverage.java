package starbuzz;

import java.util.List;

public interface Baverage {
    enum Size { TALL, GRANDE, VENTI };
    void setSize(Size size);
    Size getSize();
    double getCost();
    List<String> getDescription();
}
