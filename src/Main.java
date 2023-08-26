import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //create a new ArrayList that contains Cupcake objects
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
    //Create a new Cupcake object named cupcake.
        Cupcake cupcake = new Cupcake();
    //Create a new RedVelvet object named redVelvet.
        RedVelvet redVelvet = new RedVelvet();
    //Create a new Chocolate object named chocolate.
        Chocolate chocolate = new Chocolate();

        //Print a message about the pricing for standard cupcake
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");

        //Create a Scanner object named input so we can accept the user’s input.
        Scanner input = new Scanner(System.in);
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");

        //Call the method cupcake.type() to get the description of the standard cupcake
        cupcake.type();

        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to a 2 decimal places)");

        //Create a String variable named priceText and assign it to the value of input.nextLine()
        String priceText = input.nextLine();

        //Create a double variable named price and set it equal to Double.parseDouble(priceText).
        double price = Double.parseDouble(priceText);

        //Call the method cupcake.setPrice() with the parameter of price.
        cupcake.setPrice(price);

        //Print a message about pricing for red velvet
        System.out.println("We are deciding on the price for out red velvet cupcake. Here is the description: ");

        //Call method type on red velvet to get description
        redVelvet.type();

        System.out.println("How much would you like to charge for the red velvet cupcake? (Input a numerical number taken to a 2 decimal places)");

        ////Set variable named priceText and assign it to the value of input.nextLine()
        priceText = input.nextLine();

        //Set double variable named price and set it equal to Double.parseDouble(priceText).
        price = Double.parseDouble(priceText);

        //Call the method redVelvet.setPrice() with the parameter of price.
        redVelvet.setPrice(price);

        //Print a message about pricing for red velvet
        System.out.println("We are deciding on the price for out chocolate cupcake. Here is the description: ");

        //Call method type on chocolate to get description
        chocolate.type();

        System.out.println("How much would you like to charge for the chocolate cupcake? (Input a numerical number taken to a 2 decimal places)");

        ////Set variable named priceText and assign it to the value of input.nextLine()
        priceText = input.nextLine();

        //Set double variable named price and set it equal to Double.parseDouble(priceText).
        price = Double.parseDouble(priceText);

        //Call the method chocolate.setPrice() with the parameter of price.
        chocolate.setPrice(price);

        //add each of these Cupcake objects to the cupcakeMenu ArrayList.
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        //Create a new ArrayList which contains Drink objects and name it drinkMenu.
        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        //Create a new Drink object named water.
        Drink drink = new Drink();
        //Create a new Soda object named soda.
        Soda soda = new Soda();
        //Create a new Milk object named milk.
        Milk milk = new Milk();


        //Print a message about the pricing for drink
        System.out.println("We are in the middle of creating the drink menu. We currently have three drinks on the menu but we need to decide on pricing.");

        //Set the Scanner object named input to accept the user’s input.
        input = new Scanner(System.in);
        System.out.println("We are deciding on the price for our drink. Here is the description: ");

        //Call the method cupcake.type() to get the description of the standard cupcake
        drink.type();

        System.out.println("How much would you like to charge for the drink? (Input a numerical number taken to a 2 decimal places)");

        //Set variable named priceText and assign it to the value of input.nextLine()
        priceText = input.nextLine();

        //Set double variable named price and set it equal to Double.parseDouble(priceText).
        price = Double.parseDouble(priceText);

        //Call the method drink.setPrice() with the parameter of price.
        drink.setPrice(price);

        //Print a message about pricing for soda
        System.out.println("We are deciding on the price for out soda. Here is the description: ");

        //Call method type on soda to get description
        soda.type();

        System.out.println("How much would you like to charge for the soda? (Input a numerical number taken to a 2 decimal places)");

        ////Set variable named priceText and assign it to the value of input.nextLine()
        priceText = input.nextLine();

        //Set double variable named price and set it equal to Double.parseDouble(priceText).
        price = Double.parseDouble(priceText);

        //Call the method redVelvet.setPrice() with the parameter of price.
        soda.setPrice(price);

        //Print a message about pricing for red velvet
        System.out.println("We are deciding on the price for out milk. Here is the description: ");

        //Call method type on milk to get description
        milk.type();

        System.out.println("How much would you like to charge for the milk? (Input a numerical number taken to a 2 decimal places)");

        ////Set variable named priceText and assign it to the value of input.nextLine()
        priceText = input.nextLine();

        //Set double variable named price and set it equal to Double.parseDouble(priceText).
        price = Double.parseDouble(priceText);

        //Call the method chocolate.setPrice() with the parameter of price.
        milk.setPrice(price);

        //Add each of these Drink objects to the drinkMenu ArrayList.
        drinkMenu.add(drink);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        //Call the Order constructor and pass in cupcakeMenu and drinkMenu as parameters.
        new Order(cupcakeMenu, drinkMenu);

    }
}
//Create a class CupCake. This will be the clas other cupcakes inherit from
class Cupcake{
    //create a public double variable price
    public double price;

    ///create a public function getPrice, has no param and returns price
    public double getPrice() {
        return price;
    }

    //create a public void function setPrice, one param price
    public void setPrice(double price) {
        this.price = price;
    }

    //create a public function that prints a message
    public void type(){
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}
// Create a new class named RedVelvet that extends from Cupcake
class RedVelvet extends Cupcake{
    // Create a public function named type that returns void and prints a description of the cupcake
    @Override
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting");
    }
}

// Create a new class named Chocolate that extends from Cupcake
class Chocolate extends Cupcake{
    // Create a public function named type that returns void and prints a description of the cupcake
    @Override
    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
}

//Create a new class Drink that others drink classes will inherit from. It should have public double variable price with empty value
// and three methods, getPrice, setPrice, type
class Drink {
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type (){
        System.out.println("A bottle of water.");
    }
}

//Create a new class Soda that extends from Drink
class Soda extends Drink{
    @Override
    public void type() {
        System.out.println("A bottle of soda.");
    }
}

//Create a new class Milk that extends from Drink
class Milk extends Drink{
    @Override
    public void type() {
        System.out.println("A bottle of milk.");
    }
}
