// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6420.powerupcode.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc6420.powerupcode.Robot;
import org.usfirst.frc6420.powerupcode.RobotMap;
import org.usfirst.frc6420.powerupcode.subsystems.DriveBase;

import com.ctre.phoenix.sensors.PigeonIMU;

import org.usfirst.frc6420.powerupcode.subsystems.DigitalInputs;



/**
 *
 */
public class AutoTurn extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
	private PigeonIMU pigeonIMU1 = RobotMap.digitalInputsPigeonIMU1;
	private int target;
	private double absolute_target;
	private DriveBase drivebase = Robot.driveBase;
	
	
    public AutoTurn(int target) {
    	this.target = target;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	this.absolute_target = pigeonGetAngle() + target;
    	    	
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	if( this.absolute_target - pigeonGetAngle() < 0){
    		drivebase.setMotorSpeeds(0, -0.3);
    	}else{
    		drivebase.setMotorSpeeds(0, 0.3);
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return Math.abs(pigeonGetAngle() - this.absolute_target) < 5;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    	drivebase.setMotorSpeeds(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
    
    protected double pigeonGetAngle() {
    	
       	double [] ypr = new double[3]; 

        //	pigeon1.getYawPitchRoll(ypr);
        	pigeonIMU1.getYawPitchRoll(ypr);
        	    	
        	return ypr[0];
    	
    }
}