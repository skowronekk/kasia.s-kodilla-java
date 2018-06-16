package com.kodilla.good.patterns.food2door;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;


    public ProductOrderService (final InformationService informationService,
                                final OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getOrderDate(),
                orderRequest.getShop());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}

