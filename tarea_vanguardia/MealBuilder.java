/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_vanguardia;

/**
 *
 * @author Ingrid
 */
public interface MealBuilder {
    public void addSandwich(String sandwich);
    public void addSide(String sides);
    public void addDrink(String drink);
    public void addOffer(String offer);
    public void setPrice(double price);
    public Meal getModel();
}
