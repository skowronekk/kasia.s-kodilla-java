package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class ExtraFoodShopOrderService implements OrderService {
    @Override
    public boolean process(User user, LocalDateTime orderDate, Shop shop) {
        System.out.println("Extra 20% off green tea ");
        return true;

    }
}
