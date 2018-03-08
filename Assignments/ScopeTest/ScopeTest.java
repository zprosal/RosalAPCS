class ScopeTest {
        public static String message = "Hello";
        public static Boolean shouldLoop = false;

        public static void main(String args[]) {
            int i = 1;

            while(i <= 10) {
                int n = i * 2;
                System.out.println(n);
                i++;
            }
            int n = i * 2;
            if(n > 10) {
                String message = "Hello World";
                System.out.println(message);
            }

            shouldLoop = true;
            i = 0;
            while(shouldLoop) {
                if(i < 10) {
                    System.out.println(message);                    
                } else {
                    shouldLoop = false;
                }
                i++;
            }
        }
    }