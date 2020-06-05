package com.epam.New_year_sort;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String args[]) {
        Icecream i1 = new Icecream("Chocolate Ice-cream", 100, 50, 1);
        Cakes c1 = new Cakes("Red Velvet Cake",500,500,1);
        Icecream i2 = new Icecream("Vanilla Ice-cream", 100, 50, 1);
        Cakes c2 = new Cakes("Blueberry Cheesecake",1000,2000,1);
        Candy ca1 = new Candy("Mango",100,75,4);

        Gift g1 = new Gift();
        g1.addGift(i1);
        g1.addGift(c2);

        Gift g2 = new Gift();
        g2.addGift(c1);
        g2.addGift(ca1);
        g2.addGift(i2);
        g2.addGift(c1);
        List<Gift> gift1 = new ArrayList<>();
        gift1.add(g1);
        gift1.add(g2);
        Child child1 = new Child("Alice",gift1);

        child1.listGifts();
        System.out.println("The total weight of the gift is: "+g1.calculateWeight());
        

        g1.sortByName();
        g1.sortByWeight();
    
    }
    
}