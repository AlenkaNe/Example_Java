import org.example.StringJoiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinTest {
    @Test
    protected void joinTest() {
        Assertions.assertEquals("Аня, Маша", StringJoiner.arrayToString(new String[] {"Аня", "Маша"}));
    }

    @Test
    void assertNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringJoiner.arrayToString(null));
    }
}
