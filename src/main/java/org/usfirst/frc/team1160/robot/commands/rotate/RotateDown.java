package org.usfirst.frc.team1160.robot.commands.rotate;

import org.usfirst.frc.team1160.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RotateDown extends Command{

	public RotateDown(){
		requires(Robot.angle);
	}
	
	@Override
	protected void initialize() {
		Robot.angle.angleDown();
		System.out.println("down");
		Robot.angle.startTime();
	}

	@Override
	protected void execute() {
		//Robot.angle.angleDown();
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return Robot.angle.getTimeElapsed(0.5);
	}
  
	@Override
	protected void end() {
		Robot.angle.stop();
		
	}

	@Override
	protected void interrupted() {
		Robot.angle.stop();
		
	}

}

