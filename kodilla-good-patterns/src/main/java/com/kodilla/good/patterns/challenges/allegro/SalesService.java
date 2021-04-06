package com.kodilla.good.patterns.challenges.allegro;


import java.time.LocalDate;

public interface SalesService {

    boolean sale(User user, LocalDate dateOfSale, Product product);
}
