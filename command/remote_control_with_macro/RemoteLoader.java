package remote_control_with_macro;

import remote_control_with_macro.command.*;
import remote_control_with_macro.invoker.RemoteControl;
import remote_control_with_macro.receiver.Hottub;
import remote_control_with_macro.receiver.Light;
import remote_control_with_macro.receiver.Stereo;
import remote_control_with_macro.receiver.Television;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Television television = new Television("Living Room");
        Hottub hottub = new Hottub("Living Room");

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        TelevisionOnCommand televisionOn = new TelevisionOnCommand(television);
        TelevisionOffCommand televisionOff = new TelevisionOffCommand(television);

        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, televisionOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, televisionOff, hottubOff};

        MacroCommand partyOnCommand = new MacroCommand(partyOn);
        MacroCommand partyOffCommand = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnCommand, partyOffCommand);

        System.out.println(remoteControl);
        System.out.println("--- 매크로 ON ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- 매크로 OFF ---");
        remoteControl.offButtonWasPushed(0);
    }
}
