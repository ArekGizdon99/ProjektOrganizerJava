/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projektorganizerTests;

import com.mycompany.projektorganizer.model.Day;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


/**
 *
 * @author Arek
 */
public class DayTest {
    
    private Day testDay = new Day();
 
    @ParameterizedTest
    @CsvSource(value = {"9:00-Kino", "11:00-Fryzjer"}, delimiter ='-')
    public void setEventTest(String hour, String eventName)
    {
       testDay.addEvent(hour, eventName);
       assertEquals(testDay.getEvent().getHour(), hour, "Hour incorrect assigned");
       assertEquals(testDay.getEvent().getName(), eventName, "Event name incorrect assigned");
    }
}
