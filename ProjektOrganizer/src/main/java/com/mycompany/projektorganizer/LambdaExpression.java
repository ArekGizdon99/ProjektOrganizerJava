/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projektorganizer;

/**
 *Lambda expression class
 * 
 * @author Arek
 */
public class LambdaExpression {

    public interface EditName {

        String operation(String s);
    }

    public String operationOnString(String a, EditName op) {
        return op.operation(a);
    }
}
