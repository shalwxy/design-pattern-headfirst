package remote_control_with_undo_detail.command;

public interface Command {
    public void execute();
    public void undo();
}
