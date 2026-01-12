package gr.aueb.cf.cf9.ch17.streams;


import gr.aueb.cf.cf9.ch17.sorting.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMap {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 100),
                new Product("Oranges", 8.5, 50),
                new Product("Milk", 2.8, 4),
                new Product("Apples", 22.5, 120)
        ));


        List<Integer> squares = numbers.stream()
                .map(num -> num * num)      //Intermediate op
                .toList();                          // Terminal op
        squares.forEach(System.out::println);
        List<String> listOfDescriptions = products.stream()
                .map(p -> p.getDescription())
                .toList();

        listOfDescriptions.forEach(System.out::println);

        String listofDescriptions2 = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.joining(", "));

        System.out.println(listofDescriptions2);
    }
}
