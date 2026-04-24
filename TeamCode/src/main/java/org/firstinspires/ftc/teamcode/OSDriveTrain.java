package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class OSDriveTrain {
    private final DcMotor frMotor, flMotor, brMotor, blMotor;
    private double x, y, turn;

    public OSDriveTrain(HardwareMap hwMap) {
        frMotor = hwMap.get(DcMotor.class, "frMotor");
        flMotor = hwMap.get(DcMotor.class, "flMotor");
        brMotor = hwMap.get(DcMotor.class, "brMotor");
        blMotor = hwMap.get(DcMotor.class, "blMotor");
    }

    public void init() {
        frMotor.setDirection(DcMotor.Direction.FORWARD);
        flMotor.setDirection(DcMotor.Direction.FORWARD);
        brMotor.setDirection(DcMotor.Direction.FORWARD);
        blMotor.setDirection(DcMotor.Direction.FORWARD);
    }

    public void setDrivePower(double x, double y, double turn) {
        this.x = x;
        this.y = y;
        this.turn = turn;
    }

    public void update() {
        // Calculate
        double flPower = y + x + turn;
        double frPower = y - x - turn;
        double brPower = y + x - turn;
        double blPower = y - x + turn;

        // Normalize
        double maxPower = 0.6;
        maxPower = Math.max(maxPower, Math.abs(flPower));
        maxPower = Math.max(maxPower, Math.abs(frPower));
        maxPower = Math.max(maxPower, Math.abs(blPower));
        maxPower = Math.max(maxPower, Math.abs(brPower));

        flMotor.setPower(flPower / maxPower);
        frMotor.setPower(frPower / maxPower);
        blMotor.setPower(blPower / maxPower);
        brMotor.setPower(brPower / maxPower);
    }

}
