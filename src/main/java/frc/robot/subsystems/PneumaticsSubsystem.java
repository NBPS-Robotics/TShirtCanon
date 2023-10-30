package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class PneumaticsSubsystem extends SubsystemBase{
  
  Compressor compressor1 = new Compressor(1, PneumaticsModuleType.CTREPCM); //right
  Compressor compressor2 = new Compressor(0, PneumaticsModuleType.CTREPCM); //left
  Solenoid shoot = new Solenoid(PneumaticsModuleType.CTREPCM, 0);
  DoubleSolenoid piston = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 4, 5);


  public PneumaticsSubsystem(){}
  
  public void shoot(){
    wait(3000); //3 second delay
    shoot.set(true);
    wait(2000); //2 second shoot
    shoot.set(false); 
  }
 
  public void pistonUp(){
    piston.set(Value.kForward);

  }

  public void pistonDown(){
    piston.set(Value.kReverse);
  }

  public void compressorOn(){
    compressor1.enableDigital();
    compressor2.enableDigital();
  }
 
  public void compressorOff(){
    compressor1.disable();
    compressor2.disable();
  }
 
  @Override
  public void periodic(){}

  public static void wait(int ms)
  {
      try
      {
          Thread.sleep(ms); 
      }
      catch(InterruptedException ex)
      {
          Thread.currentThread().interrupt(); 
      }
  }

}