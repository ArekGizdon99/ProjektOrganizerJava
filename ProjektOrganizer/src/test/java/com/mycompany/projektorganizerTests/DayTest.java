/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projektorganizerTests;

import com.mycompany.projektorganizer.Day;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Arek
 */
public class DayTest {
    
    private Day testDay;
    
    @ParameterizedTest
    @ValueSource(strings = {"9:00", "Kino"})
    public void setEventTest(String hour, String eventName)
    {
    }
}
