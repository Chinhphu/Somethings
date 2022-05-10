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
public class Journal extends Document {

    private String numPub;
    private int Month;

    public Journal(String Publishers, int pubNumber, String numPub, int Month) {
        super(Publishers, pubNumber);
        this.numPub = numPub;
        this.Month = Month;
    }

    public String getNumPub() {
        return numPub;
    }

    public void setNumPub(String numPub) {
        this.numPub = numPub;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

}
