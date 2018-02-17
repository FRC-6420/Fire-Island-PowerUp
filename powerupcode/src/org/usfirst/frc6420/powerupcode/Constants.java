package org.usfirst.frc6420.powerupcode;

public class Constants {
	
   /*************************************************
    * constants for drive train and lift/motors  
    *************************************************/
	
	// drive train motors 
	
	//ramp constant changes how fast it speeds up and down 
	public static final double rampConstant = 0.01;
	// zero band changes the size of the zero area on the controller 
	public static final double zeroBand = 0.1;
	// tuning factor changes how fast the robot can go 
	public static final double tuningFactor = 0.75;
	
	// arms/grabber motors 
	public static final double grabberOutSpeed = 0.4;
	public static final double grabberInSpeed = -0.4;
	
	// lift motors
	public static final double liftUpSpeed = 0.35;
	public static final double liftdownSpeed = -0.175;

}

