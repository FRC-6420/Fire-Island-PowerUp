package org.usfirst.frc6420.powerupcode;

public class Constants {
	
	/*************************************************
	 * constants for Autonomous  
	 *************************************************/
	public static final double autoForwardTime = 5.0; //sec
	public static final double autoForwardSpeed = .25;
	public static final double autoForwardSpeed2 = -.25;
	public static String gameData = "   ";
	public static char ourSwitch = ' ';
	public static char scale = ' ';
	public static char robotpos = ' ';
   /*************************************************
    * constants for drive train and lift/motors  
    *************************************************/
	
	// drive train motors 
	
	//ramp constant changes how fast it speeds up and down, smaller numbers make the ramp up slower. 
	public static final double rampConstant = .0095;
	// zero band changes the size of the zero area on the controller 
	public static final double zeroBand = 0.3;
	// tuning factor changes how fast the robot can go 
	public static final double tuningFactor = .7;
	
	// arms/grabber motors 
	public static final double grabberOutSpeed = .7;
	public static final double grabberInSpeed = -1;
	public static final double grabberNetural = 0;
	public static final double timedGabberOutDuration = 2.0;
	public static final double timedGabberInDuration = 2.0;
	
	// lift motors
	public static final double liftUpSpeed = .75;
	public static final double liftdownSpeed = -.15;
}

