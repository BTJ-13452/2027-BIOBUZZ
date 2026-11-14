package org.firstinspires.ftc.teamcode.opmodes.tests;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.robot.Intake;

@TeleOp
public class TestIntakeFromFlower extends OpMode {
    Intake intake;

    @Override
    public void init() {
        intake = new Intake(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1.right_trigger > 0.1)
            intake.activate();
        else if (gamepad1.left_trigger > 0.1)
            intake.eject();
        else
            intake.deactivate();

        if (gamepad1.aWasPressed()
        ) intake.intakeFromFlower.activate();
        if (gamepad1.bWasPressed()
        ) intake.intakeFromFlower.deactivate();
        if (gamepad1.xWasPressed()
        ) intake.intakeFromFlower.moveToInitPosition();

        telemetry.addData("Flower", intake.intakeFromFlower.toString());
        telemetry.update();
    }
}
