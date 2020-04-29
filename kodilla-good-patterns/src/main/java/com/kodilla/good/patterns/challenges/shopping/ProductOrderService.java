package com.kodilla.good.patterns.challenges.shopping;

public class ProductOrderService {

    public static void main(String[] args) {

        Order order = new Order();
        OrderRequest orderRequest = order.retrieve();

        ShoppingProcessor shoppingProcessor = new ShoppingProcessor(new MailService(), new DeliveryShoppingServices(), new OrderFoodRepository());
        ShoppingDto shoppingDto = shoppingProcessor.orderProcess(orderRequest);

        if (shoppingDto.isTransactionDone()) {
            System.out.println("Transaction finished");
        } else {
            System.out.println("Transaction can not be finished");
        }
    }
}
