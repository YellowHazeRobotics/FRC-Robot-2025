// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;
import com.revrobotics.*;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
    public static final double DEADBAND = 0.05;
  }
  public static class SparkMaxIDs {
    public static final int kFrontLeftDriveID = 5;
    public static final int kFrontLeftAngleID = 4;
    public static final int kFrontRightDriveID = 7;
    public static final int kFrontRightAngleID = 6;
    public static final int kBackLeftDriveID = 3;
    public static final int kBackLeftAngleID = 2;
    public static final int kBackRightDriveID = 9;
    public static final int kBackRightAngleID = 8;
  }
  public static final double maxSpeed = Units.feetToMeters(4.5);
}
