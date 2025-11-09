package remote_control_with_undo_detail;

import remote_control_with_undo_detail.command.CeilingFanHighCommand;
import remote_control_with_undo_detail.command.CeilingFanMediumCommand;
import remote_control_with_undo_detail.command.CeilingFanOffCommand;
import remote_control_with_undo_detail.invoker.RemoteControlWithUndo;
import remote_control_with_undo_detail.receiver.CeilingFan;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
        System.out.println();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
        System.out.println();
    }
}
