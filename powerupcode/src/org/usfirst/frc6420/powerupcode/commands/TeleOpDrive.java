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

import org.usfirst.frc6420.powerupcode.Constants;
import org.usfirst.frc6420.powerupcode.OI;
import org.usfirst.frc6420.powerupcode.Robot;

/**
 *
 */
public class TeleOpDrive extends Command {
	double actualSpeedX = 0;
	double actualSpeedY = 0;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public TeleOpDrive() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveBase);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	double leftMotorValue = 0;
    	double rightMotorValue = 0;
    	double targetSpeedY = Robot.oi.getJoystick1().getY();
    	double targetSpeedX = Robot.oi.getJoystick1().getX();
    	
    	
    	if (targetSpeedY < Constants.zeroBand && targetSpeedY > Constants.zeroBand * -1) {
    		targetSpeedY = 0;
    	}
    	if (targetSpeedX < Constants.zeroBand && targetSpeedX > Constants.zeroBand * -1) {
    		targetSpeedX = 0;
    	}
    	
    	if (targetSpeedY == 0) {
    		actualSpeedY = 0;
    	}
    	else if (actualSpeedY < targetSpeedY && Math.abs(actualSpeedY - targetSpeedY) > Constants.rampConstant) {
    		actualSpeedY += Constants.rampConstant;
    	} else if (actualSpeedY > targetSpeedY && Math.abs(actualSpeedY - targetSpeedY) > Constants.rampConstant) {
    		actualSpeedY -= Constants.rampConstant;
    	}
    	
    	if (targetSpeedX == 0) {
    		actualSpeedX = 0;
    	}
    	else if (actualSpeedX < targetSpeedX && Math.abs(actualSpeedX - targetSpeedX) > Constants.rampConstant) {
    		actualSpeedX += Constants.rampConstant;
    	} else if (actualSpeedX > targetSpeedX && Math.abs(actualSpeedX - targetSpeedX) > Constants.rampConstant) {
    		actualSpeedX -= Constants.rampConstant;
    	}
    	
    	leftMotorValue = Constants.tuningFactor * (actualSpeedY - actualSpeedX);
    	rightMotorValue = Constants.tuningFactor * (actualSpeedY + actualSpeedX);
    	
    	Robot.driveBase.setMotorSpeeds(leftMotorValue, rightMotorValue);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    	Robot.driveBase.setMotorSpeeds(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    	end();
    }
}
