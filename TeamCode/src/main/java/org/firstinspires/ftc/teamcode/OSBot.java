package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class OSBot {
    // Subsystems
    OSDriveTrain driveTrain;

    public OSBot(HardwareMap hwMap) {
        driveTrain = new OSDriveTrain(hwMap);
    }

    public void init() {
        driveTrain.init();
    }

    public void update() {
        driveTrain.update();
    }
}
