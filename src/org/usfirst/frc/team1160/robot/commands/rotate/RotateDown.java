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
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
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

