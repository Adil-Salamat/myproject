package com.sparta.dw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class GreetingGeneratorTest {

    @Test
    public void goodMorning() {
        GreetingGenerator gG = new GreetingGenerator();
        String actualResult = gG.getGreeting(8);

        Assertions.assertEquals("Good Morning", actualResult);
    }

    @Test
    public void negative() {
        GreetingGenerator gG = new GreetingGenerator();
        String actualResult = gG.getGreeting(-5);

        Assertions.assertEquals("Incorrect value", actualResult);
    }

    @Test
    public void large() {
        GreetingGenerator gG = new GreetingGenerator();
        String actualResult = gG.getGreeting(1244334);

        Assertions.assertEquals("Error", actualResult);
    }

}