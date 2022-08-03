package Thread_Task;

public class PrintNumber implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello Thread!");
    }
}
