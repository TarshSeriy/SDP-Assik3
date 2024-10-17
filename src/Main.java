import CoR.CoR;
import Command.Command;
import Iterator.TaskIterator;
import Iterator.TaskList;
import Mediator.TaskMediator;
import CoR.Task;
import CoR.Priority;
import Mediator.Mediator;
import Command.TaskReceiver;
import Command.TaskInvoker;
import Command.HighPriorityCommand;
import Command.LowPriorityCommand;
import Command.MediumPriorityCommand;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Task 1", Priority.LOW);
        Task task2 = new Task("Task 2", Priority.MEDIUM);
        Task task3 = new Task("Task 3", Priority.HIGH);

        Mediator mediator = new TaskMediator();

        mediator.notify(task1);
        mediator.notify(task2);
        mediator.notify(task3);

        TaskReceiver receiver = new TaskReceiver();
        TaskInvoker invoker = new TaskInvoker();

        Command highCommand = new HighPriorityCommand(receiver);
        Command mediumCommand = new MediumPriorityCommand(receiver);
        Command lowCommand = new LowPriorityCommand(receiver);

        ((TaskMediator) mediator).executeTaskCommand(lowCommand, invoker);
        ((TaskMediator) mediator).executeTaskCommand(mediumCommand, invoker);
        ((TaskMediator) mediator).executeTaskCommand(highCommand, invoker);

        TaskList taskList = new TaskList();
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        TaskIterator iterator = taskList.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            System.out.println("Processing: " + task.getName());
        }
    }
}
