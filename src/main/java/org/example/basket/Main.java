package org.example.basket;

import org.example.basket.exceptions.BasketEmptyException;
import org.example.basket.exceptions.BasketFullException;

public class Main {
    public static void main(String[] args) {

        Basket<String> myBasket = new BasketList<>();

        myBasket.add("Apple");
        myBasket.add("Banana");
        myBasket.add("Orange");
        myBasket.add("Grapes");


        myBasket.forEach(System.out::println);
        System.out.println(myBasket.size());

        try {
            for (int i = 0; i < 10; i++) {
                myBasket.add("Item" + i);
            }
        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }

        myBasket.removeAll(myBasket);

        try {
            myBasket.remove("Item0");
        } catch (BasketEmptyException e) {
            System.out.println(e.getMessage());
        }
    }


}
