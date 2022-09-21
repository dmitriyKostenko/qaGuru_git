package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class DemoTest {

    @Test
    void firstTest() {
        Assertions.assertTrue( new Random().nextInt() > 1);
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(new Random().nextInt() > 2);
    }
}
