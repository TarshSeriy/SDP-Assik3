package Command;

import Command.Command;

public class LowPriorityCommand implements Command {
    private TaskReceiver taskReceiver;

    public LowPriorityCommand(TaskReceiver taskReceiver) {
        this.taskReceiver = taskReceiver;
    }

    @Override
    public void execute() {
        taskReceiver.performLowPriorityTask();
    }
}
