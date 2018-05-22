import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {

    @Test
    public void hasListOfStrings() {
        Name name = new Name();
        assertEquals(21, name.getNames().size());
    }
}
