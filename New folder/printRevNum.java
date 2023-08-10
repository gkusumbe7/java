import java.util.Scanner;

public class printRevNum {
    public  static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.print(num%10);
        num = num / 10 ;
        System.out.print(num%10);
        num = num / 10 ;
        System.out.print(num);
    } 
}
