package org.usfirst.frc.team1160.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team1160.robot.commands.ExampleCommand;
import org.usfirst.frc.team1160.robot.commands.rotate.RotateDown;
import org.usfirst.frc.team1160.robot.commands.rotate.RotateUp;
import org.usfirst.frc.team1160.robot.commands.shoot.ShootGroup;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	private static OI instance;
	private Joystick stick;
	private JoystickButton angleUp, angleDown, fire;
	
	public static OI getInstance(){
		if(instance == null){
			instance = new OI();
			}
		return instance;
		}
	
	private OI(){
		stick = new Joystick(0);
		System.out.println("joystick works");
		//buttons();
	}
	
	
	public void buttons(){
		fire = new JoystickButton(stick,1);
		angleUp = new JoystickButton(stick, 3);
		angleDown = new JoystickButton(stick,4);
		tieButtons();
		
	}
	
	public void tieButtons(){
		fire.whenPressed(new ShootGroup());
		angleUp.whileHeld(new RotateUp());
		angleDown.whileHeld(new RotateDown());
	}
	
	public Joystick getStick(){
		return stick;
	}
	
	
}

