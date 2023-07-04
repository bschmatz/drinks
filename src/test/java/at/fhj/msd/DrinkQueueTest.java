package at.fhj.msd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DrinkQueueTest {

    DrinkQueue drinkqueue = new DrinkQueue();
    ArrayList<Liquid> liquids = new ArrayList<>();
    Liquid liquid1 = new Liquid("Alcohol",5,0.4);
    Liquid liquid2 = new Liquid("Juice",10,0.0);
    Cocktail cocktail = new Cocktail("FancyDrink",liquids);
    Cocktail cockteil2 = new Cocktail("CheapDrink",liquids);

    @BeforeEach
    void setup() {
        liquids.clear();
        liquids.add(liquid1);
        liquids.add(liquid2);
    }

    @Test
    void testAdd() {
        drinkqueue.add(cocktail);
        //tests the add method
        String test = "FancyDrink";
        assertEquals(test,drinkqueue.peek().getName());
    }

    @Test
    void testPeek() {
        drinkqueue.add(cocktail);
        drinkqueue.add(cockteil2);
        //tests if the correct object is returned on the peed method
        String testPeek = "CheapDrink";
        assertEquals(testPeek,cockteil2.getName());
    }

    @Test
    void testRemove(){
        drinkqueue.add(cockteil2);
        drinkqueue.add(cocktail);
        //tests if an object is removed correctly
        String testRemove = "FancyDrink";
        drinkqueue.remove();
        String result = String.valueOf(drinkqueue.peek().getName());
        assertEquals(testRemove,result);
    }

}

