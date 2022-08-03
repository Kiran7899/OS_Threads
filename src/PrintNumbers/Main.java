package PrintNumbers;

public class Main {
    public static void main(String[] args)
    {
        for(int i=1;i<=100;i++) {
            PrintOnetoHundred printOnetoHundred = new PrintOnetoHundred(i);
            Thread th = new Thread(printOnetoHundred);
            th.start();
        }
    }
}
