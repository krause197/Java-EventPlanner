import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventTest {

  @Test
  public void newEvent_initializesEvent(){
    Event testEvent = new Event(0, "", "", "");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void calcBaseCost_calculateCostfor1Guest_returnCost(){
    int guests = 1;
    Event testEvent = new Event(guests, "", "", "");
    Integer expected = 10;
    assertEquals(expected, testEvent.calcBaseCost());
  }

  @Test
  public void calcBaseCost_calculateCostMultGuest_returnCost(){
    int guests = 10;
    Event testEvent = new Event(guests, "", "", "");
    Integer expected = 100;
    assertEquals(expected, testEvent.calcBaseCost());
  }

  @Test
  public void addFoodCost_calculateOneFoodCostOption_returnCost(){
    String food = "Steak";
    int guests = 1;
    Event testEvent = new Event(guests, food, "", "");
    Integer expected = 100;
    assertEquals(expected, testEvent.addFoodCost(10));
  }

  @Test
  public void addFoodCost_CalcMultFoodMultGuestCostOptions_returnCost(){
    String food = "Lobster";
    int guests = 4;
    Event testEvent = new Event(guests, food, "", "");
    Integer expected = 400;
    assertEquals(expected, testEvent.addFoodCost(40));
  }

  @Test
  public void addBeverageCost_CalcOneBevCostOption_returnCost(){
    String beverages = "Softdrinks";
    int guests = 1;
    String food = "Steak";
    Event testEvent = new Event(guests, food, beverages, "");
    Integer expected = 100;
    assertEquals(expected, testEvent.addBeverageCost(100));
  }
}
