package coffee;

public class WarkerCoffee{
    private CoffeeBuilder coffeeBuilder;

    public void setCoffeeBuilder(CoffeeBuilder coffeeBuilder) {
        this.coffeeBuilder = coffeeBuilder;
    }

    public Coffee getCoffee() {
        return coffeeBuilder.getCoffee();
    }

    //создающий метод, включающий методы настройки создаваемого продукта(вызываются цепочкой)
    //(собирает все компоненты вместе)
    public void DoCoffee () {
        coffeeBuilder.setTempOfWater();
        coffeeBuilder.setInstantCoffee();
        coffeeBuilder.setInsolubleCoffee();
        coffeeBuilder.setAmountOfSugar();
        coffeeBuilder.setAmountOfMilk();
    }
}
