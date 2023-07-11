import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

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
}
