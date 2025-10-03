package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Shooter {

    public DcMotor shooterMotor;




    public Shooter (HardwareMap hardwareMap){
        shooterMotor = hardwareMap.get(DcMotor.class, "shooterMotor");
    }
}