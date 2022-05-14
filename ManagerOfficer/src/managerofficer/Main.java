/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerofficer;


/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        
        ManagerOfficer Mo = new ManagerOfficer();
        boolean running;
        do {
            running = true;
            switch (Mo.Menu()) {
                case 1:
                    System.out.println("-----Add a new officer-----");
                    Mo.function1();

                    break;
                case 2:
                    System.out.println("----Search officer by fullname----");

                    Mo.function2();
                    break;
                case 3:
                    System.out.println("----List officer----");

                    Mo.function3();
                    break;
                case 4:
                    System.out.println("Thanks for using this software <3");
                    running = false;
                    break;

            }
        } while (running);

    }
    
}
