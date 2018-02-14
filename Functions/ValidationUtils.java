import java.util.Scanner;

class ValidationUtils {
    public static void main(String args[]) {
        // String
        System.out.print("Enter a string: ");
        Scanner scan1 = new Scanner(System.in);
        if(isValidString(scan1)) {
            System.out.println("String Success!");
        }
        else {
            System.out.println("String Failure!");
        }
        // Integer
        System.out.print("Enter a number (decimals not allowed): ");
        Scanner scan2 = new Scanner(System.in);
        if(isValidInt(scan2)) {
            System.out.println("Integer Success!");
        }
        else {
            System.out.println("Integer Failure!");
        }
        // Double
        System.out.print("Enter a number (decimals allowed): ");
        Scanner scan3 = new Scanner(System.in);
        if(isValidDouble(scan3)) {
            System.out.println("Double Success!");
        }
        else {
            System.out.println("Double Failure!");
        }
        // Boolean
        System.out.print("Enter a Boolean(T,F,true,false): ");
        Scanner scan4 = new Scanner(System.in);
        if(isValidBoolean(scan4)) {
            System.out.println("Boolean Success!");
        }
        else {
            System.out.println("Boolean Failure!");
        }
    }

    
    public static Boolean isValidString(Scanner scan1) {
        try {
            String s = scan1.nextLine();
        }
        catch(Exception e) {
            return false; //An error was raised. The user input could not be read as a String.
        }
        return true; //No error was raised. The scanner read it successfully as a String.
    }

    public static Boolean isValidInt(Scanner scan2) {
        try {
            int x = scan2.nextInt();
        }
        catch(Exception e) {
            return false;
        }
        return true;
    }

    public static Boolean isValidDouble(Scanner scan3) {
        try {
            double y = scan3.nextDouble();
        }
        catch(Exception e) {
            return false;
        }
        return true;
    }

    public static Boolean isValidBoolean(Scanner scan4) {
            String b = scan4.nextLine().toLowerCase();
        if (b.equals("t") ||
            b.equals("f") ||
            b.equals("true") ||
            b.equals("false"))
            {
            return true;
            }
        else {
            return false;
            }
        
        
        }

}