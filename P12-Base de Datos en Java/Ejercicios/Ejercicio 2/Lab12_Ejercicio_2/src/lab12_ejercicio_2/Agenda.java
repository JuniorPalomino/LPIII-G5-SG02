/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12_ejercicio_2;

/**
 *
 * @author ADMIN
 */
public class Agenda {
    
    private int id;
    private String FName;
    private String LName;
    private String Email;
    private int NumberPhone;

    public Agenda(int id, String FName, String LName, String Email, int NumberPhone) {
        this.id = id;
        this.FName = FName;
        this.LName = LName;
        this.Email = Email;
        this.NumberPhone = NumberPhone;
    }
     public Agenda() {
   
    }
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getNumberPhone() {
        return NumberPhone;
    }

    public void setNumberPhone(int NumberPhone) {
        this.NumberPhone = NumberPhone;
    }
    
    
    
    
}
