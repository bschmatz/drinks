package at.fhj.msd;

/**
 * Class represents a liquid which can be used in drinks
 */
public class Liquid {

    /**
     * name of liquid
     */
    private String name;

    /**
     * volume of liquid in litre
     */
    private double volume;


    /**
     * alcohol volume percent of liquid
     */
    private double alcoholPercent;

    /**
     * Creates a Liquid object with given name, volume and alcoholPercent
     *
     * @param name name of liquid
     * @param volume volume of liquid in litre
     * @param alcoholPercent alcohol volume percent of liquid
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Getter for name
     *
     * @return name of liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     *
     * @param name name of liquid
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for volume
     *
     * @return volume of liquid in litre
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Setter for volume
     *
     * @param volume volume of liquid in litre
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Getter for alcoholPercent
     *
     * @return alcohol volume percent of liquid
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Setter for alcoholPercent
     *
     * @param alcoholPercent alcohol volume percent of liquid
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
