import org.junit.*;
import static org.junit.Assert.*;


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
    Integer expected = 10;
    assertEquals(expected, testEvent.addFoodCost());
  }

  @Test
  public void addFoodCost_CalcMultFoodMultGuestCostOptions_returnCost(){
    String food = "Lobster";
    int guests = 4;
    Event testEvent = new Event(guests, food, "", "");
    Integer expected = 40;
    assertEquals(expected, testEvent.addFoodCost());
  }

  @Test
  public void addBeverageCost_CalcOneBevCostOption_returnCost(){
    String beverages = "Softdrinks";
    int guests = 1;
    Event testEvent = new Event(guests, "", beverages, "");
    Integer expected = 1;
    assertEquals(expected, testEvent.addBeverageCost());
  }

  @Test
  public void addBeverageCost_CalcMultBevCostOptions_returnCost(){
    String beverages = "Cash Bar";
    int guests = 2;
    Event testEvent = new Event(guests, "", beverages, "");
    Integer expected = 4;
    assertEquals(expected, testEvent.addBeverageCost());
  }

  @Test
  public void addBeverageCost_CalcMultBevCostOptions1_returnCost(){
    String beverages = "Open Bar";
    int guests = 2;
    Event testEvent = new Event(guests, "", beverages, "");
    Integer expected = 30;
    assertEquals(expected, testEvent.addBeverageCost());
  }

  @Test
  public void addEntertainmentCost_CalcEntertainmentCost_returnCost(){
    String entertainment = "Live Band";
    Event testEvent = new Event(1, "", "", entertainment);
    Integer expected = 2500;
    assertEquals(expected, testEvent.addEntertainmentCost());
  }

  @Test
  public void totalCost_CalcTotalCost_returnCost(){
    int guests = 10;
    String food = "Surf and Turf";
    String beverages = "Open Bar";
    String entertainment = "Live Band";
    Event testEvent = new Event (guests, food, beverages, entertainment);
    Integer expected = 2900;
    assertEquals(expected, testEvent.totalCost());
  }
}
