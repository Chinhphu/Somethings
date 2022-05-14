/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibraryManagement Lib = new LibraryManagement();
        boolean running;
        do {
            running = true;
            switch (Lib.Menu()) {
                case 1:
                    System.out.println("-----Add a new document-----");
                    Lib.addDocument_1();

                    break;
                case 2:
                    System.out.println("----Delete document by document ID----");

                    Lib.deleteDocument_2();
                    break;
                case 3:
                    System.out.println("----Document information----");

                    Lib.showDocument_3();
                    break;

                case 4:
                    System.out.println("----Search by document type----");

                    Lib.typeSearch_4();
                    break;
                case 5:
                    System.out.println("Thanks for using this software <3");
                    running = false;
                    break;

            }
        } while (running);
    }

}
