// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.PneumaticsSubsystem;
import frc.robot.commands.CompressorOff;
import frc.robot.commands.CompressorOn;
import frc.robot.commands.PistonDown;
import frc.robot.commands.PistonUp;
import frc.robot.commands.Shoot;
import frc.robot.subsystems.BlinkinSubsystem;


public class RobotContainer {
 
  private final PneumaticsSubsystem pneumaticsSubsystem = new PneumaticsSubsystem();
  private final BlinkinSubsystem BlinkinSubsystem = new BlinkinSubsystem();
  private final Joystick controller = new Joystick(0); 

  
  private final CompressorOff compressorOff = new CompressorOff(pneumaticsSubsystem);
  private final CompressorOn compressorOn = new CompressorOn(pneumaticsSubsystem);
  private final PistonDown pistonDown = new PistonDown(pneumaticsSubsystem);
  private final PistonUp pistonUp = new PistonUp(pneumaticsSubsystem);
  private final Shoot shoot = new Shoot(pneumaticsSubsystem);


  public RobotContainer() {
    configureBindings();
  }

 
  private void configureBindings() {

    controller.b().whileTrue(compressorOff); //x
    controller.a().whileTrue(compressorOn);

    controller.dpadUp().whileTrue(pistonUp); 
    controller.dpadDown().whileTrue(pistonDown); 

    controller.x().whileTrue(shoot); //b
   
  }


  

}
