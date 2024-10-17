package Iterator;
import CoR.Task;

import Iterator.TaskIterator;

import java.util.List;

public class TaskListIterator implements TaskIterator {
    private List<Task> tasks;
    private int position;

    public TaskListIterator(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean hasNext() {
        return position < tasks.size();
    }

    @Override
    public Task next() {
        return tasks.get(position++);
    }
}
