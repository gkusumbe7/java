import java.util.Scanner;

public class Fahrenheit{
    public  static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
          double fahr = scn.nextDouble();
          double celsius = (fahr - 32 ) * 5 / 2 ;
          System.out.print(celsius);
    }

}
