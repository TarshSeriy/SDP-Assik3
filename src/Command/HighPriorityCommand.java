package Command;

import Command.Command;

public class HighPriorityCommand implements Command {
    private TaskReceiver taskReceiver;

    public HighPriorityCommand(TaskReceiver taskReceiver) {
        this.taskReceiver = taskReceiver;
    }

    @Override
    public void execute() {
        taskReceiver.performHighPriorityTask();
    }
}
