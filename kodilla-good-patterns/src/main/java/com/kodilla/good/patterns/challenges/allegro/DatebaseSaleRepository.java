package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class DatebaseSaleRepository implements SalesRepository {
    @Override
    public void createSaleProduct(User user, Product product, LocalDate dateOfSale) {

        System.out.println("\n" + "Zapisanie do bazy danych. Sprzedazy produktu " + product.getNameOfProduct()
                + "uzytkownikowi: " + user.getSurname() + "w cenie " + product.getPriceOfProduct()
                + " w dniu: " + dateOfSale.toString() + ", Email kontaktowy klienta " + user.getEmail());
    }

}
