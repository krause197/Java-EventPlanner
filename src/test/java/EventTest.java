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
    Integer expected = 20;
    assertEquals(expected, testEvent.addFoodCost(10));
  }
}
