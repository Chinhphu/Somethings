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
public class Intern extends Employee {

    private String major;
    private String semester;
    private String uniName;

    public Intern(String fullName, String birthDay, String phone, String email, String[] certificate, String major, String semester, String uniName) {
        super(fullName, birthDay, phone, email, certificate);
        this.major = major;
        this.semester = semester;
        this.uniName = uniName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    @Override
    public String showInfor() {
        return "Intern employee{Full name = " + fullName + ", Birthday =" + birthDay + " , Phone number = " + phone + ", Email = " + email + " , Certificate =" + Arrays.toString(certificate) + " , Major =" + major + " , Semester = " + semester + " , University name = " + uniName + " }";
    }
}
