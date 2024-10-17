package CoR;
import CoR.Handlers.Handler;
import CoR.Handlers.LowPriorityHandler;
import CoR.Handlers.HighPriorityHandler;
import CoR.Handlers.MediumPriorityHandler;

public class CoR {
    private Handler firstHandler;

    public CoR() {
        Handler lowPriorityHandler = new LowPriorityHandler();
        Handler mediumPriorityHandler = new MediumPriorityHandler();
        Handler highPriorityHandler = new HighPriorityHandler();

        lowPriorityHandler.setNext(mediumPriorityHandler);
        mediumPriorityHandler.setNext(highPriorityHandler);

        firstHandler = lowPriorityHandler;
    }

    public void processTask(Task task) {
        if (firstHandler != null) {
            firstHandler.handleTask(task);
        }
    }
}
