package entities;
import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Esercizio1 {

    public static void main(String[] args) {
        // Creo una nuova lista di prodotti
        List<Product> products = new ArrayList<>();

        // Aggiungi alcuni prodotti alla lista
        products.add(new Product(1, "Book1", "Books", 150));
        products.add(new Product(2, "Book2", "Books", 300));
        products.add(new Product(3, "Toy1", "Baby", 50));
        products.add(new Product(4, "Boy1", "Boys", 100));
        products.add(new Product(5, "Girl1", "Girls", 120));

        // Filtra i prodotti che appartengono alla categoria "Books" e hanno un prezzo superiore a 100
        List<Product> filteredProducts = products.stream()
                .filter(product -> product.getCategory().equals("Books")) // Filtra per categoria "Books"
                .filter(product -> product.getPrice() > 100) // Filtra per prezzo maggiore di 100
                .collect(Collectors.toList()); // Raccogli i risultati filtrati in una lista

        // Stampare i prodotti filtrati
        System.out.println(filteredProducts);
    }
}
