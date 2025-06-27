package starbuzz.base;

import java.util.ArrayList;
import java.util.List;

public class Espresso extends BaseBaverage {
    public Espresso() {
        List<String> description = new ArrayList<>();
        description.add("에스프레소");
        this.description = description;
    }

    @Override
    public double getCost() {
        return switch (getSize()) {
            case TALL -> 1.99;
            case GRANDE -> 2.09;
            case VENTI -> 2.19;
        };
    }
}
