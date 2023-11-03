// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.subsystems.BlinkinSubsystem;
import frc.robot.subsystems.DriveSubsystem;

public class Robot extends TimedRobot {
  private Command m_autonomousCommand;

  private RobotContainer robotContainer;



  
  @Override
  public void robotInit() {
    
    robotContainer = new RobotContainer();    
    BlinkinSubsystem.green();
   
  }


  @Override
  public void robotPeriodic() {
    BlinkinSubsystem.green();
    CommandScheduler.getInstance().run();
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}



  @Override
  public void teleopInit() {
    BlinkinSubsystem.green();
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }  


  @Override
  public void teleopPeriodic() {
   robotContainer.driveSubsystem.arcadeDrive(RobotContainer.controller.getRawAxis(1), RobotContainer.controller.getRawAxis(4));
  }

}
