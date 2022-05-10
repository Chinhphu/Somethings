/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.util.Hashtable;

/**
 *
 * @author Admin
 */
public class LibraryManagement {

    Validation Vd = new Validation();
    private Hashtable<String, Document> List = new Hashtable<>();
    private Hashtable<String, Book> Book = new Hashtable<>();
    private Hashtable<String, Journal> Journal = new Hashtable<>();
    private Hashtable<String, Newspaper> Newspaper = new Hashtable<>();
    Table show = new Table();

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

    int Menu() {

        System.out.println("\n-----Manager Officer-----\n");
        System.out.println("1. Add a new document.");
        System.out.println("2. Delete document by document ID.");
        System.out.println("3. Document information.");
        System.out.println("4. Search by document type.");
        System.out.println("5. Quit.\n");

        return Vd.numberCheck("Choose function:", "\tFunction must be from 1 to 5!", "\tFunction must be from 1 to 5!", 1, 5);
    }

    void addDocument_1() {

        String ID;

        do {
            ID = Vd.stringCheck("Document ID:", "Document ID can't be empty");
            if (List.containsKey(ID)) {
                System.out.println("ID already exists!");
            }
        } while (List.containsKey(ID));

        String Publisher = Vd.stringCheck("Publisher:", "Publisher can't be empty!");
        int Number_of_releases = Vd.numberCheck("Number of releases:", "Number of releases must be a possitive integer!", "Number of releases must be a possitive integer!", 0, 32767);

        System.out.println("\n-----Type of document-----");
        System.out.println("1. Book.");
        System.out.println("2. Journal.");
        System.out.println("3. Newspaper.");

        switch (Vd.numberCheck("Choose type of document:", "Your choie must be from 1 to 3!", "Your choie must be an integer from 1 to 3!", 1, 3)) {
            case 1:
                System.out.println("\n-----Book-----");
                String Number = Vd.stringCheck("Author:", "Author can't be empty!");
                int Page = Vd.numberCheck("Number of pages:", "Number of pages must be an positive integer!", "Number of pages must be an positive integer!", 0, 32767);
                this.List.put(ID, new Book(Publisher, Number_of_releases, Number, Page));
                this.Book.put(ID, new Book(Publisher, Number_of_releases, Number, Page));
                break;

            case 2:
                System.out.println("\n-----Journal-----");
                String Numpub = Vd.stringCheck("Issue number:", "Issue number can't be empty!");
                int Month = Vd.numberCheck("Publish month:", "Publish month must be from 1 to 12!", "Publish month must be an integer from 1 to 12!", 1, 12);
                this.List.put(ID, new Journal(Publisher, Number_of_releases, Numpub, Month));
                this.Journal.put(ID, new Journal(Publisher, Number_of_releases, Numpub, Month));
                break;

            case 3:
                System.out.println("\n-----Newspaper-----");
                String PublishDate = Vd.dateCheck("Publish date (yyyy-MM-dd):");
                this.List.put(ID, new Newspaper(Publisher, Number_of_releases, PublishDate));
                this.Newspaper.put(ID, new Newspaper(Publisher, Number_of_releases, PublishDate));
                break;
        }
    }

    void deleteDocument_2() {
        String ID = Vd.stringCheck("Document ID:", "Document ID can't be empty!");
        if (List.containsKey(ID)) {
            List.remove(ID);
            System.out.println("\tSuccesful");
        } else {
            System.out.println("\tThe ID can't be found");
        }
    }

    void showDocument_3() {
        show.showList(List, "Document ID", "Publisher", "Number of releases");
    }

    void typeSearch_4() {
        System.out.println("\n-----Type of document-----");
        System.out.println("1. Book.");
        System.out.println("2. Journal.");
        System.out.println("3. Newspaper.");
        
        switch (Vd.numberCheck("Choose type of document:", "Your choie must be from 1 to 3!", "Your choie must be an integer from 1 to 3!", 1, 3)) {
            case 1:
                System.out.println("\n-----Book-----");
                show.showListBook(Book, "Document ID", "Publisher", "Number of releases", "Author", "Number of pages");
                break;

            case 2:
                System.out.println("\n-----Journal-----");
                show.showListJournal(Journal, "Document ID", "Publisher", "Number of releases", "Issue number", "Publish month");
                break;

            case 3:
                System.out.println("\n-----Newspaper-----");
                show.showListNewspaper(Newspaper, "Document ID", "Publisher", "Number of releases", "Publish date");
                break;
        }
    }
}
