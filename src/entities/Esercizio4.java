package entities;

import entities.Order;
import entities.Product;
import entities.OrderCustomer;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Esercizio4 {
    public static void main(String[] args) {
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

        List<Product> filteredProducts = orders.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> product.getCategory().equals("Boys")))
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.toList());

        System.out.println(filteredProducts);
    }
}