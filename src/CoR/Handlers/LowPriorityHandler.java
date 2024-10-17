package CoR.Handlers;
import CoR.Task;
import CoR.Priority;

import CoR.Handlers.Handler;

public class LowPriorityHandler extends Handler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == Priority.LOW) {
            System.out.println("Handling low priority task: " + task.getName());
        } else if (next != null) {
            next.handleTask(task);
        }
    }
}
