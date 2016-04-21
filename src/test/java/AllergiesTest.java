import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class AllergiesTest {

  @Test
    public void isAllergies_forCatAllergies_outputString() {
    Allergies allergies = new Allergies();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add("cats");
    assertEquals(expected, Allergies.allergies(128));
  }

  @Test
    public void isAllergies_forPollenAllergies_outputString() {
    Allergies allergies = new Allergies();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add("pollen");
    assertEquals(expected, Allergies.allergies(64));
  }

  @Test
    public void isAllergies_forShellfishAllergies_outputString() {
    Allergies allergies = new Allergies();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add("shellfish");
    assertEquals(expected, Allergies.allergies(4));
  }
}
