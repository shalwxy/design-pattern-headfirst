package pizza_store;

import pizza_store.creator.store.ChicagoPizzaStore;
import pizza_store.creator.store.NYPizzaStore;
import pizza_store.creator.store.PizzaStore;
import pizza_store.pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.printf("=> 에단이 주문한 %s\n", pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.printf("=> 조엘이 주문한 %s\n", pizza.getName());
    }
}
