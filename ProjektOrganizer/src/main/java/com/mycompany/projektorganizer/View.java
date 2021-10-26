/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projektorganizer;

/**
 * View class of application.
 * 
 * @author Arkadiusz Gizdon
 */
public class View {
    
    /**
     * Prints events of the day.
     * 
     * @param day day whose events will be display
     */
    public void printEvents(Day day){
        for (int i = 0; i < day.getEvents().size(); i++) 
        {
            System.out.print(day.getEvents().get(i).getName()+" ");
            System.out.println(day.getEvents().get(i).getHour());
        }
    }
    
    /**
     * Prints dates of days and their events added to organizer.
     * 
     * @param daysList List of days added to organizer.
     */
    public void printDays(DaysList daysList){
        System.out.println("---ORGANIZER---");
        for (int i = 0; i < daysList.getDays().size(); i++) 
        {
            System.out.println(daysList.getDays().get(i).getDate());
            printEvents(daysList.getDays().get(i));
            System.out.println("");
        }
    }
    
    /**
     * Prints how many events take place in the day. 
     * 
     * @param daysList List of days added to organizer.
     */
    public void organizerSummary(DaysList daysList){
        System.out.println("Data        Ilosc wydarzen");
        for (int i = 0; i < daysList.getDays().size(); i++) 
        {
            System.out.print(daysList.getDays().get(i).getDate() + "    ");
            System.out.println(daysList.getDays().get(i).getEvents().size()); 
            System.out.println("");
        }
    }
    
    /**
     * Prints main menu of organizer.
     * 
     * @param userName Name of user.
     */
    public void printMenu(String userName){
        System.out.println("");
        System.out.println("ORGANIZER UZYTKOWNIKA " + userName);
        System.out.println("1. Dodaj wydarzenie");
        System.out.println("2. Wyświetl wydarzenia");
        System.out.println("3. Wyświetl podsumowanie");
        System.out.println("4. Wyjscie");
        System.out.println("Wybierz: ");
    }
    
    /**
     * Request to enter event name.
     */
    public void writeEventName(){
        System.out.println("Podaj nazwe wydarzenia");
    }
    
    /**
     * Request to enter date.
     */
    public void writeDate(){
        System.out.println("Podaj date");
    }
    
    /**
     * Request to enter hour.
     */
     public void writeTime(){
        System.out.println("Podaj godzine");
    }
     
    /**
     * Request to press any key.
     */ 
    public void printPressAnyKey(){
        System.out.println("Nacisnij dowolny przycisk, aby powrocic do menu");
    }
    
    /**
     * Request to add user name.
     */
    public void giveName(){
        System.out.println("Wpisz nazwe uzytkownika:");
    }
    
    /**
     * Prints alert about bad user name.
     */
    public void printBadName(){
        System.out.println("Nieprawidlowe imie uzytkownika");
    }
}
