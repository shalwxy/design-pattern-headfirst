package pizza_store;

import pizza_store.creator.store.NYPizzaStore;
import pizza_store.creator.store.PizzaStore;
import pizza_store.pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.printf("=> 에단이 주문한 %s\n", pizza.getName());
    }
}
