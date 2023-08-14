package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> dishes = new ArrayDeque<>();

        for(int i = 0 ; i< numberOfDishes; i++){
            dishes.add(i);
        }

        while(!dishes.isEmpty()){
            for (int i = 0; i< everyDishNumberToEat; i++){
                dishes.add(dishes.poll());
            }

            result.add(dishes.poll());
        }

        return result;
    }
}
