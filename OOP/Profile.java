/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Profile {
    private String  ID;
    private String firstname;
    private String lastname;
    private String adress;
    private String phone;
    private String email;

    public Profile() {
    }

    public Profile(int stt, String firstname, String lastname, String adress, String phone, String email) {
        this.ID = String.format("%03d",stt);
        this.firstname = firstname;
        this.lastname = lastname;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
    }
    
    public String  getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

    @Override
    public String toString() {
        return "ID : "+this.ID+"\n"
                +"FIRSTNAME : "+this.firstname+"\n"
                +"LASTNAME : "+this.lastname+"\n"
                +"ADRESS : "+this.adress+"\n"
                +"PHONE : "+this.phone+"\n"
                +"EMAIL : "+this.email+"\n";
    }
    
    
}
