/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projektorganizer;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *Controller class of the application.
 * 
 * @author Arkadiusz Gizdon
 */
public class Controller {
    /**
     * Instance of DaysList class.
     */
    private DaysList model;
    
    /**
     * Instance of View class.
     */
    private View view;
    
    /**
     * Constructor with parameters.
     * 
     * @param model instance of DaysList class.
     * @param view instance of View class.
     */
    public Controller(DaysList model, View view) {
        this.model = model;
        this.view = view;
    }
  
    /**
     * Request user to press any key.
     */
    public void pressAnyKey()
    {
        view.printPressAnyKey();
        Scanner scan = new Scanner(System.in);
        String anyKey = scan.nextLine();
    }
    
    /**
     * Request user to enter a name.
     */
    public void addUserName(){
            String name;
            view.giveName();
            Scanner scan = new Scanner(System.in);
            name = scan.nextLine();
            model.setUserName(name);
    }
    
    /**
     * Adds a new day to the organizer.
     */
    public void addToOrganizer(){
            Day day = new Day();
            String eventName;
            String hour;
            String dateString;
          
            Scanner scan = new Scanner(System.in);
            view.writeEventName();
            eventName = scan.nextLine();
            view.writeDate();
            dateString = scan.nextLine();
            view.writeTime();
            hour = scan.nextLine();
            
            day.setEvent(hour, eventName);
            day.setDate(dateString);
            
            this.model.addToDays(day);
        }
    
    /**
     * Create user menu.
     * 
     * @throws Exception when user name is not add.
     */
    public void createMenu() throws Exception{
        String userName;
        try{
        userName = model.getUserName();
        
        view.printMenu(userName);
        Scanner scan = new Scanner(System.in);
        int chooseOption;
        chooseOption = scan.nextInt();
         
        switch(chooseOption)
        {
            case 1: 
                addToOrganizer();
                break;
            case 2:
                view.printDays(model);
                pressAnyKey();
                break;
            case 3:
                view.organizerSummary(model);
                pressAnyKey();
                break;
            case 4:
                System.exit(0);
        }                
        }
        catch(IsEmptyException e){
            System.out.println(e.getMessage());
        }
    }
}
