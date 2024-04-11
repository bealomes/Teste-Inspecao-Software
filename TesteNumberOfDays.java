import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteNumberOfDays {

    /**
     * 
     */
    @Test
    void testNumberOfDays() {
        Cal cal = new Cal();
        assertEquals(28, cal.numberOfDays(2, 1986)); // Fevereiro de 1986 tem 28 dias,não é bissexto
        assertEquals(29, cal.numberOfDays(2, 2000)); //Fevereiro de 2000 tem 29 dias (ano bissexto)
        assertEquals(28, cal.numberOfDays(2, 2003)); // Fevereiro de 2003 tem 28 dias, não é bissexto
        assertEquals(29, cal.numberOfDays(2, 2024)); // Fevereiro de 2024 tem 29 dias (ano bissexto)
        assertEquals(28, cal.numberOfDays(2, 1900)); // Fevereiro de 1900 tem 28 dias (não é considerado bissexto pela regra dos 100 anos)
    }
}
