package starbuzz;

import starbuzz.base.DarkRoast;
import starbuzz.base.Espresso;
import starbuzz.base.HouseBlend;
import starbuzz.condiment.Mocha;
import starbuzz.condiment.Soy;
import starbuzz.condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String args[]) {
        Baverage baverage1 = new Espresso();
        System.out.println(baverage1.string());

        Baverage baverage2 = new DarkRoast();
        baverage2 = new Mocha(baverage2);
        baverage2 = new Mocha(baverage2);
        baverage2 = new Whip(baverage2);
        System.out.println(baverage2.string());

        Baverage baverage3 = new HouseBlend();
        baverage3 = new Soy(baverage3);
        baverage3 = new Mocha(baverage3);
        baverage3 = new Whip(baverage3);
        System.out.println(baverage3.string());
    }

}