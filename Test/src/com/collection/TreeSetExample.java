package com.collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
        // Creating a TreeSet with a custom Comparator (Descending  Order)
        SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());

        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);
    }
}


