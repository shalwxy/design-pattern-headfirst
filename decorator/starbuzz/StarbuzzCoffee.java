package starbuzz;

import starbuzz.base.BaseBaverage;
import starbuzz.base.DarkRoast;
import starbuzz.base.Espresso;
import starbuzz.base.HouseBlend;
import starbuzz.condiment.Mocha;
import starbuzz.condiment.Soy;
import starbuzz.condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String args[]) {
        Baverage baverage1 = new Espresso();
        print(baverage1);

        Baverage baverage2 = new DarkRoast();
        baverage2.setSize(BaseBaverage.Size.GRANDE);
        baverage2 = new Mocha(baverage2);
        baverage2 = new Mocha(baverage2);
        baverage2 = new Whip(baverage2);
        print(baverage2);

        Baverage baverage3 = new HouseBlend();
        baverage3 = new Soy(baverage3);
        baverage3 = new Mocha(baverage3);
        baverage3.setSize(BaseBaverage.Size.VENTI);
        baverage3 = new Whip(baverage3);
        print(baverage3);
    }

    public static void print(Baverage baverage) {
        System.out.printf("%s (%s) $%f\n", baverage.getDescription(), baverage.getSize(), baverage.getCost());
    }

}