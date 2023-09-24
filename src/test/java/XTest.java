import static org.junit.jupiter.api.Assertions.assertTrue;

import org.example.X;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XTest {
    @Test
    public void SquarePlusOneTest() {
        X myTest = new X();
        int value = myTest.SquarePlusOne(5);
        Assertions.assertEquals(26, value);
    }
}
