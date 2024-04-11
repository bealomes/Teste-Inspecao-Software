import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TesteMain {

    /**
     * 
     */
    @Test
    void testMain() {
        // Redireciona a saída padrão para um fluxo de bytes
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Chama o método main com argumentos específicos
        String[] args = {"9", "2023"};
        Cal.main(args);

        // Obtém a saída do método main
        String output = outputStream.toString();

        // Verifica se a saída contém o mês e ano corretos
        assertTrue(output.contains("Setembro 2023"));
        // Adicione mais verificações conforme necessário para outros casos de teste
    }
}
