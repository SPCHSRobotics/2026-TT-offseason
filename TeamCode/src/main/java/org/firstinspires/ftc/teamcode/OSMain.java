package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="OffSeason TeleOp")
public class OSMain extends OpMode {
    OSBot bot = new OSBot(hardwareMap);
    OSDriverController controller = new OSDriverController(bot, gamepad1, gamepad2);

    public void init() {
        bot.init();
    }

    public void loop() {
        controller.update();
        bot.update();
    }
}
