package coffee;

import java.util.*;

class Main {
   public static void main(String[] args) {

    //Строитель - шаблон проектирования, который инкапсулирует создание объекта и позволяет разделить его на различные этапы.

    Scanner cin = new Scanner(System.in);

    int number;
    while (true) {
     System.out.println("\nВыберите напиток: ");
     System.out.println("--------------------------------------------");
     System.out.println("1 - Латте");
     System.out.println("2 - Капучино");
     System.out.println("3 - Эспрессо");
     System.out.println("0 - exit");
     System.out.println("5 - Латте собственного приготовления");
     System.out.println("--------------------------------------------");
     number = cin.nextInt();
     switch(number) {
      case 0:
       return;
      case 1:
       WarkerCoffee warker1 = new WarkerCoffee();
       CoffeeBuilder builder = new Latte();

       //warker1 получает объект конкретного строителя от клиента
       warker1.setCoffeeBuilder(builder);
       warker1.DoCoffee();

       //готовый продукт возвращает строитель,так как warker1 чаще всего не
          // знает и не зависит от конкретных классов строителей и продуктов.
       Coffee latte = warker1.getCoffee();
       System.out.println(latte);
       break;
      case 2:
       WarkerCoffee warker2 = new WarkerCoffee();
       CoffeeBuilder builder2 = new Capuchino();
       warker2.setCoffeeBuilder(builder2);
       warker2.DoCoffee();
       Coffee capuchino = warker2.getCoffee();
       System.out.println(capuchino);
       break;
      case 3:
       WarkerCoffee warker3 = new WarkerCoffee();
       CoffeeBuilder builder3 = new Espresso();
       warker3.setCoffeeBuilder(builder3);
       warker3.DoCoffee();
       Coffee espresso = warker3.getCoffee();
       System.out.println(espresso);
      break;
      case 5:
       WarkerCoffee warker5 = new WarkerCoffee();
       CoffeeBuilder builder5 = new LatteChoise();
       warker5.setCoffeeBuilder(builder5);
       warker5.DoCoffee();
       Coffee latte5 = warker5.getCoffee();
       System.out.println(latte5);
       break;
     }
    }
    }
}
