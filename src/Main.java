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

        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to a 2 decimal places)");

        ////Set variable named priceText and assign it to the value of input.nextLine()
        priceText = input.nextLine();

        //Set double variable named price and set it equal to Double.parseDouble(priceText).
        price = Double.parseDouble(priceText);

        //Call the method redVelvet.setPrice() with the parameter of price.
        redVelvet.setPrice(price);

        //Print a message about pricing for red velvet
        System.out.println("We are deciding on the price for out red velvet cupcake. Here is the description: ");

        //Call method type on red velvet to get description
        chocolate.type();

        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to a 2 decimal places)");

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