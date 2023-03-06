/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author anasa
 */
public class Senior extends Student {
    
    /**
     * default constructor
     */
    public Senior(){
        super("", 0, 0);
    }
    
    /**
     * constructor sets name, age, and credits to the superclass class Student
     * @param name
     * @param age
     * @param credits
     * @throws Exception 
     */
    public Senior(String name, int age, int credits) throws Exception {
        super(name, age, credits);
        if (credits < 85){
            Exception e = new Exception (
            "You must have 85 or more credits to be a senior");
            throw e;
        }  
    }
    
    /**
     * override to string method, print all the student information
     * @return 
     */
    @Override
    public String toString(){
        if (this.getAddress() == null) {
            this.setAddress("No address was entered");
        }
        return "Name: " + this.getName() + "\n" +
                "Age: " + this.getAge() + "\n" +
                "GPA: " + + this.getGpa() + "\n" +
                "Credits: " + this.getCredits() + "\n" +
                "Address: " + this.getAddress() + "\n";        
    }
}
