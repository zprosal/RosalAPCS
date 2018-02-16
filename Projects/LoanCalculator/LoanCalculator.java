import java.util.Scanner;

public class LoanCalculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;
    public static double interest = -1;
    public static double total = -1;

    public static void main(String[] args) {
        //Read in the loan calculation mode
        Scanner scan1;
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan1 = new Scanner(System.in);
            printModeStatement(); //Call a function to print our mode selection statement
            if(scan1.hasNextInt()) { //Check if input provided is a valid integer
                mode = scan1.nextInt();
                if(0 < mode && mode < 4) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
        
        System.out.println("You selected mode " + mode);
        Scanner scan2;
        while(true) { 
            scan2 = new Scanner(System.in);
            System.out.println("Enter Loan Amount: ");             
            if(scan2.hasNextDouble()) { 
                loanAmt = scan2.nextDouble();
                if(loanAmt > 0) { 
                    break; 
                }
            }
        }
        Scanner scan3;
        while(true) { 
            scan3 = new Scanner(System.in);
            System.out.println("Enter Loan Term (in years): "); 
            if(scan3.hasNextInt()) { 
                loanTerm = scan3.nextInt();
                if(loanTerm > 0) { 
                    break; 
                }
            }

        }
        Scanner scan4;   
        while(true) { 
            scan4 = new Scanner(System.in);
            System.out.println("Enter Interest Rate (%): "); 
            if(scan4.hasNextDouble()) { 
                interestRate = scan4.nextDouble() * 0.01;
                if(interestRate > 0) { 
                    break; 
                }
            }

        }
        System.out.println(
            "Original Loan Amount: $" + loanAmt + "\n"
            + "Loan Term: " + loanTerm + " years\n"
            + "Interest Rate: " + interestRate * 100 + "%"
        );
        if(mode == 1) {
            flatInterest();
        }
        else {
            System.out.println("Other modes not yet supported."); //Replace this with calls to your appropriate functions            
        }
    }

    public static void flatInterest() {       
        interest = loanAmt * interestRate * loanTerm;
        total = loanAmt + interest;
        System.out.println(
            "Interest over term: $" + interest +"\n"
            + "Total amount to be paid: $" + total
        );        
    }

    public static void printModeStatement() {
        System.out.print(
            "Select an interest calculation mode:\n" // "\n" is new line
            + "(1) Flat Interest\n"
            + "(2) Compounding Interest Without Monthly Payments\n"
            + "(3) Compounding Interest With Monthly Payments\n"
        );
    }
}