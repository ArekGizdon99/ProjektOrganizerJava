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
public class Controller {
    private DaysList model;
    private View view;

    public Controller(DaysList model, View view) {
        this.model = model;
        this.view = view;
    }
    
    public void addDay(Day day)
    {
        model.AddToDays(day);
    }
    
    public ArrayList<Day> getDays()
    {
        return model.getDays();
    }
  
    public void createView()
    {
        view.printDays(model);
    }
}
