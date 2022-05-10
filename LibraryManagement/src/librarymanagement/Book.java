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
public class Book extends Document {

    private String Authors;
    private int Pages;

    public Book(String Publishers, int pubNumber, String Authors, int Pages) {
        super(Publishers, pubNumber);
        this.Authors = Authors;
        this.Pages = Pages;
    }

    public String getAuthors() {
        return Authors;
    }

    public void setAuthors(String Authors) {
        this.Authors = Authors;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int Pages) {
        this.Pages = Pages;
    }

}
