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
public class CarFactory {
    public static Car buildCar(CarType model){
     Car car = null;
     
     if(model == CarType.SMALL){
         car = new SmallCar();
     }else if(model == CarType.SEDAN){
         car = new SedanCar();
     }else if(model == CarType.LUXURY){
         car = car = new LuxuryCar();
     }
     
     return car;
    }
}
