package remote_control_with_macro.command;

import remote_control_with_macro.receiver.Television;

public class TelevisionOnCommand implements Command {
    Television television;

    public TelevisionOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.on();
        television.setVolume(11);
    }

    @Override
    public void undo() {
        television.off();
    }
}
