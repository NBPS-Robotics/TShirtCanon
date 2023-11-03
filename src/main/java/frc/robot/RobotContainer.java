// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.PneumaticsSubsystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.CompressorOff;
import frc.robot.commands.CompressorOn;
import frc.robot.commands.HornOff;
import frc.robot.commands.HornOn;
//import frc.robot.commands.Drive;
import frc.robot.commands.PistonDown;
import frc.robot.commands.PistonUp;
import frc.robot.commands.Shoot;
import frc.robot.subsystems.BlinkinSubsystem;
import frc.robot.subsystems.DriveSubsystem;


public class RobotContainer {
 
  private final PneumaticsSubsystem pneumaticsSubsystem = new PneumaticsSubsystem();
  private final BlinkinSubsystem BlinkinSubsystem = new BlinkinSubsystem();
  public final DriveSubsystem driveSubsystem = new DriveSubsystem();
 
  public static CommandXboxController controller = new CommandXboxController(0);
  
  private final CompressorOff compressorOff = new CompressorOff(pneumaticsSubsystem);
  private final CompressorOn compressorOn = new CompressorOn(pneumaticsSubsystem);
  private final PistonDown pistonDown = new PistonDown(pneumaticsSubsystem);
  private final PistonUp pistonUp = new PistonUp(pneumaticsSubsystem);
  private final Shoot shoot = new Shoot(pneumaticsSubsystem);
  private final HornOn hornOn = new HornOn(pneumaticsSubsystem);
  private final HornOff hornOff = new HornOff(pneumaticsSubsystem);
  


  public RobotContainer() {
    configureBindings();
  }

 
  private void configureBindings() {

    controller.b().whileTrue(compressorOff); 
    controller.a().whileTrue(compressorOn);

    controller.povUp().whileTrue(pistonUp); 
    controller.povDown().whileTrue(pistonDown); 

    controller.rightTrigger().whileTrue(shoot); 

    controller.rightBumper().whileTrue(hornOn);
    controller.rightBumper().whileFalse(hornOff);
   
  }


  
                                          
}
