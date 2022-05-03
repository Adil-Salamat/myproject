package com.sparta.dw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmClassificationsTest {

    @Test
    public void twelve() {
        FilmClassifications fC = new FilmClassifications();
        String ages = fC.availableClassifications(12);

        Assertions.assertEquals("U, PG & 12 films are available.", ages);
    }

    @Test
    public void fifteen() {
        FilmClassifications fC = new FilmClassifications();
        String ages = fC.availableClassifications(15);

        Assertions.assertEquals("U, PG, 12 & 15 films are available.", ages);
    }

    @Test
    public void all() {
        FilmClassifications fC = new FilmClassifications();
        String ages = fC.availableClassifications(30);

        Assertions.assertEquals("All films are available.", ages);
    }

    @Test
    public void ten() {
        FilmClassifications fC = new FilmClassifications();
        String ages = fC.availableClassifications(10);

        Assertions.assertEquals("U & PG films are available.", ages);
    }

    @Test
    public void five() {
        FilmClassifications fC = new FilmClassifications();
        String ages = fC.availableClassifications(5);

        Assertions.assertEquals("U films are available.", ages);
    }

}