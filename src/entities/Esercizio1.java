import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Esercizio1 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Book1", "Books", 150));
        products.add(new Product(2, "Book2", "Books", 300));
        products.add(new Product(3, "Toy1", "Baby", 50));
        products.add(new Product(4, "Boy1", "Boys", 100));
        products.add(new Product(5, "Girl1", "Girls", 120));

        List<Product> filteredProducts = products.stream()
                .filter(product -> product.getCategory().equals("Books"))
                .filter(product -> product.getPrice() > 100)
                .collect(Collectors.toList());

        System.out.println(filteredProducts);
    }
}