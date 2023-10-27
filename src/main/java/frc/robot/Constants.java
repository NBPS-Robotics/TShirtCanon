// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static final class JoystickConstants {
    public static final int kXStick1 = 0;
    public static final int kYStick1 = 1;
    public static final int kLeftTrigger = 2;
    public static final int kRightTrigger = 3;
    public static final int kXStick2 = 4;
    public static final int kYStick2 = 5;

    public static final int kJoystick1Port = 0;
    public static final int kJoystick2Port = 1;
  }

  public static final class BlinkinConstants{
    public static final int kBlinkinPort = 0;

    public static final double kRed = 0.61;
    public static final double kOrange = 0.65;
    public static final double kYellow = 0.69;
    public static final double kGreen = 0.77;
    public static final double kBlue = 0.87;
    public static final double kViolet = 0.91;
    public static final double kWhite = 0.93;
    public static final double kBlack = 0.99;
}


}
