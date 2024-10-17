package CoR.Handlers;
import CoR.Task;
import CoR.Priority;

public abstract class Handler {
    protected Handler next;
    public void setNext(Handler next){
        this.next = next;
    }
    public abstract void handleTask(Task task);
}
