/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployeeManagement Em = new EmployeeManagement();
        boolean running;
        do {
            running = true;
            switch (Em.Menu()) {
                case 1:
                    System.out.println("-----Add a new employee-----");
                    Em.add_1();

                    break;
                case 2:
                    System.out.println("----List intern employee----");
                    Em.interm_2();
                    
                    break;
                case 3:
                    System.out.println("----List experience employee----");
                    Em.experience_3();

                    break;

                case 4:
                    System.out.println("----List fresher employee----");
                    Em.fresher_4();

                    break;
                case 5:
                    System.out.println("Thanks for using this software <3");
                    running = false;
                    break;

            }
        } while (running);
    }

}
