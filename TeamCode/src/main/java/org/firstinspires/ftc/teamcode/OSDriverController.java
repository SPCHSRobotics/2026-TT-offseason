package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gamepad;

public class OSDriverController {
    OSBot bot;
    Gamepad g1, g2;

    public OSDriverController(OSBot bot, Gamepad g1, Gamepad g2) {
        this.bot = bot;
        this.g1 = g1;
        this.g2 = g2;
    }

    public void update() {
        // Drive
        double x = g1.left_stick_x;
        double y = -g1.left_stick_y;
        double turn = g1.right_stick_x;

        bot.driveTrain.setDrivePower(x, y, turn);
    }

}
