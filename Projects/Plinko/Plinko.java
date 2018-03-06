import java.util.Scanner;

class Plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;

    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};

    public static int mode = -1;
    public static int slot = -1;
    public static int count = -1;

    public static void main(String[] args) {
        Scanner scan1;        
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan1 = new Scanner(System.in);
            printModeStatement();
            if(scan1.hasNextInt()) {
                mode = scan1.nextInt();
                if(mode == SINGLE_DISC) {  
                    collectSlotInput();   
                    // for(int i = 1, i < 12, i++) {

                    // }
                    System.out.println("Mode not yet fully implemented");
                }
                else if(mode == MULTI_DISC) {                    
                    collectSlotInput();
                    collectDiscCount();
                    
                    System.out.println("Mode not yet fully implemented");
                }
                else if(mode == TERMINATE) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;
                }
            }
        }
    }
    
    public static void collectSlotInput() {
        Scanner scan2;
        while(true) {
            scan2 = new Scanner(System.in);
            System.out.print("Pick a slot to drop the disc(s) (0-8): ");
            if(scan2.hasNextInt()) { 
                slot = scan2.nextInt();
                if(-1 < slot && slot < 9) {                    
                    break; 
                }
            }
        }
    }

    public static void collectDiscCount() {
        Scanner scan4;
        while(true) {
            scan4 = new Scanner(System.in);
            System.out.print("Enter number of discs to drop: ");
            if(scan4.hasNextInt()) { 
                count = scan4.nextInt();
                if(count > 0) { 
                    break; 
                }
            }
        }
    }
    public static int runOddRow(int position) {
        
        
        //Modify the position.
        //Print the visualization of the row if it's single disc mode.

        return position;
    }

    public static int runEvenRow(int position) {               
        //Modify the position.
        //Print the visualization of the row if it's single disc mode.

        return position;
    }

    public static Boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Single disc\n"
            + "\t(2) Multiple discs\n"
            + "\t(3) Quit\n"
        );
    }
}