package gr.aueb.cf.cf9.ch17.streams;

import gr.aueb.cf.cf9.ch17.sorting.Product;

import java.util.ArrayList;
import java.util.List;

public class ReduceMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 100),
                new Product("Oranges", 8.5, 50),
                new Product("Milk", 2.8, 4),
                new Product("Apples", 22.5, 120)
        ));
        
        int totalSum = numbers.stream()
                .reduce(0, (sum, num) -> sum + num);
        
        int totalSum2 = numbers.stream()
                .reduce(0, Integer::sum);       //Integer has a static method sum()
        
    }
}
