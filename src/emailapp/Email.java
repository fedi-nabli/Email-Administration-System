package emailapp;
import java.util.Scanner;
import java.util.Random;
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
          System.out.println("**INVALID CHOICE**");
      }
    } while (!flag);

    return null;
  }

  // Generate random password method
  private String generate_password(int length) {
    Random r = new Random();
    String Capital_characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lower_characters = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
    String symbols = "!@#$%&?";

    String values = Capital_characters + lower_characters + numbers + symbols;

    String password = "";
    for (int i = 0; i < length; i++) {
      password = password + values.charAt(r.nextInt(values.length()));
    }

    return password;
  }

  // Change password method
  public void set_password() {
    boolean flag = false;
    do {
      System.out.println("Do you want to change your password? (Y/N)");
      char choice = s.next().charAt(0);
      if (choice == 'Y' || choice == 'y') {
        flag = true;
        System.out.println("Enter current password: ");
        String temp = s.next();
        if (temp.equals(this.password)) {
          System.out.println("Enter new password: ");
          this.password = s.next();
          System.out.println("Password changed successfully!");
        } else {
          System.out.println("Incorrect password");
        }
      } else if (choice == 'N' || choice == 'n') {
        flag = true;
        System.out.println("Password changed option cancelled!");
      } else {
        System.out.println("Enter valid choice");
      }
    } while (!flag);
  }
}