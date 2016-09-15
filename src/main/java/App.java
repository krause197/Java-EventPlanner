public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("...Krause Military Dinning Out or Dinning In Event Planning...");
    System.out.println("We can't wait to help you plan your Dinning Out/In!");
    System.out.println("LETS GET STARTED");

    boolean run = true;
    String userStartStop;
    while (run) {
      userStartStop = console.readline("Would you like to plan your event?  Enter 'yes' to begin or enter 'no' to end the program");
      if (userStartStop.equals("yes")) {
        String userGuests = console.readline("How many Soliders to you plan to have at your event?");
        int guests = Integer.parseInt(userguests);

        System.out.println("Roger, " + userGuests + " Service Members.  Remember to invite all past Commanders and Command Sergeant Majors!");

        String food = console.readline("What kind of food would you like served for dinner?  \nWe offer 'Steak', 'Lobster', 'Surf and Turf', or a 'Vegitarian' meal (Remember, it is a new Army!)");

        String beverages = console.readline("What kind of beverages would you like available for your Joes?  \nWe can provide 'Softdrinks' only (if your unit already has too many DUIs),\n 'Cash Bar' (if your Officers are of the stingy type), or \n'Open Bar' (if your absolutely want to ensure no training is performed the day after,\n and feel a few more Article 15s on your desk isn't the end of the world)");

        String entertainment = console.readline("What kind of entertainment would your Soldier's most enjoy? \n We can provide a 'Live Band', a 'DJ', or an 'iPod' playlist.");

        Event newEvent = new Event(guests, food, beverages, entertainment);

        System.out.println("So let me break down your request barney style: You have " + newEvent.getGuests() + " Solders attending,\n would like to feed them " + newEvent.getFood() + " ,\n want to have " + newEvent.getBeverages() + " for drinks,\n and want a " + newEvent.getEntertainment() + " to keep your Soldiers entertained.");

        System.out.println("Your Dinning Out/In will cost a total of " + newEvent.totalCost() + ". I suggest you make the Officers and Senior Enlisted pay more to attend than the Lower Enlisted.");

        System.out.println("Here are your expenses broken down:\n  There is a base cost of $" + newEvent.calcBaseCost() + ",\n your food costs of $" + newEvent.addFoodCost() + ",\n your choice of beverage option costs $" + newEvent.addBeverageCost() + ",\n and your entertainment costs $" + newEvent.addEntertainmentCost() + ".");

      } else if(userStartStop.equals("no")) {
          run = false;
      }
    }
  }
}
