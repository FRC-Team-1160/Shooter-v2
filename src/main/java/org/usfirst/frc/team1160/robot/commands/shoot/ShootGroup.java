package org.usfirst.frc.team1160.robot.commands.shoot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ShootGroup extends CommandGroup{
	public ShootGroup(){
		addSequential(new Shoot());
		addSequential(new Wait(0.05));
		addSequential(new Close());
	}
}
