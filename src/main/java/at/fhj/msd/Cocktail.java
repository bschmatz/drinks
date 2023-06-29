package at.fhj.msd;

import java.util.ArrayList;

public class Cocktail extends Drink {
    private ArrayList<Liquid> liquidList;

    public Cocktail(String name, ArrayList<Liquid> liquidList) {
        super(name);
        this.liquidList = liquidList;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }

    public ArrayList<Liquid> getLiquidList() {
        return liquidList;
    }

    public void setLiquidList(ArrayList<Liquid> liquidList) {
        this.liquidList = liquidList;
    }
}
