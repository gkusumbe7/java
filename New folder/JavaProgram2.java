import java.util.Scanner;

public class JavaProgram2 {
    
    
//         You will be given two integers x and y. You have to print the sum of x and y in the first line, and the difference of x and y in the second line.

// First integer input should be stored in x, Second integer input should be stored in y.

// Input Format

// In the first line the value of x will be given and in the second line the value of y will be given.

// Constraints

// Only integers will be given as input.

public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();  
        System.out.println(x+y);
        System.out.println(x-y);
        
    }
}
