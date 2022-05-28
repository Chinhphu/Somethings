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
public class Fresher extends Employee {

    private String graDate;
    private String graRank;
    private String education;

    public Fresher(String fullName, String birthDay, String phone, String email, String[] certificate, String graDate, String graRank, String education) {
        super(fullName, birthDay, phone, email, certificate);
        this.graDate = graDate;
        this.graRank = graRank;
        this.education = education;
    }

    public String getGraDate() {
        return graDate;
    }

    public void setGraDate(String graDate) {
        this.graDate = graDate;
    }

    public String getGraRank() {
        return graRank;
    }

    public void setGraRank(String graRank) {
        this.graRank = graRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String showInfor() {
        return "Fresher employee{Full name = " + fullName + ", Birthday =" + birthDay + " , Phone number = " + phone + ", Email = " + email + " , Certificate =" + Arrays.toString(certificate) + " , Graduation date =" + graDate + " , Graduation rank = " + graRank + " , Education = " + education + " }";
    }

}
