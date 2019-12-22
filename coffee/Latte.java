package coffee;

public class Latte extends CoffeeBuilder {
    @Override
    public void setTempOfWater() {coffee.setTempOfWater(new Water()); }

    @Override
    public void setInstantCoffee() {
      coffee.setInstantCoffee(new Beans(50.0));
    }

    @Override
    public void setInsolubleCoffee() {
        // not uses
    }

    @Override
    public void setAmountOfSugar() {
      coffee.setAmountOfSugar(new Sugar(2));
    }

    @Override
    public void setAmountOfMilk() {
       coffee.setAmountOfMilk(new Milk(3, "goat's"));
    }
}
