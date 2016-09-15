import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventTest {

  @Test
  public void newEvent_initializesEvent(){
    Event testEvent = new Event();
    assertEquals(true, testEvent instanceof Event);
  }
}
