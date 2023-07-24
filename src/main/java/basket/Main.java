package basket;

import basket.exceptions.BasketEmptyException;
import basket.exceptions.BasketFullException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Basket<String> myBasket = new BasketList<>();
        List<String> list = new ArrayList<>();

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
