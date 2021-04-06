package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDate;

public class SaleService implements SalesService {

    @Override
    public boolean sale(User user, LocalDate dateOfSale, Product product) {
        System.out.println("Sprzedaz " + product.getNameOfProduct() + " w dniu " + dateOfSale.toString()
                + "  kupujacy: " + user.getUserName());
        return true;
    }
}
