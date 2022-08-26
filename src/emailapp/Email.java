package emailapp;
import java.util.*;
import java.io.*;

public class Email {
  public Scanner s = new Scanner(System.in); // Scanner class global

  // Setting variables as private
  private String first_name;
  private String last_name;
  private String dept;
  private String email;
  private String password;
  private int mailCapacity = 500;
  private String alter_email;

  // Constructor to receive first name, last name
  public Email(String first_name, String last_name) {
    this.first_name = first_name;
    this.last_name = last_name;
    System.out.println("New Employee: " + this.first_name + " " + this.last_name);
  }

  // Generating Email
  private String generate_email() {
    return this.first_name.toLowerCase() + "." + this.last_name.toLowerCase() + "@" + this.dept.toLowerCase() + ".company.com";
  }

  // Asking for dept
  private String set_dept() {
    System.out.println("Department codes\n 1 for Sales \n2 for Development \n3 for Accounting \n0 for None");
    boolean flag = false;

    do {
      System.out.println("Enter Department code: ");
      int choice = s.nextInt();
      switch (choice) {
        case 1:
          return "Sales";

        case 2:
          return "Development";

        case 3:
          return "Accounting";

        case 0:
          return "None";

        default:
          System.out.println("Invalid choice, please choose it again");
      }
    } while (!flag);

    return null;
  }
}