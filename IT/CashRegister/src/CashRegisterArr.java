/**
 * Created by Francesco on 07/03/2017.
 */
import java.util.ArrayList;

/**
 * Class to manage a cash register device
 */
public class CashRegisterArr {

    private ArrayList <Double> shopper= new ArrayList <Double> ();
    private double payment;

    /**
     * The standard constructor will initialize the payment variable at 0
     */
    public CashRegisterArr() {
        payment=0;
    }

    /**
     * Add to the bill an item's cost
     * @param amount  The cost of an item
     */
    public void purchase(double amount){
        shopper.add(amount);
    }

    /**
     * Add to the bill a given number of items' cost
     * @param amount The cost of an item
     * @param howMany How many items of that kind the customer bought
     */
    public void purchase(double amount, int howMany){
        for(int i=0; i<howMany; i++)
            shopper.add(amount);
    }

    /**
     * Get the total
     * @return the sum of the purchases made by the customer
     */
    public double getAmount(){
        return this.sum();
    }

    /**
     * Insert the customer payment
     * @param payment The amount of money given by the customer
     */
    public void pay(double payment){
        this.payment= payment;
    }

    /**
     * Get the change and reset the bill count
     * @return The change
     */
    public double giveChange(){
        double change= payment-this.sum();
        this.reset();
        return change;
    }

    /**
     * Get the items bought by the customer
     * @return An array with all the items bought
     */
    public Object[] getLog(){
        return shopper.toArray();
    }

    private double sum(){
        double out=0;
        for(int i=0; i<shopper.size(); i++)
            out+=shopper.get(i);
        return out;
    }

    private void reset() {
        this.shopper.clear();
        this.payment=0;
    }
}
