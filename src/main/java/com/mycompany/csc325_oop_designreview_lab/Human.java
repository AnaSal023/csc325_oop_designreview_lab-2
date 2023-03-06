/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab and Ana
 */
public abstract class Human {
    //instances
    private String name;
	protected String address;
	private int age;

	// constructor that takes only two paras
	/**
         * constructor that takes only two parameters and sets them to the name and age instance of this class
         * @param name
         * @param age 
         */
        public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
        /**
         * get method of name instance
         * @return 
         */
	public String getName() {
		return name;
	}

        /**
         * set method of name instance
         * @param name 
         */
	public void setName(String name) {
		this.name = name;
	}

        /**
         * get abstract method of address instance
         * @return 
         */
	public abstract String getAddress() ;

        /**
         * set abstract method of address instance
         * @param address 
         */
	public abstract void setAddress(String address);

        /**
         * get method of age instance
         * @return 
         */
	public int getAge() {
		return age;
	}

        /**
         * set method of age instance
         * @param age 
         */
	public void setAge(int age) {
		this.age = age;
	}
}