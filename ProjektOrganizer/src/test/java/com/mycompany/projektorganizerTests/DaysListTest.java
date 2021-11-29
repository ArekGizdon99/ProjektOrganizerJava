/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.projektorganizerTests;

import com.mycompany.projektorganizer.model.Day;
import com.mycompany.projektorganizer.model.DaysList;
import com.mycompany.projektorganizer.exeptions.IsEmptyException;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Arek
 */
public class DaysListTest {
    
    private DaysList testDaysList;

    /**
     * Function which creates new instance of tested class before each test begin.
     */
    @BeforeEach
    public void setList(){
        testDaysList = new DaysList();
   }
    
    /**
     *Test setting paramaters of day and adding to days list.
     * @param hour event hour
     * @param eventName event name
     * @param dateString date of day
     */
    @ParameterizedTest
    @CsvSource(value = {"9:00-Kino-12.12.2021", "11:00-Lekarz-17.12.2021"}, delimiter = '-')
    public void addToDaysTest(String hour, String eventName, String dateString)
    {
         Day testDay = new Day();
         testDay.setEvent(hour, eventName);
         testDay.setDate(dateString);
         testDaysList.addToDays(testDay);
        
         assertEquals(testDaysList.getDays().get(0).getEvent().getHour(),hour, "Hour incorrect assigned");
         assertEquals(testDaysList.getDays().get(0).getEvent().getName(),eventName, "Event name incorrect assigned");
         assertEquals(testDaysList.getDays().get(0).getDate(),dateString, "Date incorrect assigned");
    }
    
    /**
     * Test searching existing day in days list.
     * @param hour event hour
     * @param eventName event name
     * @param dateString date of day
     */
    @ParameterizedTest
    @CsvSource(value = {"9:00-Kino-12.12.2021"}, delimiter = '-')
    public void sameDateFindTest(String hour, String eventName, String dateString)
    {
        for (int i =0; i<2;i++){
         Day testDay = new Day();
         testDay.setEvent(hour, eventName);
         testDay.setDate(dateString);
         testDaysList.addToDays(testDay);
        }
        
         assertEquals(testDaysList.getDays().size(), 1 ,"Incorrect size of array list");
    }
    
    /**
     * Test empty user name exception.
     * @param userName user name
     */
    @ParameterizedTest
    @ValueSource(strings = {""})
    public void getUserNameException(String userName)
    {
            testDaysList = new DaysList();
            
            try{
                testDaysList.setUserName(userName);
                testDaysList.getUserName();
                fail("When user name is empty, method should throw exception");
            }catch(IsEmptyException e){
                assertTrue(e.getMessage().contains("User name is not set"), "Error message");
            }
            
    }
}
