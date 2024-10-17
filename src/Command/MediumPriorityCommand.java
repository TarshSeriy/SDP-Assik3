package Command;

import Command.Command;

public class MediumPriorityCommand implements Command {
    private TaskReceiver taskReceiver;

    public MediumPriorityCommand(TaskReceiver taskReceiver) {
        this.taskReceiver = taskReceiver;
    }

    @Override
    public void execute() {
        taskReceiver.performMediumPriorityTask();
    }
}

