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

    //GPA field
    private double gpa;
    
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
