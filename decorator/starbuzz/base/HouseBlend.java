package starbuzz.base;

import java.util.ArrayList;
import java.util.List;

public class HouseBlend extends BaseBaverage {
    public HouseBlend() {
        List<String> description = new ArrayList<>();
        description.add("하우스 블렌드 커피");
        this.description = description;
    }

    @Override
    public double getCost() {
        return switch (getSize()) {
            case TALL -> .89;
            case GRANDE -> .99;
            case VENTI -> 1.09;
        };
    }
}
