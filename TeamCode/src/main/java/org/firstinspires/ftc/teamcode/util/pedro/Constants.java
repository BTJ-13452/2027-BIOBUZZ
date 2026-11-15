package org.firstinspires.ftc.teamcode.util.pedro;

import com.pedropathing.follower.Follower;
import com.pedropathing.revhub.drivetrains.MecanumConfig;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.util.BTJConfiguration;
import org.firstinspires.ftc.teamcode.util.BTJDirections;

public class Constants {
    public static MecanumConfig driveConfig = new MecanumConfig(
            c -> {
                c.frontLeftName.set(BTJConfiguration.FRONT_LEFT_WHEEL_NAME);
                c.backLeftName.set(BTJConfiguration.BACK_LEFT_WHEEL_NAME);
                c.frontRightName.set(BTJConfiguration.FRONT_RIGHT_WHEEL_NAME);
                c.backRightName.set(BTJConfiguration.BACK_RIGHT_WHEEL_NAME);
                c.frontLeftDirection.set(BTJDirections.FRONT_LEFT_WHEEL_DIRECTION);
                c.backLeftDirection.set(BTJDirections.BACK_LEFT_WHEEL_DIRECTION);
                c.frontRightDirection.set(BTJDirections.FRONT_RIGHT_WHEEL_DIRECTION);
                c.backRightDirection.set(BTJDirections.BACK_RIGHT_WHEEL_DIRECTION);
                c.manualBrakeMode.set(true);
            }
    );

    public static Follower create(HardwareMap h) {
        
        // return new Follower(Drivetrain, Localizer, Foresight);
        return null;
    }
}