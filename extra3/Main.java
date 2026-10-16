package extra3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Person> persone = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegli il C.F della  persona ");
        String cf = scanner.nextLine();
        System.out.println("Scegli il nome della  persona ");
        String name = scanner.nextLine();
        System.out.println("Scegli il cognome della  persona ");
        String surname = scanner.nextLine();
        System.out.println("Scegli il l'eta' della  persona");
        int eta = scanner.nextInt();
        Person creata = new Person(name, surname, eta);
        persone.put(cf, creata);
        System.out.println(persone);
        persone.remove(cf);
        Person trovata = persone.get(cf);
        System.out.println("Rimuovo la persona e la cerco di nuovo");
        if (trovata == null) {
            System.out.println("Nessuna persona trovata");
            
        } else {
            System.out.println(trovata);
        }
        scanner.close();
    }
}