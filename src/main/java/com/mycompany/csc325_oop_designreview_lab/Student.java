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
    
    
    @Override
    public String getAddress() {
        return this.address;
    }

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
	
	// ToDo 4: Add comments to your code
}
