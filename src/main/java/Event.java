import java.util.ArrayList;
import java.util.List;

public class Event {
  private int mGuests;
  private String mFood;
  private String mBeverages;
  private String mEntertainment;


  public Event(int guests, String food, String beverages, String entertainment) {
    mGuests = guests;
    mFood = food;
    mBeverages = beverages;
    mEntertainment = entertainment;
  }

  public Integer calcBaseCost() {
    Integer baseCost = (mGuests * 10);
    return baseCost;
  }

  public Integer addFoodCost() {
    Integer foodCost = 0;
    if (mFood.equals("Steak")){
      foodCost = mGuests * 10;
    } else if (mFood.equals("Lobster")){
      foodCost = mGuests * 10;
    } else if (mFood.equals("Surf and Turf")){
      foodCost = mGuests * 15;
    } else if (mFood.equals("Vegitarian")){
      foodCost = mGuests * 7;
    }
    return foodCost;
  }

  public Integer addBeverageCost() {
    Integer beveragesCost = 0;
    if (mBeverages.equals("Softdrinks")){
      beveragesCost = mGuests * 1;
    } else if (mBeverages.equals("Cash Bar")){
      beveragesCost = mGuests * 2;
    } else if (mBeverages.equals("Open Bar")){
      beveragesCost = mGuests * 15;
    }
    return beveragesCost;
  }

  public Integer addEntertainmentCost() {
    Integer entertainmentCost = 0;
    if (mEntertainment.equals("Live Band")){
      entertainmentCost = 2500;
    } else if (mEntertainment.equals("DJ")){
      entertainmentCost = 500;
    } else if (mEntertainment.equals("iPod")){
      entertainmentCost = 100;
    }
    return entertainmentCost;
  }

  public Integer totalCost() {
    Integer totalCost = (calcBaseCost()) + (addFoodCost()) + (addBeverageCost()) + (addEntertainmentCost());
    return totalCost;
  }
}
