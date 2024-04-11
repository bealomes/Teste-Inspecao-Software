import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteIsLeap {

    /**
     * 
     */
    @Test
    void testIsLeap() {
        Cal cal = new Cal();
        assertFalse(cal.isLeap(1986)); // 1986 não é bissexto
        assertFalse(cal.isLeap(2003)); // 2003 não é bissexto
        assertTrue(cal.isLeap(2024));  // 2024 é bissexto
        assertTrue(cal.isLeap(2000)); // 2000 é bissexto por ser divisível por 400
        assertFalse(cal.isLeap(1900)); // 1900 não é bissexto (regra dos 100 anos, apesar de divisível por 4)
    }
}
