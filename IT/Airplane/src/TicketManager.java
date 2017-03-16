import javax.swing.*;

/**
 * Created by Francesco on 16/03/2017.
 */
public class TicketManager {
    public static void main(String[] args) {
        String location= JOptionPane.showInputDialog("Input the location");
        String date= JOptionPane.showInputDialog("Input the date");
        String model= JOptionPane.showInputDialog("Input the airplane model");
        String ID= JOptionPane.showInputDialog("Input the plane ID");
        String airline= JOptionPane.showInputDialog("Input the airline");
        Airplane plane= new Airplane(model, ID, airline);
        Ticket t1= new Ticket(date, location);
        t1.setPlane(plane);
        Ticket t2= t1;
        JOptionPane.showMessageDialog(null, t1.toString());
        JOptionPane.showMessageDialog(null, t2.toString());
        plane.setAirline(JOptionPane.showInputDialog("Input the airline"));
        t2.setPlane(plane);
        JOptionPane.showMessageDialog(null, t1.toString());
        JOptionPane.showMessageDialog(null, t2.toString());
    }
}
