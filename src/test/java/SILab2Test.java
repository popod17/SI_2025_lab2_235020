import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class SILab2Test {

    @Test
    public void multipleConditionsNullName(){
        Item newItem = new Item(null,20,20,20);
        List<Item> items = List.of(newItem);
        String karticka = "1234567891011121";

        RuntimeException ex = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(items,karticka);
        });

        assertEquals("Invalid item!", ex.getMessage());
    }

    @Test
    public void everyStatementCardNumberPovekjeOd16(){
        Item newItem = new Item("vistinskoIme",20,300,20);
        List<Item> items = List.of(newItem);
        String karticka = "1234567890123456789012345678"; //povekje od 16 brojki

        RuntimeException ex = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(items,karticka);
        });

        assertEquals("Invalid card number!", ex.getMessage());
    }
}
