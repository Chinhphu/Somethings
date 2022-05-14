/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerofficer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ManagerOfficer {

    ArrayList<Officer> List = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    ArrayList<Officer> temp = new ArrayList<>();

    int Menu() {

        System.out.println("\n-----Manager Officer-----\n");
        System.out.println("1. Add a new officer.");
        System.out.println("2. Search officer by fullname.");
        System.out.println("3. List officer.");
        System.out.println("4. Quit.\n");

        return numberCheck("Choose function:", "\tFunction must be from 1 to 4!", "\tFunction must be from 1 to 4!", 1, 4);
    }

    void showList(ArrayList<Officer> request) {
        this.List.forEach(o -> System.out.println(o.toString()));
    }

    public void function1() {

        String Name = stringCheck("Officer name:", "Officer name can't be empty!");
        String Address = stringCheck("Address:", "Address can't be empty!");
        int age = numberCheck("Age:", "Age must be greater than 0!", "Age must be a number greater than 0 and an integer!", 0, 200);
        String gender;
        do {
            gender = stringCheck("Gender:", "Gender can't be empty!");
            if (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("other"))) {
                System.out.println("Gender must be a \"male\", \"female\" or \"other\"!");
            }
        } while (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("other")));

        System.out.println("\n-----Officer role-----");
        System.out.println("1. Engineer.");
        System.out.println("2. Staff.");
        System.out.println("3. Worker.");

        switch (numberCheck("\tChoose officer role:", "\tYour choice must be from 1 to 3!", "\tYour choie must be an integer from 1 to 3!", 1, 3)) {
            case 1:
                System.out.println("\n-----Engineer-----");
                String Engineer = stringCheck("Branch:", "Branch can't be empty!");
                List.add(new Engineer(Name, Address, age, gender, Engineer));
                break;

            case 2:
                System.out.println("\n-----Staff-----");
                String Staff = stringCheck("Task:", "Task can't be empty!");
                List.add(new Staff(Name, Address, age, gender, Staff));
                break;

            case 3:
                System.out.println("\n-----Worker-----");
                int Worker = numberCheck("Level:", "Level must be from 1 to 10!", "Level must be an integer from 1 to 10!", 1, 10);
                List.add(new Worker(Name, Address, age, gender, Worker));
                break;
        }

    }

    public void function2() {

        temp.removeAll(temp);

        String seach = stringCheck("Enter the name:", "The name can't be empty!");

        List.stream().filter((the_officer) -> (the_officer.getName().toUpperCase().contains(seach.toUpperCase()))).forEachOrdered((the_officer) -> {
            temp.add(the_officer);
        }
        );
        if (temp.isEmpty()) {
            System.out.println("\tThere is no officer's name which contains \"" + seach + "\".");
        } else {
            showList(temp);
        }
    }

    public void function3() {
        showList(List);
    }

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
        boolean isValid;
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

}
