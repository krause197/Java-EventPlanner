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

  public Integer addFoodCost(int baseCost) {
    Integer foodCost = 0;
    if (mFood.equals("Steak")){
      foodCost = baseCost + 10;
    }
    return foodCost;
  }
}
