import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    public void testIsValidInputValidChoice() {
        assertTrue(Player.isValidInput("rock"));
        assertTrue(Player.isValidInput("paper"));
        assertTrue(Player.isValidInput("scissors"));
    }

    @Test
    public void testIsValidInputInvalidChoice() {
        assertFalse(Player.isValidInput("invalidChoice"));
    }
}
