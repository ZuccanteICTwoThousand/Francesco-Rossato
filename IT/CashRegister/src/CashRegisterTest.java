/**
 * Created by Francesco on 07/03/2017.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class CashRegisterTest {
    public static void main(String[] args) {
        double payment;
        double[] multiPurchase= new double[2];
        String purchase;
        ArrayList <Double> log= new ArrayList();
        Scanner input= new Scanner(System.in);
        CashRegisterArr mrkt= new CashRegisterArr();
        System.out.println("\t-CASH REGISTER-");
        System.out.println("Add a price or press 0 to checkout. To add multiple products, insert a price followed by a space and the amount of items.");
        System.out.print("Add a price: ");
        purchase= input.nextLine();
        if(purchase.contains(" "))
            multiPurchase = separate(purchase);
        else
            multiPurchase[0] = (Double.parseDouble(purchase));
        while(multiPurchase[0] != 0){
            if(purchase.contains(" "))
                mrkt.purchase(multiPurchase[0], multiPurchase[1]);
            else
                mrkt.purchase(multiPurchase[0]);
            System.out.print("Add a price: ");
            purchase= input.nextLine();
            if(purchase.contains(" "))
                multiPurchase = separate(purchase);
            else
                multiPurchase[0] = (Double.parseDouble(purchase));
        }
        System.out.print("Press 'l' to see transactions log, press any key to checkout: ");
        purchase= input.nextLine();
        if(purchase.equals("l")){
            log= mrkt.getLog();
            for(int i=0; i<log.size(); i++)
                System.out.println(log.get(i));
        }
        System.out.println("Total: "+mrkt.getAmount());
        System.out.print("Enter the payment: ");
        payment= input.nextDouble();
        mrkt.pay(payment);
        System.out.println("Change: "+mrkt.giveChange());
    }

    private static double[] separate(String in){
        double[] out= new double[2];
        String price, amount;
        price= in.substring(0, in.indexOf(" "));
        amount= in.substring(in.indexOf(" ")+1, in.length());
        out[0]= Double.parseDouble(price);
        out[1]= Double.parseDouble(amount);
        return out;
    }
}
