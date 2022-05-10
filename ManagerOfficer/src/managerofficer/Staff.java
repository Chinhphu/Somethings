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
public class Staff extends Officer {

    private String task;

    public Staff(String Name, String Addres, int age, String gender, String task) {
        super(Name, Addres, age, gender);
        this.task = task;
    }

}
