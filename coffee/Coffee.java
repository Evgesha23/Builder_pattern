package coffee;

public class Coffee {
    //растворимый кофе
    private Beans InstantCoffee;
    //нерастворимый кофе
    private Beans InsolubleCoffee;
    //температура воды
    private Water TempOfWater;
    //количество сахара
    private Sugar AmountOfSugar;
    //количество молока
    private Milk AmountOfMilk;

    public Beans getInsolubleCoffee() {
        return InsolubleCoffee;
    }
    public Beans getInstantCoffee() {
        return InstantCoffee;
    }
    public Sugar getAmountOfSugar() {
        return AmountOfSugar;
    }
    public Milk getAmountOfMilk() {
        return AmountOfMilk;
    }
    public Water getTempOfWater() {
        return TempOfWater;
    }

    public void setInstantCoffee(Beans instantCoffee) {
        InstantCoffee = instantCoffee;
    }
    public void setInsolubleCoffee(Beans insolubleCoffee) {
        InsolubleCoffee = insolubleCoffee;
    }
    public void setTempOfWater(Water tempOfWater) {
        TempOfWater = tempOfWater;
    }
    public void setAmountOfSugar(Sugar amountOfSugar) {
        AmountOfSugar = amountOfSugar;
    }
    public void setAmountOfMilk(Milk amountOfMilk) {
        AmountOfMilk = amountOfMilk;
    }

    @Override
    public String toString() {
        if (InstantCoffee != null) System.out.println("(Используется растворимый кофе) " + InstantCoffee);
        if (InsolubleCoffee != null) System.out.println("(Используется нерастворимый кофе) " + InsolubleCoffee);
        if (TempOfWater != null) System.out.println(TempOfWater);

        return AmountOfSugar + " " + AmountOfMilk;
    }
}

class Water {
    private int temperature;
    public Water() {this.temperature = 70;}
    public Water(int temperature) {this.temperature = temperature;}

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Температура воды: " + temperature;
    }
}
class Beans {
    private double cost;

    public Beans() {this.cost = 0;}
    public Beans(double cost) {this.cost = cost;}

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "\nЦена: " + cost;
    }
}
class Sugar {
    private int amount;

    public Sugar() {this.amount = 0;}
    public Sugar(int amount) {this.amount = amount;}

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Сахар: " + amount;
    }
}
class Milk {
    private int shelfLife;
    private String type;

    public Milk() {this.shelfLife = 3; this.type = "cow's";}
    public Milk(int shelfLife, String type) {this.shelfLife = shelfLife; this.type = type;}

    public int getShelfLife() {
        return shelfLife;
    }
    public String getType() { return type;}

    @Override
    public String toString() {
        return "\nМолоко: " + type + " (" + shelfLife + ") ";
    }
}