import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeEach
    public void beforeEach() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void add() {
        int result = phoneBook.add("Harry", 4568126);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void findByNumber() {
        String result = phoneBook.findByNumber(4568126);
        Assertions.assertNotNull(result);
    }

    @Test
    public void findByNameEquals() {
        phoneBook.add("Harry", 4568126);
        int result = phoneBook.findByName("Harry");
        Assertions.assertEquals(4568126, result);
    }

    @Test
    public void findByNameDoesNotThrow() {
        Assertions.assertDoesNotThrow(() -> phoneBook.findByName("Ron"));
    }

    @Test
    public void printAllNames() {
        phoneBook.add("Frank", 123);
        phoneBook.add("Harry", 643);
        phoneBook.add("Eugen", 455);
        String expected =
                """
                        Name: Eugen | Number: 455
                        Name: Frank | Number: 123
                        Name: Harry | Number: 643
                        """;
        String result = phoneBook.printAllNames();
        Assertions.assertEquals(expected, result);
    }
}
