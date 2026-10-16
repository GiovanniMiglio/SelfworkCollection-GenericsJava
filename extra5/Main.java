package extra5;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
     List<String> nomi = new ArrayList<>(List.of("Mario", "Andrea", "Luca", "Filippo"));
     List<Integer> numeri = new ArrayList<>(List.of(1,2,3,4,5));
     stampaLista(nomi);
     stampaLista(numeri);
}

    public static <T> void stampaLista(List<T> lista){
for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " -> " + lista.get(i));

        }
    }
}

