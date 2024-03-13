
package entities;


import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


public class Esercizio4 {
  
    public static void main(String[] args) {
        // Crea una lista di ordini
        List<Order> orders = List.of(
                new Order(1, "Delivered", LocalDate.of(2021, 2, 1), LocalDate.of(2021, 4, 10), List.of(
                        new Product(1, "Book1", "Books", 150),
                        new Product(2, "Book2", "Books", 100),
                        new Product(3, "Toy1", "Baby", 50),
                        new Product(4, "Boy1", "Boys", 100),
                        new Product(5, "Girl1", "Girls", 120)
                )),
                new Order(2, "Delivered", LocalDate.of(2021, 2, 1), LocalDate.of(2021, 4, 10), List.of(
                        new Product(1, "Book1", "Books", 150),
                        new Product(2, "Book2", "Books", 100),
                        new Product(3, "Toy1", "Baby", 50),
                        new Product(4, "Boy1", "Boys", 100),
                        new Product(5, "Girl1", "Girls", 120)
                ))
        );

        // Filtra i prodotti degli ordini che appartengono alla categoria "Boys"
        List<Product> filteredProducts = orders.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> product.getCategory().equals("Boys")))
                .flatMap(order -> order.getProducts().stream()) // Estrae i prodotti da tutti gli ordini
                .collect(Collectors.toList()); // Raccoglie i prodotti filtrati in una lista

        // Stampa i prodotti filtrati
        System.out.println(filteredProducts);
    }
}
