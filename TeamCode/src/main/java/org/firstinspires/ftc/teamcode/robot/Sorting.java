package org.firstinspires.ftc.teamcode.robot;

import static android.os.SystemClock.sleep;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.util.BTJConfiguration;
import org.firstinspires.ftc.teamcode.util.BTJDirections;
import org.firstinspires.ftc.teamcode.util.BTJSystem;
import org.firstinspires.ftc.teamcode.util.BasicSystem;

public class Sorting implements BTJSystem {
    final double SORTING_ARM_RIGHT_LOADING_POSITION = 1;
    final double SORTING_ARM_LEFT_LOADING_POSITION = 1;
    final double SORTING_ARM_RIGHT_DEFAULT_POSITION = 0;
    final double SORTING_ARM_LEFT_DEFAULT_POSITION = 0;

    public Arm rightArm;
    public Arm leftArm;

    public Sorting(HardwareMap hardwareMap) {
        rightArm = new Arm(hardwareMap,
                BTJConfiguration.SORTING_SERVO_RIGHT_ARM_NAME,
                BTJDirections.SORTING_SERVO_RIGHT_ARM_DIRECTION,
                SORTING_ARM_RIGHT_LOADING_POSITION,
                SORTING_ARM_RIGHT_DEFAULT_POSITION);

        leftArm = new Arm(hardwareMap,
                BTJConfiguration.SORTING_SERVO_LEFT_ARM_NAME,
                BTJDirections.SORTING_SERVO_LEFT_ARM_DIRECTION,
                SORTING_ARM_LEFT_LOADING_POSITION,
                SORTING_ARM_LEFT_DEFAULT_POSITION);
    }

    @Override
    public String toString() {
        return "Right arm: " + "\n" +
                rightArm.toString() + "\n" +
                "Left arm: " + "\n" +
                leftArm.toString();
    }


    public class Arm implements BasicSystem {
        final int WAIT_FOR_ELEMENT_TO_SHOOT = 1000;

        Servo servoArm;
        double loadingPosition;
        double defaultPosition;

       public Thread scoringElementLift = new Thread(new Runnable() {
            @Override
            public void run() {
                activate();
                sleep(WAIT_FOR_ELEMENT_TO_SHOOT);
                deactivate();
            }
        });


        public Arm(HardwareMap hardwareMap, String servoName, Servo.Direction servoDirection, double loadingPosition, double defaultPosition) {
            servoArm = hardwareMap.servo.get(servoName);
            servoArm.setDirection(servoDirection);

            this.loadingPosition = loadingPosition;
            this.defaultPosition = defaultPosition;
        }

        @Override
        public void activate() {

            servoArm.setPosition(loadingPosition);
        }

        @Override
        public void deactivate() {

            servoArm.setPosition(defaultPosition);
        }

        @Override
        public boolean isActive() {

            return servoArm.getPosition() == loadingPosition;
        }

        @Override
        public String toString() {

            return "Is active: " + isActive();
        }
    }

}
