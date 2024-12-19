package souhail;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CHIFFRE_TO_ROMAINS_TEST{

@Test
public void testConvert1() {
            assertEquals("I", CHIFFRE_TO_ROMAINS_.convert(1));  
        }

@Test
void testConvert5() {
    assertEquals("V", CHIFFRE_TO_ROMAINS_.convert(5));
}

@Test
void testConvert10() {
    assertEquals("X", CHIFFRE_TO_ROMAINS_.convert(10)); 
}

    }
    