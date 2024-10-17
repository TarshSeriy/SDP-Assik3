package Mediator;

import CoR.Handlers.Handler;
import CoR.Handlers.HighPriorityHandler;
import CoR.Handlers.LowPriorityHandler;
import CoR.Handlers.MediumPriorityHandler;
import Command.Command;
import Mediator.Mediator;
import CoR.Task;
import Command.TaskInvoker;


public class TaskMediator implements Mediator {
    private Handler lowPriorityHandler;
    private Handler mediumPriorityHandler;
    private Handler highPriorityHandler;

    public TaskMediator() {
        lowPriorityHandler = new LowPriorityHandler();
        mediumPriorityHandler = new MediumPriorityHandler();
        highPriorityHandler = new HighPriorityHandler();

        lowPriorityHandler.setNext(mediumPriorityHandler);
        mediumPriorityHandler.setNext(highPriorityHandler);
    }

    // Этот метод реализует интерфейс Mediator.Mediator
    @Override
    public void notify(Task task) {
        // Обрабатываем задачи через цепочку обязанностей
        lowPriorityHandler.handleTask(task);
    }

    public void executeTaskCommand(Command command, TaskInvoker invoker) {
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}