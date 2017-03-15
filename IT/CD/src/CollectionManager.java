import java.util.Scanner;

/**
 * Created by Francesco on 15/03/2017.
 */

public class CollectionManager {
    public static void main(String[] args) {
        CDCollection myCollection = new CDCollection();
        Scanner input = new Scanner(System.in);
        String author="", title, company;
        int choice;
        for (; ; ) {
            System.out.println("\n---CD COLLECTION MANAGER v1---\n");
            System.out.println("\t1: Add a CD");
            System.out.println("\t2: Remove a CD");
            System.out.println("\t3: Print the collection");
            System.out.println("\t4: Search by author");
            System.out.println("\t5: Search by title");
            System.out.println("\t6: Search by company");
            System.out.println("\n\t9: Exit");
            System.out.print("Input choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1: {
                    System.out.print("Input author: ");
                    author= input.nextLine();
                    System.out.print("Input title: ");
                    title= input.nextLine();
                    System.out.print("Input company: ");
                    company= input.nextLine();
                    myCollection.addCD(author, title, company);
                    break;
                }
                case 2: {
                    System.out.print("Input the ID of the CD you want to delete: ");
                    int ID = Integer.parseInt(input.nextLine());
                    myCollection.removeCD(ID);
                    break;
                }
                case 3: {
                    String[] collection = myCollection.printCollection();
                    System.out.println("Format:\nID + Author + Title + Company\n");
                    for (String item : collection)
                        System.out.println(item);
                    System.out.print("\nPress enter to proceed...");
                    input.nextLine();
                    break;
                }
                case 4: {
                    System.out.print("Input the author to search for: ");
                    author = input.nextLine();
                    System.out.println("Results:");
                    for (CD item : myCollection.authorSearch(author))
                        System.out.println(item.printCD());
                    System.out.print("\nPress enter to proceed...");
                    input.nextLine();
                    break;
                }
                case 5: {
                    System.out.print("Input the title to search for: ");
                    title = input.nextLine();
                    for (CD item : myCollection.titleSearch(title))
                        System.out.println(item.printCD());
                    System.out.print("\nPress enter to proceed...");
                    input.nextLine();
                    break;
                }
                case 6: {
                    System.out.print("Input the company to search for: ");
                    company = input.nextLine();
                    for (CD item : myCollection.companySearch(company))
                        System.out.println(item.printCD());
                    System.out.print("\nPress enter to proceed...");
                    input.nextLine();
                    break;
                }
                case 9: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Choose not allowed");
                    System.out.print("\nPress enter to proceed...");
                    input.nextLine();
                }
            }
        }
    }
}
