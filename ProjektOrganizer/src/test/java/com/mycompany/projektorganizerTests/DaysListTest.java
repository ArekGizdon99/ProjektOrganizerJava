/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.projektorganizerTests;

import com.mycompany.projektorganizer.Day;
import com.mycompany.projektorganizer.DaysList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Arek
 */
public class DaysListTest {
    
    private DaysList testDaysList;
 
    @ParameterizedTest
    @ValueSource(strings = {"9:00", "Kino", "12.12.2021"})
    public void addToDaysTest(String hour, String eventName, String dateString)
    {
         Day testDay = new Day();
         testDay.setEvent(hour, eventName);
         testDay.setDate(dateString);
         testDaysList.addToDays(testDay);
         //todo
    }
    
    @ParameterizedTest
    @ValueSource(strings = {""})
    public void getUserNameException(String userName)
    {
    }

}
