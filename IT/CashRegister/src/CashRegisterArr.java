/**
 * Created by Francesco on 07/03/2017.
 */
import java.util.ArrayList;
public class CashRegisterArr {
    private ArrayList <Double> shopper= new ArrayList();
    private double payment;
    public CashRegisterArr(double payment) {
        this.payment = payment;
    }

    public CashRegisterArr() {
        this(0);
    }

    public void purchase(double amount){
        shopper.add(amount);
    }

    public void purchase(double amount, int howMany){
        for(int i=0; i<howMany; i++)
            shopper.add(amount);
    }

    public double getAmount(){
        return this.sum();
    }

    public void pay(double payment){
        this.payment= payment;
    }

    public double giveChange(){
        double change= payment-this.sum();
        this.reset();
        return change;
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
