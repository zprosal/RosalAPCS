import java.util.Scanner;

class Loops2 {
    public static void main(String[] args) {
// 1.
    // print multiples of 2 starting with 0
        // for(int i = 0; i <= 100; i += 2) {
        //     System.out.println(i);
        // }            
    // prints multiples of 3 starting with 0 and tells if it is even or odd
        // for(int i = 0; i <= 100; i += 3) {
        //     if(i % 2 == 0) {
        //         System.out.println(i + " is an even number");
        //     }
        //     else {
        //         System.out.println(i + " is an odd number");            
        //     }            
        // }  
    // prints 0 endlessly
        // for(int i = 0; i < 1000; i += i) {
        //     System.out.println(i);
        // }
    // counts down from 100 to 0 (incorrect, prints nothing)                  
        // for(int i = 100; i < 0; i--) {
        //     System.out.println(i);
        // }        
// 2.
    // prints integers endlessly, i never gets less than -100
        // for(int i = 0; i < -100; i++) { //fix: > swithced to <, should print nothing
        //     System.out.println(i);
        // }        
    // prints 0 endlessly, i never increases
        // for(int i = 0; i < 20; i += 2) { //fix: *0 switched to +, should mutiples of 2
        //     System.out.println(i);
        // }      
// 3. 
        // for(int i = 0; i <= 99; i += 3) {
        //     System.out.println(i);  
        // }
        // for(int i = 1; i <= 1024; i *= 2) {
        //     System.out.println(i);
        // }       
// 4.
        String RED = "\u001B[31m";
        String GRN = "\u001B[32m";
        for(int i = 0; i < 3; i ++) {
            System.out.println("Enter an integer: ");
            Scanner scan = new Scanner(System.in);
                if(scan.hasNextInt()) {
                    System.out.println(GRN + "Success");
                    break;
                }
                else if(i == 2) {
                    System.out.println(RED + "You failed");
                    break;
                }
        }
    }
}