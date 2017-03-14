import javax.swing.*;

/**
 * Created by Francesco on 14/03/2017.
 */
public class Example {
    public static void main(String[] args) {
        String author= JOptionPane.showInputDialog("Inserire autore");
        String title= JOptionPane.showInputDialog("Inserire titolo");
        String company= JOptionPane.showInputDialog("Inserire casa discografica");
        CD disk1= new CD(author, title, company);
        author= JOptionPane.showInputDialog("Inserire autore 2");
        title= JOptionPane.showInputDialog("Inserire titolo 2");
        company= JOptionPane.showInputDialog("Inserire casa discografica 2");
        CD disk2= disk1.makeCD(author, title, company);
        JOptionPane.showMessageDialog(null, disk1.printCD());
        JOptionPane.showMessageDialog(null, disk2.printCD());
        String owner= JOptionPane.showInputDialog("Inserire proprietario 1");
        disk1.setOwner(owner);
        JOptionPane.showMessageDialog(null, disk1.printCD()+disk1.getOwner());
    }

}
