package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class GlutenFreeShopOrderService implements OrderService {
    @Override
    public boolean process(User user, LocalDateTime orderDate, Shop shop) {
        System.out.println("Any 3 for 2 Cheapest Product Free");
        return true;
    }
}
