/**
 * Created by Francesco on 07/03/2017.
 */
public class CashRegisterTest {
    public static void main(String[] args) {
        CashRegister mrkt= new CashRegister();
        double out;
        System.out.println("Purchasing a $15 shampoo");
        mrkt.purchase(15);
        System.out.println("Purchasing 3 packets of gum $2.5 each");
        mrkt.purchase(2.5, 3);
        out= mrkt.getAmount();
        System.out.println("Amount = "+out);
        System.out.println("Paying with $30");
        mrkt.pay(30);
        System.out.println("Change = "+mrkt.giveChange());
    }
}
