package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CocktailTest {
    private Cocktail cocktail;
    private ArrayList<Liquid> liquidList;

    @BeforeEach
    void setup() {
        // Create liquids for Screwdriver
        liquidList = new ArrayList<>();
        liquidList.add(new Liquid("Vodka", 50, 40));
        liquidList.add(new Liquid("Orange Juice", 100, 0));

        // Create new instance of Cocktail
        cocktail = new Cocktail("Screwdriver", liquidList);
    }

    @Test
    void testGetVolume() {
        // Calculate the expected total volume
        double expectedVolume = 0;
        for (Liquid liquid : liquidList) {
            expectedVolume += liquid.getVolume();
        }

        // Verify that the calculated volume matches the expected volume
        assertEquals(expectedVolume, cocktail.getVolume(), 0.01);
    }

    @Test
    public void testGetAlcoholPercent() {
        // Calculate the expected average alcohol percentage
        double expectedPercent = 0;
        for (Liquid liquid : liquidList) {
            expectedPercent += liquid.getAlcoholPercent();
        }
        expectedPercent /= liquidList.size();

        // Verify that the calculated average matches the expected percentage
        assertEquals(expectedPercent, cocktail.getAlcoholPercent(), 0.01);
    }
    @Test
    public void testIsAlcoholic() {
        // Since the cocktail contains vodka, it should be alcoholic
        assertTrue(cocktail.isAlcoholic());

        // Create a non-alcoholic cocktail and test again
        liquidList.clear();
        liquidList.add(new Liquid("Orange Juice", 200, 0));
        cocktail.setLiquidList(liquidList);

        // Since the cocktail contains no alcohol, it should not be alcoholic
        assertFalse(cocktail.isAlcoholic());
    }

    @Test
    public void testGetLiquidList() {
        // Verify that the returned liquid list matches the initial list
        assertEquals(liquidList, cocktail.getLiquidList());
    }

    @Test
    public void testSetLiquidList() {
        // Create a new liquid list
        ArrayList<Liquid> newLiquidList = new ArrayList<>();
        newLiquidList.add(new Liquid("Rum", 40, 40));
        newLiquidList.add(new Liquid("Coke", 200, 0));

        // Set the new liquid list on the cocktail
        cocktail.setLiquidList(newLiquidList);

        // Verify that the liquid list has been updated
        assertEquals(newLiquidList, cocktail.getLiquidList());
    }
}
