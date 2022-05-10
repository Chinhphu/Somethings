/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

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

    static Scanner sc = new Scanner(System.in);

    int numberCheck(String input, String noti_1, String noti_2, long min, long max) {
        int variable = 0;
        boolean isValid;
        do {
            isValid = true;
            try {
                System.out.print("\t" + input + " ");
                variable = sc.nextInt();
                if (variable < min || variable > max) {
                    System.out.println("\t" + noti_1);
                    isValid = false;
                }
            } catch (Exception e) {
                System.out.println("\t" + noti_2);
                isValid = false;
            }
            sc.nextLine();
        } while (isValid == false);
        return variable;
    }

    String stringCheck(String input, String noti) {
        String variable;
        boolean isValid = true;
        do {
            isValid = true;
            System.out.print("\t" + input + " ");
            variable = sc.nextLine().trim();
            if (variable.trim().equals("")) {
                System.out.println("\t" + noti);
                isValid = false;
            }
        } while (isValid == false);

        return variable;
    }

    String dateCheck(String notification) {
        boolean isValid;
        String date;
        do {
            isValid = true;
            System.out.print("\t" + notification + " ");
            date = sc.nextLine();
            if (!(date.matches("\\d{4}-\\d{2}-\\d{2}"))) {
                System.out.println("\tYou must enter in yyyy-MM-dd format!");
                isValid = false;
            } else {
                try {
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    df.setLenient(false);
                    df.parse(date);
                    Date inputDate = df.parse(date);
                    Date currentDate = new Date();
                    int x = currentDate.compareTo(inputDate);
                    if (x < 0) {
                        System.out.println("\tCannot enter the time in the future!");
                        isValid = false;
                    }
                } catch (ParseException e) {
                    System.out.println("\tYou must enter a valid day!");
                    isValid = false;
                }
            }
        } while (!(isValid));
        return date;
    }

}
