package com.pisethjava.facade.order.client;

import com.pisethjava.facade.order.domain.OrderRequest;
import com.pisethjava.facade.order.domain.PlaceOrderResult;
import com.pisethjava.facade.order.facade.OrderFacade;

public final class OrderController {
    private final OrderFacade facade;
    public OrderController(OrderFacade f) {
        facade=f;
    }
    public PlaceOrderResult placeOrder(OrderRequest r) {
        return facade.placeOrder(r);
    }
}
