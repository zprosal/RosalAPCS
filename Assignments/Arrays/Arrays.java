class Arrays {
    public static void main(String[] args) {
    // 1. 
        // int[] numArray = {20, 3, 6, 10, 13, 25, 100, 6, 3, 20, 5102};

        // System.out.println( numArray[3] ); //6 (actually 10)

        // // System.out.println( numArray[11] );//5102 (actually broken)

        // System.out.println( numArray[1] ); //20 (actually 3)

        // System.out.println( numArray[7] ); //100 (actually 6)

        // System.out.println( numArray[8] ); //6 (actually 3)
    // 2.
        // System.out.println( numArray[4]);
        // System.out.println( numArray[1]);
        // System.out.println( numArray[10]);
        // System.out.println( numArray[5]);
        // System.out.println( numArray[0]);
    // 3.
        int[] fibonacci = {1, 1, 2, 3, 0, 8, 13, 0, 34, 0};
        fibonacci[4] = fibonacci[2] + fibonacci[3];
        System.out.println(fibonacci[4]);
        fibonacci[7] = fibonacci[5] + fibonacci[6];
        System.out.println(fibonacci[7]);
        fibonacci[9] = fibonacci[7] + fibonacci[8];
        System.out.println(fibonacci[9]);                
    }
}