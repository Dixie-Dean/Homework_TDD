import org.junit.Assert;
import org.junit.Test;


public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test
    public void add() {
        int expected = 1;

        int result = phoneBook.add("Harry", 4568126);

        Assert.assertEquals(expected, result);
    }
}
