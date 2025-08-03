package com.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        List<Products> pr = new ArrayList<>();
        pr.add(new Products("Laptop", 50000, 5));
        pr.add(new Products("Phone", 20000, 3));
        pr.add(new Products("Tablet", 10000, 1));
        pr.add(new Products("Mouse", 500, 2));

        // Sort by Rating (High to Low)
        Collections.sort(pr, new Products.RatingComparator());
        System.out.println("Sorted by Rating (High to Low):");
        for (Products p : pr) {
            System.out.println(p);
        }

        System.out.println();

        // Sort by Name (A-Z)
        Collections.sort(pr, new Products.NameComparator());
        System.out.println("Sorted by Name (A-Z):");
        for (Products p : pr) {
            System.out.println(p);
        }
    }
}