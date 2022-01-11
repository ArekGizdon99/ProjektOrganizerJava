/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projektorganizerweb.model;

/**
 * Model class of event.
 * 
 * @author Arkadiusz Gizdon
 */
public class Event {
    /**
     * Name of event.
     */
    private String name;
    
    /**
     * Hour of event.
     */
    private String hour;
    
    /**
     * Gets name of event.
     * 
     * @return name of event.
     */
    public String getName() {
      return name;
   }
   
    /**
     * Sets name of event.
     * 
     * @param name name of event. 
     */
   public void setName(String name) {
      this.name = name;
   }
   
   /**
    * Gets hour of event.
    * 
    * @return hour of event.
    */
   public String getHour() {
      return hour;
   }
   
   /**
    * Sets hour of event.
    * 
    * @param hour hour of event. 
    */
   public void setHour(String hour) {
      this.hour = hour;
   }
}
