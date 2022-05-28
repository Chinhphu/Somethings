/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {

    Scanner sc = new Scanner(System.in);

    int numberCheck(String input, String noti_1, String noti_2, long min, long max) {
        int variable = 0;
        boolean isValid;
        do {
            isValid = true;
            try {
                System.out.print(input + " ");
                variable = sc.nextInt();
                if (variable < min || variable > max) {
                    System.out.println(noti_1);
                    isValid = false;
                }
            } catch (Exception e) {
                System.out.println(noti_2);
                isValid = false;
            }
            sc.nextLine();
        } while (isValid == false);
        return variable;
    }

    public String checkPhone() {
        String phone;
        boolean loop;
        do {
            loop = false;
            System.out.print("Phone number: ");
            phone = sc.nextLine();

            if (phone.matches(".*[^0-9].*")) { //when phone number is not a number
                System.out.println("Phone number must be number");
                loop = true;
            }
            if (phone.length() != 10) { //when phone number is not 10 digits
                System.out.println("Phone number must be 10 digits");
                loop = true;
            }
            if (phone.charAt(0) != '0') { //when phone number doesn't begin by 0
                System.out.println("Phone number must be begin by zero.");
                loop = true;
            }
        } while (loop);

        return phone;
    }

    public String checkName() {

        boolean isValid; // Check for valid student
        String Name; // Name of student
        do {
            isValid = true;
            Name = stringCheck("Name:", "Name can't be empty!");

            if (!(Name.matches("^[a-zA-Z].+") || Name.matches("^[a-zA-Z]"))) { // When the name doesn't begin by a a to z or A to Z
                System.out.println("Name must be begin by a character from a to z or from A to Z");
                isValid = false;
            } else {

                if (!(Name.matches("^[a-zA-Z0-9. ]{1,256}$"))) { // When the name have a character which is not from a to z, A to Z or 0 to 9 and the point
                    System.out.println("Name can't have speacial character!");
                    isValid = false;
                }
            }

        } while (isValid == false); // Loop when user input an invalid name

        return Name;
    }

    public String checkDate(String noti1, String noti2) {
        String date;
        boolean loop;
        do {
            loop = false;
            System.out.print(noti1);
            date = sc.nextLine();
            if (!(date.matches("\\d{2}/\\d{2}/\\d{4}"))) { // execute when the date is not matches form
                System.out.println(noti2);
                loop = true;
            } else { // execute when the date is not matches form dd/MM/yyyy
                try {
                    DateFormat df;
                    df = new SimpleDateFormat("dd/MM/yyyy");
                    df.setLenient(false);
                    df.parse(date);
                    Date inputDate = df.parse(date);
                    Date currentDate = new Date();
                    int x = currentDate.compareTo(inputDate);
                    if (x < 0) {
                        System.out.println("Cannot enter the time in the future!");
                        loop = true;
                    }
                } catch (ParseException e) {
                    System.out.println(noti2);
                    loop = true;
                }
            }
        } while (loop);

        return date;
    }

    public String checkEmail() {
        String email;
        boolean loop;
        do {
            loop = false;
            System.out.print("Email: ");
            email = sc.nextLine();
            if (!(email.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"))) { //when email is not valid
                System.out.println("Email must be correct format");
                loop = true;
            }
        } while (loop);

        return email;
    }

    String stringCheck(String input, String noti) {
        String variable; // The string which user input to
        boolean isValid; // Check for valid input
        do {
            isValid = true;
            System.out.print(input + " ");
            variable = sc.nextLine().trim();
            if (variable.trim().equals("")) { // When the variable is null
                System.out.println(noti);
                isValid = false;
            }
        } while (isValid == false);  // Loop wwhen the input is invalid

        return variable;
    }

    boolean askforLoop(String Notification) {
        boolean theValid; // Check for valid input
        String choice; // The string which user will input to
        do {
            theValid = true;
            System.out.print(Notification);
            choice = sc.nextLine();
            if (!((choice.toUpperCase().equals("Y") || choice.toUpperCase().equals("N")) && (choice.length() == 1) && (!"".equals(choice.trim())))) {// WWhen user doesn't input "Y" or "N"
                System.out.println("You must enter 'Y' or 'N'! ");
                theValid = false;
            }
        } while (theValid == false); // Loop when user input an invalid value

        return "Y".equals(choice.toUpperCase());
    }
}
