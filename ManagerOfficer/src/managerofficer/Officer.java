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
public class Officer {
    private String Name;
    private String Address;
    private int age;
    private String gender;

    public Officer(String Name, String Addres, int age, String gender) {
        this.Name = Name;
        this.Address = Addres;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddres(String Address) {
        this.Address = Address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
