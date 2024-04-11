import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteJan1 {

    /**
     * 
     */
    @Test
    void testJan1() {
        Cal cal = new Cal();
        assertEquals(6, cal.jan1(2000)); // 1º de janeiro de 2000 é sábado (considerando 0 = domingo)
        assertEquals(3, cal.jan1(1986)); // 1º de janeiro de 1986 é quarta-feira
        assertEquals(3, cal.jan1(2003)); // 1º de janeiro de 2003 é quarta-feira
        assertEquals(2, cal.jan1(2024)); // 1º de janeiro de 2024 é segunda-feira
        assertEquals(0, cal.jan1(1900)); // Testando a virada do século, 1º de janeiro de 1900 é segunda-feira (considerando 0 = domingo)
    }
}
