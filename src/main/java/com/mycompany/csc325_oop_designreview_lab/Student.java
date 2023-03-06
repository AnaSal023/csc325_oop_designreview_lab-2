/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {

    //GPA instance
    private double gpa;
    
    //credits instance
    private int credits;
    //default constructor
    public Student() {
        super("", 0);
        this.credits = 0;
    }
    /**
     * constructor sets name and age to superclass and credits to the credits instance from this class
     * @param name
     * @param age
     * @param credits 
     */
    public Student(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }
    
    /**
     * implemented and override the abstract get address method of the abstract Human superclass
     * @return 
     */
    @Override
    public String getAddress() {
        return this.address;
    }

    /**
     * implemented and override the abstract set address method of the abstract Human superclass
     * @param address 
     */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * created get method of the GPA instance
     * @return 
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * created set method of the GPA instance
     * @param gpa 
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
	
}
