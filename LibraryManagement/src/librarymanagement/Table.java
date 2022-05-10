/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import static java.lang.Math.max;
import java.util.Hashtable;
import java.util.Map.Entry;

/**
 *
 * @author Admin
 */
public class Table {

    //Showing all vocabulary in dictionary
    void showList(Hashtable<String, Document> document, String c1, String c2, String c3) {

        int maxC1 = max(0, c1.length() + 2);
        int maxC2 = max(0, c2.length() + 2);
        int maxC3 = max(0, c3.length() + 2);

        for (Entry<String, Document> entry : document.entrySet()) {
            if (maxC1 > 0) {
                maxC1 = Math.max(maxC1, entry.getKey().length() + 2);
            }
            if (maxC2 > 0) {
                maxC2 = Math.max(maxC2, entry.getValue().getPublishers().length() + 2);
            }
            if (maxC3 > 0) {
                maxC3 = Math.max(maxC3, String.valueOf(entry.getValue().getPubNumber()).length() + 2);
            }
        }

        printBorder(maxC1, maxC2, maxC3, 0, 0);
        System.out.print("| " + printTitleleft(c1, maxC1));
        System.out.print(" | " + printTitleleft(c2, maxC2));
        System.out.print(" | " + printTitleleft(c3, maxC3));

        System.out.println(" |");

        printBorder(maxC1, maxC2, maxC3, 0, 0);

        for (Entry<String, Document> entry : document.entrySet()) {
            System.out.print("| " + printTitleleft(entry.getKey(), maxC1));
            System.out.print(" | " + printTitleleft(entry.getValue().getPublishers(), maxC2));
            System.out.print(" | " + printTitleright(String.valueOf(entry.getValue().getPubNumber()), maxC3));

            System.out.println(" |");
        }
        printBorder(maxC1, maxC2, maxC3, 0, 0);
    }

    void showListBook(Hashtable<String, Book> document, String c1, String c2, String c3, String c4, String c5) {

        int maxC1 = max(0, c1.length() + 2);
        int maxC2 = max(0, c2.length() + 2);
        int maxC3 = max(0, c3.length() + 2);
        int maxC4 = max(0, c4.length() + 2);
        int maxC5 = max(0, c5.length() + 2);

        for (Entry<String, Book> entry : document.entrySet()) {
            if (maxC1 > 0) {
                maxC1 = Math.max(maxC1, entry.getKey().length() + 2);
            }
            if (maxC2 > 0) {
                maxC2 = Math.max(maxC2, entry.getValue().getPublishers().length() + 2);
            }
            if (maxC3 > 0) {
                maxC3 = Math.max(maxC3, String.valueOf(entry.getValue().getPubNumber()).length() + 2);
            }
            if (maxC4 > 0) {
                maxC4 = Math.max(maxC4, entry.getValue().getAuthors().length() + 2);
            }
            if (maxC5 > 0) {
                maxC5 = Math.max(maxC5, String.valueOf(entry.getValue().getPages()).length() + 2);
            }
        }

        printBorder(maxC1, maxC2, maxC3, maxC4, maxC5);
        System.out.print("| " + printTitleleft(c1, maxC1));
        System.out.print(" | " + printTitleleft(c2, maxC2));
        System.out.print(" | " + printTitleleft(c3, maxC3));
        System.out.print(" | " + printTitleleft(c4, maxC4));
        System.out.print(" | " + printTitleleft(c5, maxC5));

        System.out.println(" |");

        printBorder(maxC1, maxC2, maxC3, maxC4, maxC5);

        for (Entry<String, Book> entry : document.entrySet()) {
            System.out.print("| " + printTitleleft(entry.getKey(), maxC1));
            System.out.print(" | " + printTitleleft(entry.getValue().getPublishers(), maxC2));
            System.out.print(" | " + printTitleright(String.valueOf(entry.getValue().getPubNumber()), maxC3));
            System.out.print(" | " + printTitleleft(entry.getValue().getAuthors(), maxC4));
            System.out.print(" | " + printTitleright(String.valueOf(entry.getValue().getPages()), maxC5));

            System.out.println(" |");
        }
        printBorder(maxC1, maxC2, maxC3, maxC4, maxC5);
    }

    void showListJournal(Hashtable<String, Journal> document, String c1, String c2, String c3, String c4, String c5) {

        int maxC1 = max(0, c1.length() + 2);
        int maxC2 = max(0, c2.length() + 2);
        int maxC3 = max(0, c3.length() + 2);
        int maxC4 = max(0, c4.length() + 2);
        int maxC5 = max(0, c5.length() + 2);

        for (Entry<String, Journal> entry : document.entrySet()) {
            if (maxC1 > 0) {
                maxC1 = Math.max(maxC1, entry.getKey().length() + 2);
            }
            if (maxC2 > 0) {
                maxC2 = Math.max(maxC2, entry.getValue().getPublishers().length() + 2);
            }
            if (maxC3 > 0) {
                maxC3 = Math.max(maxC3, String.valueOf(entry.getValue().getPubNumber()).length() + 2);
            }
            if (maxC4 > 0) {
                maxC4 = Math.max(maxC4, entry.getValue().getNumPub().length() + 2);
            }
            if (maxC5 > 0) {
                maxC5 = Math.max(maxC5, String.valueOf(entry.getValue().getMonth()).length() + 2);
            }
        }

        printBorder(maxC1, maxC2, maxC3, maxC4, maxC5);
        System.out.print("| " + printTitleleft(c1, maxC1));
        System.out.print(" | " + printTitleleft(c2, maxC2));
        System.out.print(" | " + printTitleleft(c3, maxC3));
        System.out.print(" | " + printTitleleft(c4, maxC4));
        System.out.print(" | " + printTitleleft(c5, maxC5));

        System.out.println(" |");

        printBorder(maxC1, maxC2, maxC3, maxC4, maxC5);

        for (Entry<String, Journal> entry : document.entrySet()) {
            System.out.print("| " + printTitleleft(entry.getKey(), maxC1));
            System.out.print(" | " + printTitleleft(entry.getValue().getPublishers(), maxC2));
            System.out.print(" | " + printTitleright(String.valueOf(entry.getValue().getPubNumber()), maxC3));
            System.out.print(" | " + printTitleleft(entry.getValue().getNumPub(), maxC4));
            System.out.print(" | " + printTitleright(String.valueOf(entry.getValue().getMonth()), maxC5));

            System.out.println(" |");
        }
        printBorder(maxC1, maxC2, maxC3, maxC4, maxC5);
    }

    void showListNewspaper(Hashtable<String, Newspaper> document, String c1, String c2, String c3, String c4) {

        int maxC1 = max(0, c1.length() + 2);
        int maxC2 = max(0, c2.length() + 2);
        int maxC3 = max(0, c3.length() + 2);
        int maxC4 = max(0, c4.length() + 2);

        for (Entry<String, Newspaper> entry : document.entrySet()) {
            if (maxC1 > 0) {
                maxC1 = Math.max(maxC1, entry.getKey().length() + 2);
            }
            if (maxC2 > 0) {
                maxC2 = Math.max(maxC2, entry.getValue().getPublishers().length() + 2);
            }
            if (maxC3 > 0) {
                maxC3 = Math.max(maxC3, String.valueOf(entry.getValue().getPubNumber()).length() + 2);
            }
            if (maxC4 > 0) {
                maxC4 = Math.max(maxC4, entry.getValue().getDate().length() + 2);
            }
        }

        printBorder(maxC1, maxC2, maxC3, maxC4, 0);
        System.out.print("| " + printTitleleft(c1, maxC1));
        System.out.print(" | " + printTitleleft(c2, maxC2));
        System.out.print(" | " + printTitleleft(c3, maxC3));
        System.out.print(" | " + printTitleleft(c4, maxC4));

        System.out.println(" |");

        printBorder(maxC1, maxC2, maxC3, maxC4, 0);

        for (Entry<String, Newspaper> entry : document.entrySet()) {
            System.out.print("| " + printTitleleft(entry.getKey(), maxC1));
            System.out.print(" | " + printTitleleft(entry.getValue().getPublishers(), maxC2));
            System.out.print(" | " + printTitleright(String.valueOf(entry.getValue().getPubNumber()), maxC3));
            System.out.print(" | " + printTitleleft(entry.getValue().getDate(), maxC4));

            System.out.println(" |");
        }
        printBorder(maxC1, maxC2, maxC3, maxC4, 0);
    }

    //Print title of table
    String printTitleleft(String st, int x) {
        for (int i = st.length(); i < x - 2; i++) {
            st = st + " ";
        }
        return st;
    }

    //Print title of table right margin
    String printTitleright(String st, int x) {
        for (int i = st.length(); i < x - 2; i++) {
            st = " " + st;
        }
        return st;
    }

    //Print ----- and + for the table border
    int printBorder(int a, int b, int c, int d, int e) {
        System.out.print("+");
        for (int i = 0; i < a; i++) {
            System.out.print("-");
        }

        if (b == 0) {
            System.out.println("+");
            return 0;
        } else {
            System.out.print("+");
            for (int i = 0; i < b; i++) {
                System.out.print("-");
            }
        }

        if (c == 0) {
            System.out.println("+");
            return 0;
        } else {
            System.out.print("+");
            for (int i = 0; i < c; i++) {
                System.out.print("-");
            }
        }

        if (d == 0) {
            System.out.println("+");
            return 0;
        } else {
            System.out.print("+");
            for (int i = 0; i < d; i++) {
                System.out.print("-");
            }
        }

        if (e == 0) {
            System.out.println("+");
            return 0;
        }
        {
            System.out.print("+");
            for (int i = 0; i < e; i++) {
                System.out.print("-");
            }
        }
        System.out.println("+");
        return 0;
    }
}
