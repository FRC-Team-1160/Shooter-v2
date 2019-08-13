package org.usfirst.frc.team1160.robot.subsystems;

import org.usfirst.frc.team1160.robot.OI;
import org.usfirst.frc.team1160.robot.RobotMap;
import org.usfirst.frc.team1160.robot.commands.drive.Drive;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem implements RobotMap{

	private static DriveTrain instance;
	private Talon bL, fL, bR, fR;
	
	private DriveTrain(){
		bL = new Talon(BACK_LEFT_DRIVE);
		bR = new Talon(BACK_RIGHT_DRIVE);
		fL = new Talon(FRONT_LEFT_DRIVE);
		fR = new Talon(FRONT_RIGHT_DRIVE);
		
	}
	
	public static DriveTrain getInstance(){
		if(instance==null)
			instance = new DriveTrain();
		return instance;
	}
	
	public void ManualDrive(){
		//TODO Test if these orientations are correct
		fL.set(.6*(OI.getInstance().getStick().getZ() - OI.getInstance().getStick().getY()));
		bL.set(.6*(OI.getInstance().getStick().getZ() - OI.getInstance().getStick().getY()));
		fR.set(.6*(OI.getInstance().getStick().getZ() + OI.getInstance().getStick().getY()));
		bR.set(.6*(OI.getInstance().getStick().getZ() + OI.getInstance().getStick().getY()));
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new Drive());
	}

}
