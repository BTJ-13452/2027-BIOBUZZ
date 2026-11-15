package org.firstinspires.ftc.teamcode.opmodes.tests;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.robot.Shooter;


@TeleOp

public class TestShooterToFlower extends OpMode {

    Shooter shooter;

    @Override
    public void init() {
        shooter = new Shooter(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1.right_trigger > 0.1)
            shooter.activate();
        else
            shooter.deactivate();

        if (gamepad1.aWasPressed())
            shooter.shooterToFlower.activate();
        if (gamepad1.bWasPressed())
            shooter.shooterToFlower.deactivate();


        telemetry.addData("Flower", shooter.shooterToFlower.toString());
        telemetry.update();
    }
}