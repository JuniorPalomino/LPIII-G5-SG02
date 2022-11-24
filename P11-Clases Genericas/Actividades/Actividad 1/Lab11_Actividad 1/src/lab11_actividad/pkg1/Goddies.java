/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11_actividad.pkg1;

/**
 *
 * @author Alumno
 */
public class Goddies {
    
    private int id;
    private String description;
    private float price;

    public Goddies(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }
    
    public Goddies(int id) {
        this.id = id;
       
    }
    public Goddies() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
}
