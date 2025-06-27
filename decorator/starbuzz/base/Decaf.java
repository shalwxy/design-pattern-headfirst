package starbuzz.base;

import java.util.ArrayList;
import java.util.List;

public class Decaf extends BaseBaverage {
    public Decaf() {
        List<String> description = new ArrayList<>();
        description.add("디카페인");
        this.description = description;
    }

    @Override
    public double getCost() {
        return switch (getSize()) {
            case TALL -> 1.05;
            case GRANDE -> 1.15;
            case VENTI -> 1.25;
        };
    }
}
