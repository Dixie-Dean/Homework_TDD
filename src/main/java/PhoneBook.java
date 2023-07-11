import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, Integer> contacts = new TreeMap<>();

    public int add(String name, int number) {
        contacts.put(name, number);
        return contacts.size();
    }

    public String findByNumber(int number) {
        if (contacts.containsValue(number)) {
            List<Map.Entry<String, Integer>> foundContacts = contacts.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue().equals(number))
                    .toList();
            return foundContacts.toString();
        } else {
            return "Contact not found!";
        }
    }

    public int findByName(String name) {
        return contacts.getOrDefault(name, -1);
    }

    public String printAllNames() {
        StringBuilder builder = new StringBuilder();
        List<Map.Entry<String, Integer>> list = contacts.entrySet().stream().toList();
        for (Map.Entry<String, Integer> contact : list) {
            builder.append("Name: ")
                    .append(contact.getKey())
                    .append(" | Number: ")
                    .append(contact.getValue())
                    .append("\n");
        }
        return builder.toString();
    }
}
