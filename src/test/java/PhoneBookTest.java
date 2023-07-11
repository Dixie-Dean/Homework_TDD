import org.junit.Assert;
import org.junit.Test;


public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test
    public void add() {
        int result = phoneBook.add("Harry", 4568126);
        Assert.assertEquals(1, result);
    }

    @Test
    public void findByNumber() {
        String result = phoneBook.findByNumber(4568126);
        Assert.assertNotNull(result);
    }
}
