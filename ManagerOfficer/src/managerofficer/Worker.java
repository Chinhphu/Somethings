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
public class Worker extends Officer {
    private int level;

    public Worker(String Name, String Addres, int age, String gender, int level) {
        super(Name, Addres, age, gender);
        this.level = level;
    }
    
    @Override
    public String toString() {
        return "Worker{level= " + level + ", name= " + Name + ", age= " + age + ", gender= " + gender + ", address= " + Address + "}";
    }
}
