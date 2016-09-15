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

  public Integer calcCost() {
    Integer cost = (mGuests * 10);
    return cost;
  }


}
