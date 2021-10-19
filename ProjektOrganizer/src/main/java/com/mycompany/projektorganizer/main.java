/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projektorganizer;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

/**
 *
 * @author Arek
 */

public class main {
        public static void main (String[] args)
        {
            DaysList model = new DaysList();
            View view = new View();
            Controller controller = new Controller(model, view);
                
            
              try{
            addToOrganizer(controller);
            }catch (Exception e)
            {}
              
            controller.createView();
        }
        
       
        private static void addToOrganizer(Controller controller) throws Exception
        {
            Day day = new Day();
            String eventName;
            float hour;
            String dateString;
            Date date;
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj nazwe wydarzenia");
            eventName = scan.nextLine();
            System.out.println("Podaj date [dd.mm.yyyy]");
            dateString = scan.nextLine();
            
            date = new SimpleDateFormat("dd.MM.yyyy").parse(dateString);
            
            System.out.println("Podaj godzine");
            hour = scan.nextFloat();
            
            System.out.println("Nazwa: " + eventName);
            System.out.println("Data: " + dateString);
            System.out.println("Godzina: " + hour);
            
            day.setEvent(hour, eventName);
            day.setDate(date);
            
            controller.addDay(day);
        }
    }

