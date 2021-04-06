package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDate;

public interface SalesRepository {

    void createSaleProduct(User user, Product product, LocalDate dateOfSale);
}
