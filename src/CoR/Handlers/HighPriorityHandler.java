package CoR.Handlers;
import CoR.Task;
import CoR.Priority;

import CoR.Handlers.Handler;

public class HighPriorityHandler extends Handler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == Priority.HIGH) {
            System.out.println("Handling high priority task: " + task.getName());
        } else if (next != null) {
            next.handleTask(task);
        }
    }
}
