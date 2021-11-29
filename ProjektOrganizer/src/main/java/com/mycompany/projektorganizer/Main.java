/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projektorganizer;

import com.mycompany.projektorganizer.controller.Controller;
import com.mycompany.projektorganizer.model.DaysList;
import com.mycompany.projektorganizer.view.View;


/**
 *Main class of the Organizer application. 
 * 
 * @author Arkadiusz Gizdon
 * @version 1.0
 */

public class Main {
        /**
        * Main method of the application
        * @param args first arg- User name
        */
        public static void main (String[] args)
        {
            
            
            DaysList model = new DaysList();
            View view = new View();
            Controller controller = new Controller(model, view);
            
            if(args.length == 0){
            controller.addUserName();
            }
            else{
            model.setUserName(args[0]);
            }
            
            while(true)
            {
              try{
              controller.createMenu();
              }
              catch(Exception e)
              {
                  view.printBadName();
              }
            }          
        } 
    }

