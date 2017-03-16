/**
 * Created by Francesco on 16/03/2017.
 */
public class Ticket {
    private Airplane plane;
    private final String DATE, LOCATION;

    /**
     * Creates a new Ticket instance and sets the date and the location
     * @param date The date of the flight
     * @param location The location of the flight
     * @param plane The plane which will perform the flight
     */
    public Ticket(String date, String location, Airplane plane){
        DATE= date;
        LOCATION= location;
        this.plane= plane;
    }

    /**
     * Creates a new Ticket instance and sets the date and the location
     * @param date The date of the flight
     * @param location The location of the flight
     */
    public Ticket(String date, String location){
        this(date, location, null);
    }


    /**
     * Gets the date of the flight
     * @return The date
     */
    public String getDate(){
        return DATE;
    }

    /**
     * Gets the location of the flight
     * @return The location
     */
    public String getLocation(){
        return LOCATION;
    }

    /**
     * Gets the airplane which will perform the flight
     * @return The airplane
     */
    public Airplane getPlane(){
        return plane;
    }

    /**
     * Sets the plane which will perform the flight
     * @param plane The plane
     */
    public void setPlane(Airplane plane){
        this.plane= plane;
    }

    /**
     * toString method
     * @return a String representation of the airplane with model, ID code and airline
     */
    public String toString(){
        return DATE+" | "+LOCATION+" | "+plane.toString();
    }

}
