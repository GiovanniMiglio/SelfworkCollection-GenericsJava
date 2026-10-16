package extra2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Person> rubrica = new HashMap<>();
        Person mario = new Person("Mario", "Rossi", 23);
        Person claudio = new Person("Claudio", "Olivo", 23);
        Person giorgio = new Person("Giorgio", "Mirto", 23);
        rubrica.put("Mr01", mario);
        rubrica.put("Cl02", claudio);
        rubrica.put("Gr03", giorgio);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegli il C.F della  persona che vuoi cercare?");
        String cf = scanner.nextLine();

        Person trovata = rubrica.get(cf);
        if (trovata == null) {
            System.out.println("Nessuna persona trovata");

        } else {
            System.out.println(trovata);
        }
        scanner.close();

    }

}
