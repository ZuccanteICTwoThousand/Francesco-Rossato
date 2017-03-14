import jdk.management.resource.internal.inst.NetRMHooks;

import javax.swing.*;

/**
 * Created by Francesco on 10/03/2017.
 */
public class StringGUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Inserire nome");
        String surname = JOptionPane.showInputDialog("Inserire cognome");
        String domainMail = JOptionPane.showInputDialog("Inserire dominio mail");
        String domainSite = JOptionPane.showInputDialog("Inserire dominio sito");
        JOptionPane.showMessageDialog(null, NetString.email(name, surname, domainMail));
        JOptionPane.showMessageDialog(null, NetString.homepage(surname, domainSite));
        JOptionPane.showMessageDialog(null, NetString.password(name, surname));
        JOptionPane.showMessageDialog(null, NetString.userID(name, surname));
    }

}
