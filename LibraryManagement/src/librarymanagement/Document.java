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
public class Document {
    String Publishers;
    int pubNumber;

    public Document(String Publishers, int pubNumber) {
        this.Publishers = Publishers;
        this.pubNumber = pubNumber;
    }

    public String getPublishers() {
        return Publishers;
    }

    public void setPublishers(String Publishers) {
        this.Publishers = Publishers;
    }

    public int getPubNumber() {
        return pubNumber;
    }

    public void setPubNumber(int pubNumber) {
        this.pubNumber = pubNumber;
    }
    
    
}
