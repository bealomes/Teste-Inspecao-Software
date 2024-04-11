import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteCal {

    /**
     * 
     */
    @Test
    void testCalSeptember2003() {
        Cal cal = new Cal();
        // Setembro de 2003 começa em segunda-feira, então dds = 1
        // Setembro tem 30 dias
        String expectedSeptember2003 = " 1  2  3  4  5  6 \n 7  8  9 10 11 12 13 \n14 15 16 17 18 19 20 \n21 22 23 24 25 26 27 \n28 29 30 ";
        assertEquals(expectedSeptember2003.trim(), cal.cal(1, 30).trim());
    }

    @Test
    void testCalJuly1986() {
        Cal cal = new Cal();
        // Julho de 1986 começa em terça-feira, então dds = 2
        // Julho tem 31 dias
        String expectedJuly1986 = "       1  2  3  4  5 \n 6  7  8  9 10 11 12 \n13 14 15 16 17 18 19 \n20 21 22 23 24 25 26 \n27 28 29 30 31 ";
        assertEquals(expectedJuly1986.trim(), cal.cal(2, 31).trim());
    }

    // Mantendo os outros testes para referência
    @Test
    void testCalJanuary2024() {
        Cal cal = new Cal();
        // Janeiro de 2024 começa em segunda-feira, então dds = 1
        // Janeiro tem 31 dias
        String expectedJanuary2024 = "    1  2  3  4  5 \n 6  7  8  9 10 11 12 \n13 14 15 16 17 18 19 \n20 21 22 23 24 25 26 \n27 28 29 30 31 ";
        assertEquals(expectedJanuary2024.trim(), cal.cal(1, 31).trim());
    }

    @Test
    void testCalMarch1900() {
        Cal cal = new Cal();
        // Março de 1900 começa em quinta-feira, então dds = 4
        // Março tem 31 dias
        String expectedMarch1900 = "             1  2  3 \n 4  5  6  7  8  9 10 \n11 12 13 14 15 16 17 \n18 19 20 21 22 23 24 \n25 26 27 28 29 30 31 ";
        assertEquals(expectedMarch1900.trim(), cal.cal(4, 31).trim());
    }
}
