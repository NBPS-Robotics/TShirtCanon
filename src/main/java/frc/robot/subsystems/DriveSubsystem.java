package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class DriveSubsystem extends SubsystemBase{

  public static WPI_TalonSRX leftMotor;
  public static WPI_TalonSRX rightMotor;

 DifferentialDrive robot;
 
  public DriveSubsystem(){
  rightMotor = new WPI_TalonSRX(3);       
  leftMotor = new WPI_TalonSRX(4);

  rightMotor.setInverted(false);
  leftMotor.setInverted(true);

  robot = new DifferentialDrive(leftMotor, rightMotor);
  }
  
  public void arcadeDrive(double x, double y){
   robot.arcadeDrive(x, y);
  }





}