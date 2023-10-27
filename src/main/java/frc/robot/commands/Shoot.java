package frc.robot.commands;

import frc.robot.subsystems.PneumaticsSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class Shoot extends CommandBase {
  
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final PneumaticsSubsystem subsystem;

  public Shoot(PneumaticsSubsystem subsystem) {
    this.subsystem = subsystem;
    addRequirements(subsystem);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    subsystem.shoot();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
