import java.util.Scanner;

public class ifElese {
    public static void main(String[] args) {
//         A shop will give a discount of 10% on the total cost if the cost of the quantity purchased is more than 1000. a. Ask user for the number of units b. Suppose, one unit will cost 100. c. Judge and print total cost for the user in the integer format.

// Input Format

// For each test case, You will be given the number of units in the integer format.

// Constraints

// 0<=number of units<=2^20-1

// Output Format

// You have to print the final cost of the quantities.

// Sample Input 0

// 15
// Sample Output 0

// 1350
        
       Scanner scn = new Scanner(System.in);
        
        int units = scn.nextInt();
         int cost = units * 100 ;
        if( cost > 1000 ){
            int discount = cost * 10 / 100 ;
             cost = cost - discount ;
            System.out.println(cost);
        }else{
            System.out.println(cost);
        }

    }
}