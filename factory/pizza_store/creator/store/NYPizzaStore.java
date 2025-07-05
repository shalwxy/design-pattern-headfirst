package pizza_store.creator.store;

import pizza_store.creator.incredient_factory.NYPizzaIngredientFactory;
import pizza_store.creator.incredient_factory.PizzaIngredientFactory;
import pizza_store.pizza.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (item) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("뉴욕 스타일 치즈 피자");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("뉴욕 스타일 야채 피자");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("뉴욕 스타일 조개 피자");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("뉴욕 스타일 페퍼로니 피자");
            }
        }
        return pizza;
    }
}
