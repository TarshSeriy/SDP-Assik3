package Iterator;
import CoR.Task;

import Iterator.TaskIterator;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public TaskIterator iterator() {
        return new TaskListIterator(tasks);
    }
}
