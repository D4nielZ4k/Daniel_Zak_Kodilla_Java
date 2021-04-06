package com.kodilla.good.patterns.challenges.allegro;

public class Processor {


    private InformationService informationService;
    private SalesService salesService;
    private SalesRepository salesRepository;


    public Processor(InformationService informationService, SalesService salesService, SalesRepository salesRepository) {
        this.informationService = informationService;
        this.salesService = salesService;
        this.salesRepository = salesRepository;
    }

    public void process(final Order order) {


        boolean isSold = salesService.sale(order.getUser(), order.getDateOfSale(), order.getProduct());
        if (isSold) {
            informationService.inform(order.getUser(), order.getProduct(), order.getDateOfSale(), isSold);
            salesRepository.createSaleProduct(order.getUser(), order.getProduct(), order.getDateOfSale());
        } else {
            informationService.inform(order.getUser(), order.getProduct(), order.getDateOfSale(), isSold);
        }
    }
}
