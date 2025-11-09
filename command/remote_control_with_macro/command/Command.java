package remote_control_with_macro.command;

public interface Command {
    public void execute();
    public void undo();
}
