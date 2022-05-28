/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EmployeeManagement {

    static Scanner sc = new Scanner(System.in);
    Validation Vd = new Validation();

    Hashtable<String, Employee> list = new Hashtable<>();

    int Menu() {

        System.out.println("\n-----Manager Employee-----\n");
        System.out.println("1. Add a new employee.");
        System.out.println("2. List intern employee.");
        System.out.println("3. List experience employee.");
        System.out.println("4. List fresher employee.");
        System.out.println("5. Quit.\n");

        return Vd.numberCheck("Choose function:", "Function must be from 1 to 5!", "Function must be from 1 to 5!", 1, 5);
    }

    void add_1() {
        String ID = Vd.stringCheck("ID:", "ID can't be empty!");
        if (list.containsKey(ID)) {
            boolean choose = Vd.askforLoop("ID is exist. Do you want to replace it? (Y/N):");
            if (!choose) {
                return;
            }
        }

        String Name = Vd.checkName();
        String Birthday = Vd.checkDate("Birthday:", "Birthday have to correct format(dd/MM/yyyy)");
        String Phone = Vd.checkPhone();
        String Email = Vd.checkEmail();
        
        String temp = "";
        int i = 0;
        do {
            temp += Vd.stringCheck("Certificate:", "Certificate can't be empty!")+"~";
            i++;
        } while (Vd.askforLoop("Add another certificate? (Y/N):"));

        String[] Certificate = temp.split("~");
        
        System.out.println("\n-----Employee type-----");
        System.out.println("1. Experience.");
        System.out.println("2. Fresher.");
        System.out.println("3. Intern.");

        switch (Vd.numberCheck("\tChoose employee type:", "Your choice must be from 1 to 3!", "Your choie must be an integer from 1 to 3!", 1, 3)) {
            case 1:
                System.out.println("\n-----Experience-----");
                int ExpInYear = Vd.numberCheck("Experience in year:", "Experience must be greater than 0!", "Experience must be greater than 0!", 0, 32767);
                String Skill = Vd.stringCheck("Proffesion skill:", "Proffesion skill can't be empty!");
                list.put(ID, new Experience(Name, Birthday, Phone, Email, Certificate, ExpInYear, Skill));
                break;

            case 2:
                System.out.println("\n-----Fresher-----");
                String GraDate = Vd.checkDate("Graduation date:", "Graduation date have to correct format(dd/MM/yyyy)");
                String GraRank = Vd.stringCheck("Graduation rank:", "Graduation rank can't be empty!");
                String Edu = Vd.stringCheck("Education:", "Education can't be empty!");
                list.put(ID, new Fresher(Name, Birthday, Phone, Email, Certificate, GraDate, GraRank, Edu));
                break;

            case 3:
                System.out.println("\n-----Intern-----");
                String Major = Vd.stringCheck("Major:", "Major can't be empty!");
                String Semester = Vd.stringCheck("Semester:", "Semester can't be empty!");
                String Uni = Vd.stringCheck("Uiversity name:", "University name can't be empty!");
                list.put(ID, new Intern(Name, Birthday, Phone, Email, Certificate, Major, Semester, Uni));
                break;
        }
    }

    void interm_2() {
        list.keySet().forEach((key) -> {
            if (list.get(key) instanceof Intern){
            System.out.println(list.get(key).showInfor());}
        });
    }
    
    void experience_3() {
        list.keySet().forEach((key) -> {
            if (list.get(key) instanceof Experience){
            System.out.println(list.get(key).showInfor());}
        });
    }
    
    void fresher_4() {
        list.keySet().forEach((key) -> {
            if (list.get(key) instanceof Fresher){
            System.out.println(list.get(key).showInfor());}
        });
    }
}
