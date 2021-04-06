package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public interface InformationService {
    void inform(User user, Product product, LocalDate dateOfSale, boolean isSold);
}
