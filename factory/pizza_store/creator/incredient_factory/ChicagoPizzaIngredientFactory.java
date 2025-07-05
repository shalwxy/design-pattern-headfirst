package pizza_store.creator.incredient_factory;

import pizza_store.ingredient.cheese.Cheese;
import pizza_store.ingredient.cheese.CheeseMozzarella;
import pizza_store.ingredient.clam.Clam;
import pizza_store.ingredient.clam.ClamFrozen;
import pizza_store.ingredient.dough.Dough;
import pizza_store.ingredient.dough.DoughThickCrust;
import pizza_store.ingredient.pepperoni.Pepperoni;
import pizza_store.ingredient.pepperoni.PepperoniSliced;
import pizza_store.ingredient.sauce.Sauce;
import pizza_store.ingredient.sauce.SaucePlumTomato;
import pizza_store.ingredient.veggie.BlackOlives;
import pizza_store.ingredient.veggie.EggPlant;
import pizza_store.ingredient.veggie.Spinach;
import pizza_store.ingredient.veggie.Veggie;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new DoughThickCrust();
    }

    @Override
    public Sauce createSauce() {
        return new SaucePlumTomato();
    }

    @Override
    public Cheese createCheese() {
        return new CheeseMozzarella();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{ new EggPlant(), new Spinach(), new BlackOlives() };
    }
    
    @Override
    public Pepperoni createPepperoni() {
        return new PepperoniSliced();
    }

    @Override
    public Clam createClam() {
        return new ClamFrozen();
    }
}
