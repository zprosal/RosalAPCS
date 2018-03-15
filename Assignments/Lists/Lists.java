import java.util.Scanner;
import java.util.*;

class Lists {

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

    public static final int ADD = 1;
    public static final int REMOVE = 2;
    public static final int QUIT = 3;

    public static int action = -1; 
    public static String newItem = "";
    public static int removePosition = -1;

    public static void main(String[] args) {
    // 1.
        // ArrayList<Integer> numList = new ArrayList<Integer>();

        // numList.add(5);
        // numList.add(0,10);
        // numList.add(1,15);
        // numList.remove(1);
        // numList.add(20);
        // numList.add(1,25);
        // numList.add(0, 30);
        // numList.add(3, 35);
        // numList.remove(2);

        //Expected Contents: {30, 10, 35, 5, 20}

    // 2.
        ArrayList<String> ToDoList = new ArrayList<String>();

        Scanner scan1;
        while(true) {
            System.out.println(CYAN + "To-Do List:" + RESET);
            scan1 = new Scanner(System.in);
            for(int i = 0; i < ToDoList.size(); i++) {
                System.out.println("[" + i + "] " + ToDoList.get(i));
            }
            System.out.print(
                CYAN_BRIGHT + "\nSelect an action:\n" + RESET
                + "\t(1) " + PURPLE + "Add item\n" + RESET
                + "\t(2) " + YELLOW + "Remove item\n" + RESET
                + "\t(3) " + RED + "Quit\n" + RESET
                );
            if(scan1.hasNextInt()) {
                action = scan1.nextInt();
                if(action == ADD) {
                    Scanner scan2;
                    while(true) {
                        scan2 = new Scanner(System.in);
                        System.out.print(PURPLE_BRIGHT + "\nAdd an item: " + RESET);
                        newItem = scan2.nextLine();
                        ToDoList.add(newItem);
                        break;
                    }
                }
                else if(action == REMOVE) {
                    Scanner scan3;
                    while(true) {
                        scan3 = new Scanner(System.in);
                        System.out.print(YELLOW_BRIGHT + "\nChoose which item to remove: " + RESET);  
                        if(scan3.hasNextInt()) {
                            removePosition = scan3.nextInt();
                            if(-1 < removePosition && removePosition < ToDoList.size()) {
                                ToDoList.remove(removePosition);
                                break;
                            }
                        }
                    }
                }
                else if(action == QUIT) {
                    System.out.println(RED + "Goodbye" + RESET);
                    break;
                } else {
                    continue;
                }
            }
        }
    } 
}