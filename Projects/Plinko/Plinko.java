import java.util.Scanner;

class Plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;

    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};

    public static int mode = -1;
    public static int slot = -1;
    public static int count = -1;
    public static int position = -1;
    public static int finalPosition = -1;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

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
                    position = slot * 2;
                    printEvenRow(position);    
                    for(int i = 1; i < 13; i++) {
                        if(position == 0) {
                            position++;
                        }
                        else if(position == 16) {
                            position--;
                        }
                        else if(Math.random() > .5) {
                                position++; //Shift Right
                            } else {
                                position--; //Shift Left
                            }
                        if(isEven(i)) {
                            printEvenRow(position);
                        } else {
                            printOddRow(position);
                        }
                    }
                    finalPosition = position / 2;
                    System.out.println(
                        "\nYour disk landed in position " + finalPosition + 
                        " and you won " + VALUES[finalPosition] + " points.");
                }

                else if(mode == MULTI_DISC) {                    
                    collectSlotInput();
                    collectDiscCount();
                    int[] results = new int[9];
                    for(int n = 0; n < count; n++) {
                        position = slot * 2;
                        for(int i = 1; i < 13; i++) {
                            if(position == 0) {
                                position++;
                            }
                            if(position == 16) {
                                position--;
                            }
                            if(0 < position && position < 16) {
                                if(Math.random() > .5) {
                                    position++; //Shift Right
                                } else {
                                    position--; //Shift Left
                                }
                            }                            
                        }
                        results[position/2]++;    
                                  
                    }         
                    int total = 0;
                    for(int t = 0; t < 9; t++) {
                        total += results[t] * VALUES[t];
                    }
                    
                    System.out.println(
                        "\nDiscs in position 0: " + results[0] + "\n" +
                        "Discs in position 1: " + results[1] + "\n" +
                        "Discs in position 2: " + results[2] + "\n" +
                        "Discs in position 3: " + results[3] + "\n" +
                        "Discs in position 4: " + results[4] + "\n" +
                        "Discs in position 5: " + results[5] + "\n" +
                        "Discs in position 6: " + results[6] + "\n" +
                        "Discs in position 7: " + results[7] + "\n" +
                        "Discs in position 8: " + results[8] + "\n" +
                        "You won " + ANSI_GREEN + total + ANSI_RESET + " points!\n"
                        );  
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

    public static void printOddRow(int position) {      
        //Print the visualization of the row if it's single disc mode.
        for(int i = 0; i <= 16; i++) {
            if(position == i) {
                System.out.print(ANSI_CYAN + "O" + ANSI_RESET);
            }
            else if(isEven(i)) {
                System.out.print(ANSI_RED + "." + ANSI_RESET);
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");        
    }

    public static void printEvenRow(int position) {               
        //Print the visualization of the row if it's single disc mode.
        for(int i = 0; i <= 16; i++) {
            if(position == i) {
                System.out.print(ANSI_CYAN + "O" + ANSI_RESET);
            }
            else if(isEven(i)) {
                System.out.print(" ");
            }
            else {
                System.out.print(ANSI_RED + "." + ANSI_RESET);
            }
        }
        System.out.print("\n");
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