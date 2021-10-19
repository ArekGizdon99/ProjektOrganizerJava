/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projektorganizer;

import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author Arek
 */
public class Day {
    private Date date;
    private Event event = new Event();
    private ArrayList<Event> events = new ArrayList<Event>();
    
    public Date getDate()//bylo date
    {
        return date;
    }
    
    public void setDate(Date date)
    {
        this.date = date;
    }
    
    public Event getEvent()
    {
        return event;
    }
    
    public void setEvent(float hour, String name)
    {
        this.event.setHour(hour);
        this.event.setName(name);
        events.add(event);
    }
    
    public void AddToEvents(Event event)
    {
        events.add(event);
    }
    
    public ArrayList<Event> getEvents()
    {
        return events;
    }
}
