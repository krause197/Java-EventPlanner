import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.println("...Krause Military Dinning Out or Dinning In Event Planning...");
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.println("We can't wait to help you plan your Dinning Out/In!");
    System.out.println("LETS GET STARTED");

    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    System.out.println("How many Soliders to you plan to have at your event?");
    String userGuests = myConsole.readLine();
    Integer guests = Integer.parseInt(userGuests);

    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    System.out.println("What kind of food would you like served for dinner?  \nWe offer 'Steak', 'Lobster', 'Surf and Turf', or a 'Vegitarian' meal. \n (Remember, it is a new Army!)");
    String food = myConsole.readLine();

    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    System.out.println("What kind of beverages would you like available for your Joes?  \nWe can provide 'Softdrinks' only (if your unit already has too many DUIs),\n'Cash Bar' (if your Officers are of the stingy type), or \n'Open Bar' (if your absolutely want to ensure no training is performed\n the day after, and feel a few more Article 15s on your desk isn't \nthe end of the world)");
    String beverages = myConsole.readLine();

    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    System.out.println("What kind of entertainment would your Soldiers most enjoy? \n We can provide a 'Live Band', a 'DJ', or an 'iPod' playlist.");
    String entertainment = myConsole.readLine();

    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    Event newEvent = new Event(guests, food, beverages, entertainment);

    System.out.println("So let me break down your request barney style: You have " + newEvent.getGuests() + " Solders attending,\n would like to feed them " + newEvent.getFood() + " , want to have " + newEvent.getBeverages() + " for drinks,\n and want a " + newEvent.getEntertainment() + " to keep your Soldiers entertained.");

    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    System.out.println("Your Dinning Out/In will cost a total of $" + newEvent.totalCost() + ". I suggest you make\n the Officers and Senior Enlisted pay more to attend than the Lower Enlisted.");

    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    System.out.println("Here are your expenses broken down:\n There is a base cost of $" + newEvent.calcBaseCost() + ".\n Your food costs of $" + newEvent.addFoodCost() + ".\n Your choice of beverage option costs $" + newEvent.addBeverageCost() + ".\n Your entertainment costs $" + newEvent.addEntertainmentCost() + ".");

  }
}
