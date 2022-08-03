package Thread_Task;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("main");
        PrintNumber printNumber = new PrintNumber();
        Thread thread = new Thread(printNumber);
        //printNumber.run();
        thread.start();
    }
}
