/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Experience extends Employee {

    private int expInYear;
    private String proSkill;

    public Experience(String fullName, String birthDay, String phone, String email, String[] certificate, int expInYear, String proSkill) {
        super(fullName, birthDay, phone, email, certificate);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }


    @Override
    public String showInfor() {
        return "Experience employee{Full name = " + fullName + ", Birthday =" + birthDay + " , Phone number = " + phone + ", Email = " + email + " , Certificate =" + Arrays.toString(certificate) + " , Experience in year = " + expInYear + " , Proffesion skill = " + proSkill + " }";
    }

}
