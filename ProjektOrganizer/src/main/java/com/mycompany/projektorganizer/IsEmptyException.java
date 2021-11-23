/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projektorganizer;

/**
 * Exception class which throw exception when value is empty.
 * 
 * @author Arkadiusz Gizdon
 */
public class IsEmptyException extends Exception{
    
    /**
     * Constructor without parameters.
     */
    public IsEmptyException(){}
    
    /**
     * Constructor with parameter.
     * 
     * @param message prints message.
     */
    public IsEmptyException(String message){
        super(message);
    }
}
