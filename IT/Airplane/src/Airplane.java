/**
 * Created by Francesco on 15/03/2017.
 */

/**
 * Class to manage an airplane with a model, an ID code and an airline
 */
public class Airplane {
    private String model, ID, airline;

    /**
     * Creates a new Airplane instance and sets the model, the ID code and the airline
     * @param model The airplane model
     * @param ID The airplane code
     * @param airline The airline
     */
    public Airplane(String model, String ID, String airline){
        this.model = model;
        this.ID = ID;
        this.airline= airline;
    }

    /**
     * Creates a new Airplane instance and sets the model and the ID code
     * @param model The airplane model
     * @param ID The airplane code
     */
    public Airplane(String model, String ID){
        this(model, ID, "");
    }

    /**
     * Sets the airplane airline
     * @param airline The airline company
     */
    public void setAirline(String airline){
        this.airline = airline;
    }
    /**
     * Gets the airplane model
     * @return The airplane model
     */
    public String getModel(){
        return model;
    }

    /**
     * Gets the airplane ID code
     * @return The ID code
     */
    public String getID(){
        return ID;
    }

    /**
     * Gets the airline company
     * @return the airline
     */
    public String getAirline(){
        return airline;
    }

    /**
     * toString method
     * @return a String representation of the airplane with model, ID code and airline
     */
    public String toString(){
        return model+" | "+ID+" | "+airline;
    }

}
