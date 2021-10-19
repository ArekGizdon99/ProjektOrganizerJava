/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projektorganizer;

/**
 *
 * @author Arek
 */
public class View {
    public void printEvents(Day day)
    {
        for (int i = 0; i < day.getEvents().size(); i++) 
        {
            System.out.println(day.getEvents().get(i).getName());
            System.out.println(day.getEvents().get(i).getHour());
        }
    }
    
    public void printDays(DaysList daysList)
    {
        System.out.println("---ORGANIZER---");
        for (int i = 0; i < daysList.getDays().size(); i++) 
        {
            System.out.println(daysList.getDays().get(i).getDate());
            printEvents(daysList.getDays().get(i));
        }
}
}
