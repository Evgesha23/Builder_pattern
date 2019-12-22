package coffee;

public class Espresso extends CoffeeBuilder {
    @Override
    public void setTempOfWater() {coffee.setTempOfWater(new Water()); }

    @Override
    public void setInstantCoffee() {
        // not uses
    }

    @Override
    public void setInsolubleCoffee() {
        coffee.setInsolubleCoffee(new Beans(100.0));
    }

    @Override
    public void setAmountOfSugar() {
        coffee.setAmountOfSugar(new Sugar(0));
    }

    @Override
    public void setAmountOfMilk() {
       // not uses
    }
}
