package remote_control_with_macro.command;

import remote_control_with_macro.receiver.Stereo;
import remote_control_with_macro.receiver.Television;

public class TelevisionOffCommand implements Command {
    Television television;

    public TelevisionOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.off();
    }

    @Override
    public void undo() {
        television.on();
        television.setVolume(11);
    }
}
