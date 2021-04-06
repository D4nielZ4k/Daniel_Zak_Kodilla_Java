package com.kodilla.good.patterns.challenges.allegro;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderRetriever {
    public Order retriever() {

        User user = new User("Czesław", "Obajtek", "Czesio", "czesio@gmail.com");
        Product product = new Product("Klapki Kubota", BigDecimal.valueOf(59.99));
        Order order = new Order(user, LocalDate.of(2020, 4, 6), product);

        return order;
    }
}
