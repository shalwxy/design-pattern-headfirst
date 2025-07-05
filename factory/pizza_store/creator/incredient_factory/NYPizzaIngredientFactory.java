package pizza_store.creator.incredient_factory;

import pizza_store.ingredient.cheese.Cheese;
import pizza_store.ingredient.cheese.CheeseReggiano;
import pizza_store.ingredient.clam.Clam;
import pizza_store.ingredient.clam.ClamFresh;
import pizza_store.ingredient.dough.Dough;
import pizza_store.ingredient.dough.DoughThinCrust;
import pizza_store.ingredient.pepperoni.Pepperoni;
import pizza_store.ingredient.pepperoni.PepperoniSliced;
import pizza_store.ingredient.sauce.Sauce;
import pizza_store.ingredient.sauce.SauceMarinara;
import pizza_store.ingredient.veggie.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new DoughThinCrust();
    }

    @Override
    public Sauce createSauce() {
        return new SauceMarinara();
    }

    @Override
    public Cheese createCheese() {
        return new CheeseReggiano();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{ new Garlic(), new Onion(), new Mushroom(), new Redpepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new PepperoniSliced();
    }

    @Override
    public Clam createClam() {
        return new ClamFresh();
    }
}
