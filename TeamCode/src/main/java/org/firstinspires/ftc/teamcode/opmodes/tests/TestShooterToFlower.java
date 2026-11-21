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
        if (gamepad1.yWasPressed())
            shooter.activate();
        if
        (gamepad1.xWasPressed())
            shooter.deactivate();
        if (gamepad1.aWasPressed())
            shooter.shooterToFlower.activate();
        if (gamepad1.bWasPressed())
            shooter.shooterToFlower.deactivate();


        telemetry.addData("Flower", shooter.shooterToFlower.toString());
        telemetry.update();
    }
}