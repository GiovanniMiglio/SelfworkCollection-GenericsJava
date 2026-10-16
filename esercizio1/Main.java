package esercizio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Prodotto> prodotti = new  ArrayList<>();
        Prodotto penna = new Prodotto("Penna", 2);
        Prodotto zaino = new Prodotto("Zaino", 89.5);
        Prodotto diario = new Prodotto("Diario", 19.90);
        Prodotto matita = new Prodotto("Matita", 1.5);
        Prodotto gomma = new Prodotto("Gomma", 0.5);
        prodotti.add(penna);
        prodotti.add(zaino);
        prodotti.add(diario);
        prodotti.add(matita);
        prodotti.add(gomma);
        List<Prodotto> economici = new  ArrayList<>();
        for (Prodotto prodotto : prodotti) {
            if (prodotto.getPrice() < 50) {
                economici.add(prodotto);               
            }
            
        }
        System.out.println(economici);

    }
}
