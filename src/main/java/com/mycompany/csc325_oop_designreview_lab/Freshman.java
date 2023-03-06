/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author anasa
 */
public class Freshman extends Student {
    
    /**
     * default constructor
     */
    public Freshman() {
        super("", 0, 0);
    }
    
     /**
     * constructor sets name, age, and credits to the superclass class Student 
     * @param name
     * @param age
     * @param credits 
     */
    public Freshman(String name, int age, int credits){
        super(name, age, credits);
    }
    
    
}
