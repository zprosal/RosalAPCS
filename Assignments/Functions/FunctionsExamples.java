 class FunctionsExamples
    {  
        public static void main(String args[]) {
        // int x = 11;

        // if( isEven(x) ) {
        //     System.out.println("X is Even.");
        //     }
        // else {
        //     System.out.println("X is Odd.");
        //     }
        int a = 2;
        int b = 4;
        int c = 7;
        int d = 8;
        int e = 10;

        if(isEven(a) && isEven(b) && isEven(c) && isEven(d) && isEven(e)) {
            System.out.println("All of the integers are even.");
        }
        else {
            System.out.println("At least one of the integers is odd.");        
        }

        }
        public static Boolean isEven(int x) {
        return x % 2 == 0;
        }
    }