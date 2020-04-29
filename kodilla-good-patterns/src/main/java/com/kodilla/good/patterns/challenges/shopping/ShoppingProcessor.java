package com.kodilla.good.patterns.challenges.shopping;

public class ShoppingProcessor {

    private InformationService informationService;
    private ShoppingService shoppingService;
    private ShoppingRepository shoppingRepository;
    private Order order;

    public ShoppingProcessor(final InformationService informationService, final ShoppingService shoppingService, final ShoppingRepository shoppingRepository) {
        this.informationService = informationService;
        this.shoppingService = shoppingService;
        this.shoppingRepository = shoppingRepository;
    }

    public ShoppingDto orderProcess(final OrderRequest orderRequest) {
        boolean isTransactionDone = shoppingService.createOrder(orderRequest.getUser(),
                orderRequest.getProduct(), orderRequest.getQty(), orderRequest.getLocalDate());

        if (isTransactionDone) {
            informationService.orderUserNotification(orderRequest.getUser());
            shoppingRepository.addToRepository(order);

            return new ShoppingDto(orderRequest.getUser(), orderRequest.getProduct(), true);

        } else {
            return new ShoppingDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}




