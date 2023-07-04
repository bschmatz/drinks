package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleDrinkTest {
    private SimpleDrink drink;

    @BeforeEach
    public void setup() {
        Liquid liquid = new Liquid("Water", 250, 0);
        drink = new SimpleDrink("Water Bottle", liquid);
    }

    @Test
    public void testGetVolume() {
        double expectedVolume = 250;
        double actualVolume = drink.getVolume();
        assertEquals(expectedVolume, actualVolume, 0.01);
    }

    @Test
    public void testGetAlcoholPercent() {
        double expectedAlcoholPercent = 0;
        double actualAlcoholPercent = drink.getAlcoholPercent();
        assertEquals(expectedAlcoholPercent, actualAlcoholPercent, 0.01);
    }

    @Test
    public void testIsAlcoholic() {
        boolean expectedIsAlcoholic = false;
        boolean actualIsAlcoholic = drink.isAlcoholic();
        assertEquals(expectedIsAlcoholic, actualIsAlcoholic);
    }
}

