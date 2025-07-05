package pizza_store.pizza;

import pizza_store.ingredient.cheese.Cheese;
import pizza_store.ingredient.clam.Clam;
import pizza_store.ingredient.dough.Dough;
import pizza_store.ingredient.pepperoni.Pepperoni;
import pizza_store.ingredient.sauce.Sauce;
import pizza_store.ingredient.veggie.Veggie;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggie[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;
    public abstract void prepare();
    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }
    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }
    public void box() {
        System.out.println("상자에 피자 담기");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return  name;
    }
    public String toString() {
        // 피자 이름을 출력하는 부분
        return getName();
    }
}
