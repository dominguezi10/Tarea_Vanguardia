/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_vanguardia;

import java.util.ArrayList;
/**
 *
 * @author Ingrid
 */
public class HeadHunter implements Subject{
    private ArrayList<String> jobs = new ArrayList();
    private ArrayList<Observer> userList = new ArrayList();
    
    public HeadHunter(){
    }
    
    @Override
    public void notifyAllObserver(){     
        for(Observer obs: userList){
            obs.update(this);
        }
    }
    
    public void addJob(String job){
      jobs.add(job);
    }
    
    public ArrayList getJobs(){
        return jobs;
    }
    
    @Override
    public String toString(){
       return "salida"; 
    }

    @Override
    public void registerObserver(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        userList.add(observer);
    }
}
