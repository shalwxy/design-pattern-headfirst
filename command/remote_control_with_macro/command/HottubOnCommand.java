package remote_control_with_macro.command;

import remote_control_with_macro.receiver.Hottub;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
        hottub.setTemperature(37);
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
