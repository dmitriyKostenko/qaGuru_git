package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoTest {

    @Test
    void firstTest() {
        Assertions.assertFalse(3 > 5);
    }

    @Test
    void secondTest() {
        Assertions.assertFalse(4 > 6);
    }
}
