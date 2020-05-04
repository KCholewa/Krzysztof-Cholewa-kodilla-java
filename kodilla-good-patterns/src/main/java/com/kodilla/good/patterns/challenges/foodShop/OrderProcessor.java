package com.kodilla.good.patterns.challenges.foodShop;

public class OrderProcessor {

    private FoodSupplier foodSupplier;

    public OrderProcessor(FoodSupplier foodSupplier) {
        this.foodSupplier = foodSupplier;
    }

    public OrderDto orderProcess(final OrderRequest orderRequest) {

        boolean isTransactionDone = foodSupplier.process(orderRequest);

        if (isTransactionDone) {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(),
                    orderRequest.getQty(), orderRequest.getLocalDate(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(),
                   orderRequest.getQty(), orderRequest.getLocalDate(), false);
        }

    }
}
