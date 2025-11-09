package remote_control_with_undo.command;

public interface Command {
    public void execute();
    public void undo();
}
