import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteFirstOfMonth {

    /**
     * 
     */
    @Test
    void testFirstOfMonth() {// Testar o primeiro dia de janeiro de um determinado ano
        Cal cal = new Cal();
        assertEquals(3, cal.firstOfMonth(1, 1986)); // 1º de janeiro de 1986 é quarta-feira
        assertEquals(3, cal.firstOfMonth(1, 2003)); // 1º de janeiro de 2003 é quarta-feira
        assertEquals(1, cal.firstOfMonth(1, 2024)); // 1º de janeiro de 2024 é segunda-feira
        assertEquals(1, cal.firstOfMonth(1, 1900)); // 1º de janeiro de 1900 é segunda-feira
    }
}
