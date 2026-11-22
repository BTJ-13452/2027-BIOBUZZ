package org.firstinspires.ftc.teamcode.util.pedro;

import com.pedropathing.follower.Follower;
import com.pedropathing.revhub.drivetrains.MecanumConfig;
import com.pedropathing.revhub.localizers.PinpointConfig;
import com.qualcomm.hardware.gobilda.GoBildaPinpointDriver;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
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


    public static PinpointConfig localizerConfig = new PinpointConfig(c -> {
        c.name.set(BTJConfiguration.PINPIONT);
        c.podType.set(GoBildaPinpointDriver.GoBildaOdometryPods.goBILDA_SWINGARM_POD);
        c.xPodOffset.set(-3.2409628920667752);
        c.yPodOffset.set(8.936233520507812);
        c.xPodDirection.set(GoBildaPinpointDriver.EncoderDirection.FORWARD);
        c.yPodDirection.set(GoBildaPinpointDriver.EncoderDirection.FORWARD);
        c.globalDistanceUnit.set(DistanceUnit.INCH);
        c.offsetUnits.set(DistanceUnit.INCH);
    });

    public static Follower create(HardwareMap h) {
        
        // return new Follower(Drivetrain, Localizer, Foresight);
        return null;
    }
}