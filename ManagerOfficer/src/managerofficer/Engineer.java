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

    public Engineer(String Name, String Address, int age, String gender, String branch) {
        super(Name, Address, age, gender);
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Engineer{branch= " + branch + ", name= " + Name + ", age= " + age + ", gender= " + gender + ", address= " + Address + "}";
    }

}
