import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import  java.time.LocalDate;
import java.io.File;

public class Order {

    //create a public constructor function named Order with the following parameters: an ArrayList of Cupcake objects named cupcakeMenu, and an ArrayList of Drink objects named drinkMenu.
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu){
        //Print “Hello customer. Would you like to place an order? (Y or N)”.
        System.out.println("Hello customer. \nWould you like do place an order ? \nY or N");
        //Create a Scanner object to accept the users input, and assign the input to a String variable named placeOrder.
        Scanner input = new Scanner(System.in);
        String placeOrder = input.nextLine();

        //Create an Arraylist of Objects and name it order. Note: we are creating an ArrayList of Objects so any objects can be added to the ArrayList - they do not have to all be the same type.
        ArrayList<Object> order = new ArrayList<Object>();

        //Checks if placeOrder equals Y ignoring capitalization.
        if(placeOrder.equalsIgnoreCase("Y")){
            //Add LocalDate.now() to order.
            order.add(LocalDate.now());
            //Add LocalTime.now() to order.
            order.add(LocalTime.now());

            //Print "Here is the menu"
            System.out.println("Here is the menu");

            //Print Cupcakes
            System.out.println("CUPCAKES");
            //Create an int variable named itemNumber and set it equal to 0.
            int itemNumber = 0;
            //Create a for loop that iterates through each index of the cupcakeMenu ArrayList.
            for(int i=0; i<cupcakeMenu.size(); i++){
                //increment itemNumber by one.
                itemNumber ++;
                //Print itemNumber.
                System.out.println(itemNumber);
                //type of cupcake at cupcakeMenu at i by calling the type() method.
                cupcakeMenu.get(i).type();
                //Print “Price: “ with the price being the price of that cupcake.
                System.out.println("Price: " + cupcakeMenu.get(i).getPrice());

                System.out.println();
            }
            //Print “DRINKS:”
            System.out.println("DRINKS");
            //Create a for loop that iterates through each index of the drinkMenu ArrayList.
            for(int i=0; i < drinkMenu.size(); i++){
                //increment itemNumber by one
                itemNumber++;
                //Print itemNumber.
                System.out.println(itemNumber);
                // type of drink at drinkMenu at i by calling the type() method.
                drinkMenu.get(i).type();
                //“Price: “ with the price being the price of that drink.
                System.out.println("Price: " + drinkMenu.get(i).getPrice());

                System.out.println();
            }

        }
        //In the else block, print “Have a nice day then.”
        else {
            System.out.println("Have a nice day then.");
        }

        //Create a boolean variable named ordering and set it equal to true.
        boolean ordering = true;

        //Create a while loop that continues as long as the value of ordering is true.
        while(ordering == true){
            System.out.println("What would you like to order ? \nPlease use the number associated with each item to order");
            //Create an int variable named orderChoice and set it equal to input.nextInt().
            int orderChoice = input.nextInt();
            input.nextLine();

            //Create an if statement that checks if orderChoice equals 1. If so, add the first item from the cupcakeMenu ArrayList to the order ArrayList and print “Item added to order”.
            if(orderChoice == 1){
                order.add(cupcakeMenu.get(0));
                System.out.println("Item added to order");

            } // else if statement that checks if orderChoice equals 2. If so, add the second item from the cupcakeMenu ArrayList to the order ArrayList and print “Item added to order”.
            else if(orderChoice == 2) {
                order.add(cupcakeMenu.get(1));
                System.out.println("Item added to order");

            }// else if statement that checks if orderChoice equals 3. If so, add the second item from the cupcakeMenu ArrayList to the order ArrayList and print “Item added to order”.
            else if(orderChoice == 3) {
                order.add(cupcakeMenu.get(2));
                System.out.println("Item added to order");
            } // else if statement that checks if orderChoice equals 4. If so, add the second item from the cupcakeMenu ArrayList to the order ArrayList and print “Item added to order”.
            else if(orderChoice == 4) {
                order.add(drinkMenu.get(0));
                System.out.println("Item added to order");
            } // else if statement that checks if orderChoice equals 5. If so, add the second item from the cupcakeMenu ArrayList to the order ArrayList and print “Item added to order”.
            else if(orderChoice == 5) {
                order.add(drinkMenu.get(1));
                System.out.println("Item added to order");
            } // else if statement that checks if orderChoice equals 6. If so, add the second item from the cupcakeMenu ArrayList to the order ArrayList and print “Item added to order”.
            else if(orderChoice == 6) {
                order.add(drinkMenu.get(2));
                System.out.println("Item added to order");
            } else {
                System.out.println("Sorry, we don't seem to have that on the menu");
            }

            System.out.println("Would you like to continue order ? \n Y/N");
            placeOrder = input.nextLine();

            //Create an if statement that checks if placeOrder does NOT equal Y ignoring capitalization. If so, set ordering equal to false.
            if(!placeOrder.equalsIgnoreCase("Y")){
                    ordering = false;
            }


        }

        //Print the first item in the order
        System.out.println(order.get(0));
        //Print the second item in the order
        System.out.println(order.get(1));
        //Create a double variable named subtotal and initialize it to 0.0.
        double subtotal = 0.0;
        //Create a for loop that starts at i = 2 and continues incrementing by 1, while i is less than the order size.
        for(int i=2; i < order.size(); i++){
            //Check if order at i is equal to cupcakeMenu at 0. If so:
            if(order.get(i).equals(cupcakeMenu.get(0))){
                //Get the value of cupcakeMenu at index 0, and run the type() method on the Cupcake object.
                cupcakeMenu.get(0).type();
                //print the price of that cupcake
                System.out.println("Price: " + cupcakeMenu.get(0).getPrice());
                //Set subtotal equal to subtotal plus the price of the cupcake.
                subtotal = subtotal + cupcakeMenu.get(0).getPrice();
            } else if(order.get(i).equals(cupcakeMenu.get(1))){
                //Get the value of cupcakeMenu at index 1, and run the type() method on the Cupcake object.
                cupcakeMenu.get(1).type();
                //print the price of that cupcake
                System.out.println("Price: " + cupcakeMenu.get(1).getPrice());
                //Set subtotal equal to subtotal plus the price of the cupcake.
                subtotal = subtotal + cupcakeMenu.get(1).getPrice();
            } else if( order.get(i).equals(cupcakeMenu.get(2))){
                //Get the value of cupcakeMenu at index 2, and run the type() method on the Cupcake object.
                cupcakeMenu.get(2).type();
                //print the price of that cupcake
                System.out.println("Price: " + cupcakeMenu.get(2).getPrice());
                //Set subtotal equal to subtotal plus the price of the cupcake.
                subtotal = subtotal + cupcakeMenu.get(2).getPrice();
            } else if( order.get(i).equals(drinkMenu.get(0))){
                //Get the value of drinkMenu at index 0, and run the type() method on the Drink object.
                drinkMenu.get(0).type();
                //print the price of that drink
                System.out.println("Price: " + drinkMenu.get(0).getPrice());
                //Set subtotal equal to subtotal plus the price of the drink.
                subtotal = subtotal + drinkMenu.get(0).getPrice();
            } else if(order.get(i).equals(drinkMenu.get(1))){
                //Get the value of drinkMenu at index 1, and run the type() method on the Drink object.
                drinkMenu.get(1).type();
                //print the price of that drink
                System.out.println("Price: " + drinkMenu.get(1).getPrice());
                //Set subtotal equal to subtotal plus the price of the drink.
                subtotal = subtotal + drinkMenu.get(1).getPrice();
            } else if(order.get(2).equals(drinkMenu.get(2))){
                //Get the value of drinkMenu at index 2, and run the type() method on the Drink object.
                drinkMenu.get(2).type();
                //print the price of that drink
                System.out.println("Price: " + drinkMenu.get(2).getPrice());
                //Set subtotal equal to subtotal plus the price of the drink.
                subtotal = subtotal + drinkMenu.get(2).getPrice();
            }

            //Print subtotal
            System.out.println("Subtotal: " + subtotal);

            //Call CreateFile class
            new CreateFile();
            //Call WriteToFile class passing the param order
            new WriteToFile(order);

        }

    }
}

//Create a class named CreateFile
class CreateFile{
    public CreateFile(){
        try{
            // Create a File object named salesData and set it equal to a new File with the parameter "salesData.txt"
            File salesData = new File("salesData.txt");
            // Create an if statement with that parameter salesData.createNewFile()
            // .createNewFile() will return true if a new file is created
            if (salesData.createNewFile())
            {
                System.out.println("File created: " + salesData.getName());
            }
            else
            {
                System.out.println("File already exists");
            }
        } catch (IOException e){
            System.out.println("An error occurred");
        }
    }
}
//Create a class named WriteToFile
class WriteToFile{
    public WriteToFile(ArrayList<Object> order){
        //Create a try catch block, with a catch parameter of IOException e.
        try {
            FileWriter fw = new FileWriter("salesData.txt", true);
            //Create a new PrintWriter object named salesWriter, and set it equal to new PrintWriter object whose constructor parameter is the FileWriter object fw created previously.
            PrintWriter salesWriter = new PrintWriter(fw);
            //Iterate through each element in order using a for loop to print the values by calling the method .println()
            //on the salesWriter object.
            for(int i=0; i<order.size(); i++ ){
                salesWriter.println(order.get(i));
            }
            //Stop the writer from continuing to run
            salesWriter.close();

            System.out.println("Successfully wrote to the file");
        } catch (IOException e){
            System.out.println("An error occurred.");
        }
    }
}


