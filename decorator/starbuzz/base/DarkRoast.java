package starbuzz.base;

import java.util.ArrayList;
import java.util.List;

public class DarkRoast extends BaseBaverage {
    public DarkRoast() {
        List<String> description = new ArrayList<>();
        description.add("다크 로스트");
        this.description = description;
    }

    @Override
    public double getCost() {
        return switch (getSize()) {
            case TALL -> .99;
            case GRANDE -> 1.09;
            case VENTI -> 1.19;
        };
    }
}
