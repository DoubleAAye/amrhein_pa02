/*General layout of class
 * 
 * BMI Calculator
 * 		readUserData
 * 			readUnitType
 * 				Metric or Imperial
 * 
 * 			readMeasurementData
 * 				readImperialData(if metric)
 * 					or
 * 				readMetricData(if imperial)
 * 	
 * 		calculateBmi
 * 			calculates the bmi
 * 
 * 		displayBmi
 * 			calculateBmiCatagory
 * 
 * 	This program will prompt the user for a measurement type, either metric or imperial and allow them to enter their information
 * 	to see what their BMI value is and what category they fall into.
 */			

import java.util.Scanner;

public class BMICalculator {
	
	   private double weight;
	   private double height;
	   private int choice;
	   private String bmiCategory;
	   private double bmi;
	   
	   Scanner userinput = new Scanner(System.in);
	   
	//Reads the type of units that want to be used and records the measurement data
    public void readUserData() {
        readUnitType();
        readMeasurementData();
    }

    //Calculates the BMI based on the user data provided
    public void calculateBmi() {	
    	bmi = (1 * getWeight()) / (getHeight() * getHeight());
    	
		
        if (bmi < 18.5)
            bmiCategory = "UnderWeight";
        else if (bmi >= 18.5 && bmi <= 24.9)
            bmiCategory = "Normal";
        else if (bmi >= 25 && bmi <= 29.9)
            bmiCategory = "OverWeight";
        else if (bmi >= 30)
            bmiCategory = "Obese";
    }
    
    //Displays the results of the BMI calculation and tells you your catagory
    public void displayBmi() {
    	System.out.println("Your BMI is " + getBmi());        
        System.out.println("This BMI means you're " + getBmiCategory());
    }
    
    //Promts the user for their data type to be used.
    private void readUnitType() {	
    	Scanner sc = new Scanner(System.in);
    	
	       System.out.println("How do you want to calculate you're BMI?");
	       System.out.println("1. By Pounds and inches, or 2. By Kilograms and Meters?");
	       
        System.out.print("Enter option 1 or option 2: ");
        choice = sc.nextInt();
    }
    
    	//Reads the measurement type choice
	   private void readMeasurementData() {
	       while (true) {
	           if (choice == 1) {
	        	   readImperialData();
	               break;
	               
	           } else if (choice == 2) {
	        	   readMetricData();
	               break;
	               
	           } else {
	               System.out.println("Inavlid Choice");
	               break;
	           }
	       }

	   }

	   //Collects the measurement data after a measurement type has been chosen
	   private void readImperialData() {
		   System.out.println("Enter your weight in Pounds: ");
		   setWeight();
		   weight = weight * 703;
		   System.out.println("Enter your height in Inches: ");
		   setHeight();
	   }
	   
	   private void readMetricData() {
		   System.out.println("Enter your weight in Kilograms: ");
		   setWeight();
		   System.out.println("Enter your height in Meters: ");
		   setHeight();
	   }

	    public static void main(String[] args) {
	        BMICalculator t = new BMICalculator();
	        t.readUserData();
	        t.calculateBmi();
	        t.displayBmi();
	    }

	   
    //Getters and Setters
    private void setWeight(){	            
        weight = userinput.nextDouble(); 
    }

    private void setHeight(){	            
        height = userinput.nextDouble(); 
    }	
    
    public double getWeight(){
        return weight;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getBmi(){
        return bmi;
    }
    
    public String getBmiCategory(){
        return bmiCategory;
    }
    
}