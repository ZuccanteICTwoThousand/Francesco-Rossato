import javax.swing.*;

/**
 * Created by Francesco on 16/03/2017.
 */
public class AirplaneManager {
    public static void main(String[] args) {
        String model, ID, airline;
        model= JOptionPane.showInputDialog("Insert the model");
        ID= JOptionPane.showInputDialog("Insert the ID");
        airline= JOptionPane.showInputDialog("Insert the airline");
        Airplane one= new Airplane(model, ID);
        JOptionPane.showMessageDialog(null, one.toString());
        one.setAirline(airline);
        JOptionPane.showMessageDialog(null, one.toString());
        model= JOptionPane.showInputDialog("Insert the model");
        ID= JOptionPane.showInputDialog("Insert the ID");
        Airplane two= new Airplane(model, ID);
        Airplane three= two;
        JOptionPane.showMessageDialog(null, two.toString());
        JOptionPane.showMessageDialog(null, three.toString());
        three.setAirline(JOptionPane.showInputDialog("Insert the airline"));
        JOptionPane.showMessageDialog(null, two.toString());
        JOptionPane.showMessageDialog(null, three.toString());
    }
}
