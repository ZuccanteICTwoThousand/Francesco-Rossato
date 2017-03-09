/**
 * Created by Francesco on 07/03/2017.
 */
/**
 * Class to manage a cash register device
 */
public class CashRegister {
    private double amount;
    private double payment;

    public CashRegister(double amount, double payment) {
        this.amount = amount;
        this.payment = payment;
    }

    /**
     * The standard constructor will initialize the payment and amount variables at 0
     */
    public CashRegister() {
        this(0, 0);
    }

    /**
     * Add to the bill an item's cost
     * @param amount  The cost of an item
     */
    public void purchase(double amount){
        this.amount+=amount;
    }

    /**
     * Add to the bill a given number of items' cost
     * @param amount The cost of an item
     * @param howMany How many items of that kind the customer bought
     */
    public void purchase(double amount, int howMany){
        this.amount=this.amount+amount*howMany;
    }

    /**
     * Get the total
     * @return the sum of the purchases made by the customer
     */
    public double getAmount(){
        return amount;
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
        double change= payment-amount;
        this.reset();
        return change;
    }

    private void reset() {
        this.amount=0;
        this.payment=0;
    }
}
