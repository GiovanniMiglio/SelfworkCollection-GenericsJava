package esercizio3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> nomi = new ArrayList<>(List.of("Mario", "Mario", "Luca", "Filippo"));
        Set<String> nomiSenzaDoppioni = new LinkedHashSet<>();
        nomiSenzaDoppioni.addAll(nomi);
        List<String> nomiPuliti = new ArrayList<>(nomiSenzaDoppioni);
        System.out.println(nomiPuliti);
    }
}
