package coffee;

import java.util.Scanner;

public class LatteChoise extends CoffeeBuilder {

    Scanner cin = new Scanner(System.in);

    @Override
    public void setTempOfWater() {
        System.out.println("Желаемая температура: ");
        int temp = cin.nextInt();
        coffee.setTempOfWater(new Water(temp));
    }

    @Override
    public void setInstantCoffee() {
        coffee.setInstantCoffee(new Beans(50.0));
    }

    @Override
    public void setInsolubleCoffee() {
        // not uses
    }@Override


    public void setAmountOfSugar() {
        System.out.println("Количество сахара: ");
        int amount = cin.nextInt();
        coffee.setAmountOfSugar(new Sugar(amount));
    }

    @Override
    public void setAmountOfMilk() {
        System.out.println("Молоко (козье или коровье): ");
        String type = cin.next();
        coffee.setAmountOfMilk(new Milk(3, type));
    }
}
