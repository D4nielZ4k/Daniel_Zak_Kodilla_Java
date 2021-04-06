package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class EmailInformationService implements InformationService {
    @Override
    public void inform(User user, Product product, LocalDate dateOfSale, boolean isSold) {
        if (isSold) {
            System.out.println("Witaj " + user.getFirstName() + " " + user.getSurname() + "(" + user.getUserName() + ")" + " wlasnie dokonales zakupu "
                    + product.getNameOfProduct() + " w cenie " + product.getPriceOfProduct() + "EUR");
            System.out.println("Data zakupu :" + dateOfSale.toString());
        } else {
            System.out.println("Urzytkowniku" + user.getSurname() + "nie jestesmy w stanie zralizowac zamowienia");
        }
    }

}
