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
public class MealDirector {
    public MealDirector(){
    }
    
    public void makeMeal(MealBuilder mealBuilder){
        mealBuilder.addSandwich("Cubano");
        mealBuilder.addDrink("Coca-Cola");
        mealBuilder.addOffer("15%");
        mealBuilder.setPrice(60.99);
        mealBuilder.addSide("ensalada");
        
        
        System.out.println("Detalles del Sandwich: "+mealBuilder.getModel().toString());
        
    }
}
