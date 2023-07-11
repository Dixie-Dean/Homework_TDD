import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, Integer> contacts = new TreeMap<>();

    public int add(String name, int number) {
        contacts.put(name, number);
        return contacts.size();
    }
}
