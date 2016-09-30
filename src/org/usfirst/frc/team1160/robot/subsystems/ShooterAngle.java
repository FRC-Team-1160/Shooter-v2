package org.usfirst.frc.team1160.robot.subsystems;

import org.usfirst.frc.team1160.robot.RobotMap;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;


public class ShooterAngle extends Subsystem implements RobotMap{
	private static ShooterAngle instance;
	private Talon wM;
	private Timer time;
	
	private ShooterAngle(){
		wM = new Talon(WINDOW_MOTOR);
		time = new Timer();
	}
	
	public static ShooterAngle getInstance(){
		if(instance==null)
			instance = new ShooterAngle();
		return instance;
	}
	public void angleUp(){
		wM.set(0.5);
	}
	
	public void angleDown(){
		wM.set(-0.5);
	}
	
	public void stop(){
		wM.set(0);
	}
	
	public void startTime(){
		time.reset();
		time.start();
	}
	
	public boolean getTimeElapsed(double endTime){
		return time.get()>=endTime;
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}

}
