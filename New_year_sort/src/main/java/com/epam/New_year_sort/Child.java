package com.epam.New_year_sort;

import java.util.*;


public class Child {

    String name;
    List<Gift> gift_list = new ArrayList<>();

    public Child(String name, List<Gift> gift_list) {
        this.name = name;
        this.gift_list = gift_list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Gift> getGift_list() {
        return gift_list;
    }

    public void setGift_list(List<Gift> gift_list) {
        this.gift_list = gift_list;
    }
    
    public void findTotalWeight() {
        System.out.println("The total weight of the gift is:");
        int i = 1;
        for(Gift g : gift_list) {
            System.out.println("Gift "+i+": "+g.total_weight);
            i++;
        }
    }

    public void listGifts() {
        System.out.println("Gifts for "+name);
        for(Gift g : gift_list) {
            g.showGifts();
        }
    }
    
}