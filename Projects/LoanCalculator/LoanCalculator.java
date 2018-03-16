import java.util.Scanner;

public class LoanCalculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;
    public static double interest = -1;
    public static double total = -1;

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLACK_BRIGHT = "\033[0;90m";
    public static final String RED_BRIGHT = "\033[0;91m";
    public static final String GREEN_BRIGHT = "\033[0;92m";  
    public static final String YELLOW_BRIGHT = "\033[0;93m"; 
    public static final String BLUE_BRIGHT = "\033[0;94m";   
    public static final String PURPLE_BRIGHT = "\033[0;95m"; 
    public static final String CYAN_BRIGHT = "\033[0;96m";   
    public static final String WHITE_BRIGHT = "\033[0;97m";

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
        
        if(mode == 1) {
            System.out.println("You selected mode " + PURPLE + mode + RESET +"\n");
        }
        else if(mode == 2) {
            System.out.println("You selected mode " + CYAN + mode + RESET +"\n");
        } else {
            System.out.println("You selected mode " + BLUE_BRIGHT + mode + RESET +"\n");
        }
        Scanner scan2;
        while(true) { 
            scan2 = new Scanner(System.in);
            System.out.print(GREEN + "Enter Loan Amount: " + RESET);       
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
            System.out.print(YELLOW_BRIGHT + "Enter Loan Term (in years): " + RESET); 
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
            System.out.print(RED_BRIGHT + "Enter Interest Rate (%): " + RESET); 
            if(scan4.hasNextDouble()) { 
                interestRate = scan4.nextDouble() * 0.01;
                if(interestRate > 0) { 
                    break; 
                }
            }

        }
        System.out.println(
            GREEN + "\nOriginal Loan Amount: " + RESET + "$" + loanAmt + "\n"
            + YELLOW_BRIGHT + "Loan Term: " + RESET + loanTerm + " years\n"
            + RED_BRIGHT + "Interest Rate: " + RESET + interestRate * 100 + "%"
        );
        if(mode == 1) {
            flatInterest();
        }
        else {
            if(mode == 2) {
                compoundingInterestNoPay();
            }
            else {
                compoundingInterestWithPay();
            }
        }
    }

    public static void flatInterest() {       
        interest = loanAmt * interestRate * loanTerm;
        total = loanAmt + interest;
        System.out.println(
            PURPLE + "Interest over term: " + RESET + "$" + interest +"\n"
            + PURPLE + "Total amount to be paid: " + RESET + "$"  + total
        );        
    }

    public static void compoundingInterestNoPay() {       
        total = loanAmt;
        int loanTermMonths = loanTerm * 12;
        while(loanTermMonths > 0) {
            interest = total * interestRate / 12;
            total = total + interest;
            loanTermMonths = loanTermMonths - 1;
            if(loanTermMonths == 0) {
                break;
            }
        }
        interest = total - loanAmt;        
        System.out.println(
            CYAN + "Interest over term: " + RESET + "$" + interest +"\n"
            + CYAN + "Total amount to be paid: " + RESET + "$"  + total
        );        
    }

    public static void compoundingInterestWithPay() {       
        double balance = loanAmt;
        double ratePerMonth = interestRate / 12;
        double monthlyPayment = 1 + loanAmt * (ratePerMonth / (1 - Math.pow((1 + ratePerMonth), (loanTerm * - 12))));
        while(balance > 0) {
            double monthInterest = balance * interestRate / 12;
            interest = interest + monthInterest;
            balance = balance + monthInterest - monthlyPayment;
            if(balance == 0) {                
                break;
            }
        }
        double finalPay = monthlyPayment + balance;
        total = loanAmt + interest;        
        System.out.println(
            BLUE_BRIGHT + "Minimum Monthly Payment: " + RESET + "$" + monthlyPayment +"\n"
            + BLUE_BRIGHT + "Final Month Payment: " + RESET + "$" + finalPay +"\n"
            // + "End Balance: $" + balance +"\n"
            + BLUE_BRIGHT + "Interest over term: " + RESET + "$" + interest +"\n"
            + BLUE_BRIGHT + "Total amount to be paid: " + RESET + "$"  + total
        );        
    }

    public static void printModeStatement() {
        System.out.print(
            YELLOW_BRIGHT + "\nSelect an interest calculation mode:\n" + RESET // "\n" is new line
            + "(1) " + PURPLE + "Flat Interest\n" + RESET
            + "(2) " + CYAN + "Compounding Interest Without Monthly Payments\n" + RESET
            + "(3) " + BLUE_BRIGHT + "Compounding Interest With Monthly Payments\n" + RESET
        );
    }
}

/*
    Check:
    $10000
    10 years
    3.5%
    interest(2) = $4183
    interest(3) = $1842
*/