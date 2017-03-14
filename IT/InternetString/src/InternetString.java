import java.util.Scanner;

/**
 * Created by Francesco on 10/03/2017.
 */

public class InternetString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int choice;
        System.out.println("-CALCULATE PERSONAL DATA-\n");
        System.out.println("\t1. Generate email");
        System.out.println("\t2. Generate a homepage");
        System.out.println("\t3. Generate an user ID");
        System.out.println("\t4. Generate a password");
        System.out.print("\nInput choice: ");
        choice= input.nextInt();
        switch(choice){
            case 1: email(); break;
            case 2: homepage(); break;
            case 3: uid(); break;
            case 4: passwd(); break;
            default: System.out.println("Choose not allowed");
        }

    }
    private static void email(){
        Scanner input= new Scanner(System.in);
        String name, surname, domain;
        System.out.print("\nEnter name: ");
        name= input.nextLine();
        System.out.print("Enter surname: ");
        surname= input.nextLine();
        System.out.print("Enter domain: ");
        domain= input.nextLine();
        System.out.println(NetString.email(name, surname, domain));
    }

    private static void homepage(){
        Scanner input= new Scanner(System.in);
        String surname, domain;
        System.out.print("Enter surname: ");
        surname= input.nextLine();
        System.out.print("Enter domain: ");
        domain= input.nextLine();
        System.out.println(NetString.homepage(surname, domain));
    }

    private static void uid(){
        Scanner input= new Scanner(System.in);
        String name, surname;
        System.out.print("\nEnter name: ");
        name= input.nextLine();
        System.out.print("Enter surname: ");
        surname= input.nextLine();
        System.out.println(NetString.userID(name, surname));
    }

    private static void passwd(){
        Scanner input= new Scanner(System.in);
        String name, surname;
        System.out.print("\nEnter name: ");
        name= input.nextLine();
        System.out.print("Enter surname: ");
        surname= input.nextLine();
        System.out.println(NetString.password(name, surname));
    }
}
