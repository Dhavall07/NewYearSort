package com.epam.New_year_sort;

import java.util.Comparator;

abstract class Sweets {
    String name;
    int weight;
    int price;
    int quantity;

    public Sweets(String name,int weight, int price, int quantity) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public static Comparator<Sweets> sweetName = new Comparator<Sweets>() {
        public int compare(Sweets s1,Sweets s2) {
            return s1.getName().compareTo(s2.getName());
        }
    };

    public static Comparator<Sweets> sweetPrice = new Comparator<Sweets>() {
        public int compare(Sweets s1,Sweets s2) {
            return s1.getPrice()-s2.getPrice();
        }
    };

    public static Comparator<Sweets> sweetWeight = new Comparator<Sweets>() {
        public int compare(Sweets s1,Sweets s2) {
            return s1.getWeight() - s2.getWeight();
        }
    };

    public static Comparator<Sweets> sweetQuantity = new Comparator<Sweets>() {
        public int compare(Sweets s1,Sweets s2) {
            return s1.getQuantity()-s2.getQuantity();
        }
    };
    
}