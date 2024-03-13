
package entities;


import java.util.List;
import java.util.stream.Collectors;


public class Esercizio3 {
    // Metodo principale per l'esecuzione del programma
    public static void main(String[] args) {
        // Crea una lista di prodotti
        List<Product> products = List.of(
                new Product(1, "Book1", "Books", 150),
                new Product(2, "Book2", "Books", 100),
                new Product(3, "Toy1", "Baby", 50),
                new Product(4, "Boy1", "Boys", 100),
                new Product(5, "Girl1", "Girls", 120)
        );

        // Filtra i prodotti che appartengono alla categoria "Boys" e applica lo sconto del 10%
        List<Product> discountedProducts = products.stream()
                .filter(product -> product.getCategory().equals("Boys"))
                .map(product -> new Product(product.getId(), product.getName(), product.getCategory(), product.getPrice() * 0.9)) // Applica lo sconto del 10%
                .collect(Collectors.toList());

        // Stampa i prodotti scontati
        System.out.println(discountedProducts);
    }
}
