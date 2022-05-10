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
public class Engineer extends Officer {
    private String branch;

    public Engineer(String Name, String Addres, int age, String gender, String branch) {
        super(Name, Addres, age, gender);
        this.branch = branch;
    }
    
    
}
