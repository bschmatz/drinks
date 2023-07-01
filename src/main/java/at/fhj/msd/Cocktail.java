package at.fhj.msd;

import java.util.ArrayList;

/**
 * Represents a cocktail drink which is composed of multiple liquids
 */
public class Cocktail extends Drink {

    /**
     * List of liquids which are part of the cocktail
     */
    private ArrayList<Liquid> liquidList;

    /**
     * Creates a cocktail object with the given name and list of liquids
     * @param name name of the cocktail
     * @param liquidList list of liquids which are part of the cocktail
     */
    public Cocktail(String name, ArrayList<Liquid> liquidList) {
        super(name);
        this.liquidList = liquidList;
    }

    @Override
    public double getVolume() {
        double totalVolume = 0;

        for (Liquid liquid : liquidList) {
            totalVolume += liquid.getVolume();
        }

        return totalVolume;
    }

    @Override
    public double getAlcoholPercent() {
        double totalPercent = 0;

        for (Liquid liquid : liquidList) {
            totalPercent += liquid.getAlcoholPercent();
        }

        return totalPercent / liquidList.size();
    }

    @Override
    public boolean isAlcoholic() {
        if (getAlcoholPercent() > 0) {
            return true;
        }

        return false;
    }

    /**
     * Returns the list of liquids which are part of the cocktail
     * @return list of liquids which are part of the cocktail
     */
    public ArrayList<Liquid> getLiquidList() {
        return liquidList;
    }

    /**
     * Sets the list of liquids which are part of the cocktail
     * @param liquidList list of liquids which are part of the cocktail
     */
    public void setLiquidList(ArrayList<Liquid> liquidList) {
        this.liquidList = liquidList;
    }
}
