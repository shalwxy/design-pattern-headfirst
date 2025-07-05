package pizza_store.creator.incredient_factory;

import pizza_store.ingredient.cheese.Cheese;
import pizza_store.ingredient.clam.Clam;
import pizza_store.ingredient.dough.Dough;
import pizza_store.ingredient.pepperoni.Pepperoni;
import pizza_store.ingredient.sauce.Sauce;
import pizza_store.ingredient.veggie.Veggie;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
