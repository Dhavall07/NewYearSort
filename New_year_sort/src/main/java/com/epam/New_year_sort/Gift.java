package com.epam.New_year_sort;

import java.util.*;


public class Gift {
    List<Sweets> gift = new ArrayList<>();
    int count;
    int total_weight;

    public void addGift(Sweets s) {
        gift.add(s);
        count += 1;
    }

    public void showGifts() {
        for(Sweets s: gift) {
            System.out.println(s.getName()+" "+s.getPrice()+" "+s.getWeight()+" "+s.getQuantity());
        }
    }

    public int calculateWeight() {
        for(Sweets s : gift) {
            total_weight += s.getWeight();
        }
        return total_weight;
    }

    public void sortByName() {
        System.out.println("The gift items sorted by name are:");
        Collections.sort(gift,Sweets.sweetName);
        for(Sweets s: gift) {
            System.out.println(s.getName()+" "+s.getPrice()+" "+s.getWeight()+" "+s.getQuantity());
        }
    }

    public void sortByPrice() {
        System.out.println("The gift items sorted by price are:");
        Collections.sort(gift,Sweets.sweetPrice);
        for(Sweets s: gift) {
            System.out.println(s.getName()+" "+s.getPrice()+" "+s.getWeight()+" "+s.getQuantity());
        }
    }

    public void sortByWeight() {
        System.out.println("The gift items sorted by weight are:");
        Collections.sort(gift,Sweets.sweetWeight);
        for(Sweets s: gift) {
            System.out.println(s.getName()+" "+s.getPrice()+" "+s.getWeight()+" "+s.getQuantity());
        }
    }

    public void sortByQuantity() {
        System.out.println("The gift items sorted by quantity are:");
        Collections.sort(gift,Sweets.sweetQuantity);
        for(Sweets s: gift) {
            System.out.println(s.getName()+" "+s.getPrice()+" "+s.getWeight()+" "+s.getQuantity());
        }
    }

}