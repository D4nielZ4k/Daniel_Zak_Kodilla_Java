package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void bigmacBuilderTest(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bon("sesame")
                .sauce("BBQ")
                .burgers(2)
                .ingredient("Onion")
                .ingredient("cheese")
                .ingredient("pickles")
                .build();
        //When
        String bonFinalTest = "sesame";
        String sauce = "BBQ";
        int howManyIngredients =bigmac.getIngredients().size();
        //Then
        Assertions.assertEquals(bonFinalTest,bigmac.getBon());
        Assertions.assertEquals(sauce,bigmac.getSauce());
        Assertions.assertEquals(3,howManyIngredients);
    }
}
