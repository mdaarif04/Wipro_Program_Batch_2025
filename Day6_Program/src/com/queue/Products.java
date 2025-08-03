package com.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Product class
class Products {
    String name;
    double price;
    double rating;

    public Products(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", rating=" + rating + "]";
    }

    // Static inner class for comparing by rating
    static class RatingComparator implements Comparator<Products> {
        @Override
        public int compare(Products p1, Products p2) {
            return Double.compare(p2.rating, p1.rating); // Descending
        }
    }

    // Static inner class for comparing by name
    static class NameComparator implements Comparator<Products> {
        @Override
        public int compare(Products p1, Products p2) {
            return p1.name.compareTo(p2.name); // Ascending
        }
    }
}


