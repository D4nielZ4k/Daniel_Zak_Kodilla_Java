package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.FacebookPublisher;
import com.kodilla.patterns.strategy.social.media.TwitterPublisher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Give
        User johan = new ZGeneration("Johan Erikson");
        User petter = new YGeneration("Petter Vattenmelon");
        User ramlosa = new Millenials("Ramlosa Medsmak");
        //When
        String johanMedium = johan.predict();
        System.out.println(" Johan is using "+johanMedium);
        String petterMedium = petter.predict();
        System.out.println(" Petter is using "+petterMedium);
        String ramlosaMedium = ramlosa.predict();
        System.out.println(" Ramlosa is using "+ramlosaMedium);
        //Then
        Assertions.assertEquals("Facebook",johanMedium);
        Assertions.assertEquals("Twitter",petterMedium);
        Assertions.assertEquals("Snapchat",ramlosaMedium);

    }

    @Test
    void testIndividualSharingStrategy() {
        //Give
        User pelikan = new Millenials("Pelikan Textmarker");
        //When
        pelikan.sharePOst(new TwitterPublisher());
        String pelikanMedium = pelikan.predict();
        System.out.println("Pelikan is using "+pelikanMedium);
        //Then
        Assertions.assertEquals("Twitter",pelikanMedium);
    }
}
