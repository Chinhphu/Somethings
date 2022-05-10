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
public class Newspaper extends Document {

    private String Date;

    public Newspaper(String Publishers, int pubNumber, String Date) {
        super(Publishers, pubNumber);
        this.Date = Date;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

}
