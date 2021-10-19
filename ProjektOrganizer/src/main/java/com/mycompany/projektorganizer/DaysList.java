/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projektorganizer;
import java.util.ArrayList;
/**
 *
 * @author Arek
 */
public class DaysList {
    private Day day;
    private ArrayList<Day> Days = new ArrayList<Day>();
    
    public void AddToDays(Day day)
    {
        Days.add(day);
    }
    
    public ArrayList<Day> getDays()
    {
        return Days;
    }
}
