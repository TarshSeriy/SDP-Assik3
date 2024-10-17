package CoR.Handlers;
import CoR.Task;
import CoR.Priority;

import CoR.Handlers.Handler;

public class MediumPriorityHandler extends Handler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == Priority.MEDIUM) {
            System.out.println("Handling medium priority task: " + task.getName());
        } else if (next != null) {
            next.handleTask(task);
        }
    }
}
