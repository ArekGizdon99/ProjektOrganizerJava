/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projektorganizer.model;


import java.util.ArrayList;
/**
 * Model class of day.
 * 
 * @author Arkadiusz Gizdon
 */
public class Day {
    
    /**
     * Date of the day.
     */
    private String date;
    
    /**
     * List of events of the day.
     */
    private ArrayList<Event> events = new ArrayList<Event>();
    
    /**
     * Event of the day.
     */
    private Event event = new Event();
    
    /**
     * Gets date from day.
     * 
     * @return a date of the day.
     */
    public String getDate(){
        return this.date;
    }
    
    /**
     * Gets event of the day.
     * 
     * @return event of the day.
     */
    public Event getEvent(){
        return this.event;
    }
    
    /**
     * Sets date od the day.
     * 
     * @param date date to set.
     */
    public void setDate(String date){
        this.date = date;
    }
    
   /**
    * Sets event of the day and adds to events list.
    * 
    * @param hour hour of event.
    * @param name name of event.
    */  
    public void addEvent(String hour, String name){
        event.setHour(hour);
        event.setName(name);
        events.add(event);
    }
    
    /**
     * Adds event to events list.
     * 
     * @param event which will be add to list.
     */
    public void addToEvents(Event event){
        events.add(event);
    }
    
    /**
     * Gets events list of the day.
     * 
     * @return events list of the day.
     */
    public ArrayList<Event> getEvents(){
        return events;
    }
}
