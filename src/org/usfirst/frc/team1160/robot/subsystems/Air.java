package org.usfirst.frc.team1160.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Air extends Subsystem{
	
	Compressor comp;
	DoubleSolenoid valve;
	Timer time;
	
	 static Air instance;
	
	public static Air getInstance(){
		if(instance == null){
			instance = new Air();
		}
		return instance;
	}
	
	private Air(){
		valve = new DoubleSolenoid(0,7);
		time = new Timer();
		comp = new Compressor();
		comp.start();

	}
	
	public void open(){
		valve.set(DoubleSolenoid.Value.kForward);
	}
	
	public void close(){
		valve.set(DoubleSolenoid.Value.kReverse);
	}

	public boolean done(double finTime){
		if(time.get() >= finTime){
			time.start();
			return true;
		}
		return false;
	}
	
	public void startTime(){
		time.reset();
		time.start();
	}
	
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
