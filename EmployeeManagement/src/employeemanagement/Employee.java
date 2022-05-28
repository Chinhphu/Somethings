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
public class Employee {

    String fullName;
    String birthDay;
    String phone;
    String email;
    String[] certificate;

    public Employee(String fullName, String birthDay, String phone, String email, String[] certificate) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.certificate = certificate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getCertificate() {
        return certificate;
    }

    public void setCertificate(String[] certificate) {
        this.certificate = certificate;
    }
    
    public String showInfor() {
        return "Experience employee{Full name = " + fullName + ", Birthday =" + birthDay + " , Phone number = " + phone + ", Email = " + email + " , Certificate =" + Arrays.toString(certificate) + " }";
    }
}
