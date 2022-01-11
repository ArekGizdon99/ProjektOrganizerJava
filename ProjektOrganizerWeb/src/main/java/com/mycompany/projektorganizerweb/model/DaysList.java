/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projektorganizerweb.model;
import com.mycompany.projektorganizerweb.model.Day;
import com.mycompany.projektorganizerweb.exeptions.IsEmptyException;
import java.util.ArrayList;
/**
 * Model class of days list.
 * 
 * @author Arkadiusz Gizdon
 */
public class DaysList {
    
    /**
     * List of days added to organizer.
     */
    private ArrayList<Day> days = new ArrayList<>();
    
    /**
     * Name of user.
     */
    private String userName;
    
    /**
     * Adds a day to days list.
     * 
     * @param day Day which will be add.
     */
    public void addToDays(Day day){
        boolean dayFound = false;
        for(Day currentDay : days)
        {
            if(currentDay.getDate().equals(day.getDate()))
            {
                dayFound = true;
                Event event = new Event();
                event.setName(day.getEvent().getName());
                event.setHour(day.getEvent().getHour());
                currentDay.addToEvents(event);
            }
        }
        if(dayFound == false){
        days.add(day);
        }
    }
    
    /**
     * Gets days list.
     * 
     * @return private value days. 
     */
    public ArrayList<Day> getDays(){
        return days;
    }
    
    /**
     * Gets user name.
     * 
     * @return user name value from this object.
     * @throws IsEmptyException when value userName is empty.
     */
    public String getUserName() throws IsEmptyException{   
        if(this.userName.isEmpty()){
            throw new IsEmptyException("User name is not set");
        } else{
            return this.userName;
            }
    }
    
    /**
     * Sets user name.
     * 
     * @param name User name.
     */
    public void setUserName(String name){
        userName = name;
    }
}
