package com.kodilla.good.patterns.challenges.Allegro;

public class Application {

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retriever();

        Processor processor = new Processor(new EmailInformationService(),
                new SaleService(), new DatebaseSaleRepository());
        processor.process(order);

    }

}
