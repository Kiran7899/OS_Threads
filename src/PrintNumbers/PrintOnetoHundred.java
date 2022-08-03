package PrintNumbers;

public class PrintOnetoHundred implements Runnable{

    int Number;
   public PrintOnetoHundred(int val)
   {
       Number = val;
   }
    @Override
    public void run() {
        System.out.println(Number + " " + "[" +Thread.currentThread().getName() +"]");
    }
}
