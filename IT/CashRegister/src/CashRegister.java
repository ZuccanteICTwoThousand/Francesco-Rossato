/**
 * Created by Francesco on 07/03/2017.
 */
public class CashRegister {
    private double amount;
    private double payment;

    public CashRegister(double amount, double payment) {
        this.amount = amount;
        this.payment = payment;
    }

    public CashRegister() {
        this(0, 0);
    }

    public void purchase(double amount){
        this.amount+=amount;
    }

    public void purchase(double amount, int howMany){
        this.amount=this.amount+amount*howMany;
    }

    public double getAmount(){
        return amount;
    }

    public void pay(double payment){
        this.payment= payment;
    }

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
