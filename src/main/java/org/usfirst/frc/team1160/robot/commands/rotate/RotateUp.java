package org.usfirst.frc.team1160.robot.commands.rotate;

import org.usfirst.frc.team1160.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RotateUp extends Command{

	public RotateUp(){
		requires(Robot.angle);
	}
	
	@Override
	protected void initialize() {
		Robot.angle.angleUp();
		Robot.angle.startTime();
		System.out.println("Up");
	}

	@Override
	protected void execute() {
		//Robot.angle.angleUp();
		/*Robot.angle.angleUp();
		Robot.angle.startTime();
		System.out.println("Up");*/
		
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
