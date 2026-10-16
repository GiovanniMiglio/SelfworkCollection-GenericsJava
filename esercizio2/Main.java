package esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> persone = new ArrayList<>();
        Person mario = new Person("Mario", "Rossi", 23);
        Person claudio = new Person("Claudio", "Olivo", 23);
        Person giorgio = new Person("Giorgio", "Mirto", 23);
        persone.add(giorgio);
        persone.add(claudio);
        persone.add(mario);
        for (int i = 0; i < persone.size(); i++) {
            System.out.println(i + "->" + persone.get(i));

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegli l'indice della  persona che vuoi modificare?");
        int indice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nuovo nome : ");
        String nuovoNome = scanner.nextLine();
        System.out.println("Nuovo cognome : ");
        String nuovoCognome = scanner.nextLine();
        System.out.println("Nuova eta' : ");
        int nuovaEta = scanner.nextInt();
        scanner.nextLine();
        Person nuovaPersona = new Person(nuovoNome, nuovoCognome, nuovaEta);
        persone.set(indice, nuovaPersona);
        scanner.close();
        System.out.println("Lista Aggiornata");

        for (int i = 0; i < persone.size(); i++) {
            System.out.println(i + " -> " + persone.get(i));

        }

    }
}
