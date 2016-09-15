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

  public Integer addFoodCost(int mGuests) {
    Integer foodCost = 0;
    if (mFood.equals("Steak")){
      foodCost = mGuests * 10;
    }
    if (mFood.equals("Lobster")){
      foodCost = mGuests * 10;
    }
    if (mFood.equals("Surf and Turf")){
      foodCost = mGuests * 15;
    }
    if (mFood.equals("Vegitarian")){
      foodCost = mGuests * 7;
    }
    return foodCost;
  }

  public Integer addBeverageCost(int mGuests) {
    Integer beveragesCost = 0;
    if (mBeverages.equals("Softdrinks")){
      beveragesCost = mGuests * 1;
    }
    if (mBeverages.equals("Cash Bar")){
      beveragesCost = mGuests * 2;
    }
    if (mBeverages.equals("Open Bar")){
      beveragesCost = mGuests * 15;
    }
    return beveragesCost;
  }
}
