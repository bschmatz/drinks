package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LiquidTest {
    private Liquid liquid;

    @BeforeEach
    void setup() {
        liquid = new Liquid("Beer", 0.5, 5);
    }

    @Test
    void testGetName() {
        assertEquals("Beer", liquid.getName());
    }

    @Test
    void testSetName() {
        liquid.setName("Water");
        assertEquals("Water", liquid.getName());
    }

    @Test
    void testGetVolume() {
        assertEquals(0.5, liquid.getVolume());
    }

    @Test
    void testSetVolume() {
        liquid.setVolume(0.25);
        assertEquals(0.25, liquid.getVolume());
    }

    @Test
    void testGetAlcoholPercent() {
        assertEquals(5, liquid.getAlcoholPercent());
    }

    @Test
    void testSetAlcoholPercent() {
        liquid.setAlcoholPercent(10);
        assertEquals(10, liquid.getAlcoholPercent());
    }

}
