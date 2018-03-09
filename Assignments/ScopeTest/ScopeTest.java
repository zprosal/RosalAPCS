class ScopeTest {
    // 1.
        // public static String message = "Hello";

        // public static void main(String args[]) {
        //     int i = 0;
        //     int n = 0;
        //     while(i <= 10) {
        //         n = i * 2;
        //         System.out.println(n);
        //         i++;
        //     }

        //     if(n > 10) {
        //         String message = "Hello World";
        //         System.out.println(message);
        //     }

        //     Boolean shouldLoop = true;
        //     i = 0;
        //     while(shouldLoop) {
        //         if(i < 10) {
        //             System.out.println(message);                    
        //         } else {
        //             shouldLoop = false;
        //         }
        //         i++;
        //     }
        
    // 2.
            // String message = "Hello World";
            // int i;
            // for(i = 0; i < message.length(); i++) {
            //     if(message.charAt(i) == 'W') {
            //         break;
            //     }
            // }
            // System.out.println("W found at index " + i);
    // 3.            
        public static final int n = 32;
        public static int base = 2;

        public static void main(String[] args) {
            for(int i = 0; i <= n; i++) {
                System.out.println(power(i));
            }
        }

        public static int power(int power) {
            int result = 1;
            for(int  i = 0; i < power; i++) {
                result *= base;
            }
            return result;
        }        
    //     }
    }