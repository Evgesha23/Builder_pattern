package coffee;

abstract class CoffeeBuilder {
    protected String tempOfWater;
    protected String instant;
    protected String insoluble;
    protected int sugar;
    protected int milk;

    public Coffee coffee;
    public CoffeeBuilder() {
        coffee = new Coffee();
    }
    public Coffee getCoffee() {
        return coffee;
    }
    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract void setTempOfWater();
    public abstract void setInsolubleCoffee();
    public abstract void setInstantCoffee();
    public abstract void setAmountOfSugar();
    public abstract void setAmountOfMilk();
}
