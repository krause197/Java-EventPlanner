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
  public void calcCost_calculateCostfor1Guest_returncost(){
    Event testEvent = new Event(0, "", "", "");
    int guest = 1;
    Integer expected = 10;
    assertEquals(expected, testEvent.calcCost());
  }
}
