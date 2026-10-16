package extra1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Person> persone = new HashSet<>();
        Person p1 = new Person("Mario", "Rossi", 50);
        Person p2 = new Person("Mario", "Rossi", 50);
        persone.add(p1);
        persone.add(p2);
        System.out.println(persone);
    }
}
