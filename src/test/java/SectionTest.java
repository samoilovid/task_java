
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SectionTest {

    @Test
    public void testIsNotEqual() {
        Section section = new Section(2, 2, 1, 1, "blue");
        Section section1 = new Section(2, 3, 1, 1, "blue");
        boolean result = section.isEqual(section1);
        Assertions.assertNotEquals(result, true);
    }

    @Test
    public void testIsEqual() {
        Section section = new Section(2, 2, 1, 1, "blue");
        Section section1 = new Section(2, 2, 1, 1, "blue");
        boolean result = section.isEqual(section1);
        Assertions.assertEquals(result, true);
    }
}