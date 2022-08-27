package emailapp;
import java.util.Scanner;

public class EmailApp {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter first name: ");
    String first_name = s.next();
    System.out.println("Enter last name: ");
    String last_name = s.next();

    // Creating a new employee (i.e. an object of the Email class)
    Email email = new Email(first_name, last_name);

    int choice = -1;
    do {
      System.out.println("\n**********\nENTER YOUR CHOICE\n1.Show Info\n2.Change Password" +
          "\n3.Change Mailbox Capacity\n4.Set Alternate Email\n5.Store data in file\n6.Show file\n7.Exit");
      choice = s.nextInt();
      switch (choice) {
        case 1:
          email.get_info();
          break;

        case 2:
          email.set_password();
          break;

        case 3:
          email.set_mailbox_capacity();
          break;

        case 4:
          email.set_alternate_email();
          break;

        case 5:
          email.store_file();
          break;

        case 6:
          email.read_file();
          break;

        case 7:
          System.out.println("\nTHANKS!!");
          break;

        default:
          System.out.println("INVALID CHOICE! ENTER AGAIN!");
      }
    } while (choice != 7);
  }
}