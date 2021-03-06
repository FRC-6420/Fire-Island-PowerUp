// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6420.powerupcode.subsystems;

import org.usfirst.frc6420.powerupcode.RobotMap;
import org.usfirst.frc6420.powerupcode.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveBase extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController backRight = RobotMap.driveBaseBackRight;
    private final SpeedController frontRight = RobotMap.driveBaseFrontRight;
    private final SpeedControllerGroup rightDrive = RobotMap.driveBaseRightDrive;
    private final SpeedController backLeft = RobotMap.driveBaseBackLeft;
    private final SpeedController frontLeft = RobotMap.driveBaseFrontLeft;
    private final SpeedControllerGroup leftDrive = RobotMap.driveBaseLeftDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new TeleOpDrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }
    
    public void setMotorSpeeds(double leftSpeed, double rightSpeed) {
    	leftDrive.set(leftSpeed);
    	rightDrive.set(rightSpeed);
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

