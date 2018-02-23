class Loops2 {
    public static void main(String[] args) {
// 1.
    // print multiples of 2 starting with 0
        // for(int i = 0; i <= 100; i += 2) {
        //     System.out.println(i);
        // }            
    // prints multiples of 3 starting with 0 and tells if it is even or odd
        for(int i = 0; i <= 100; i += 3) {
            if(i % 2 == 0) {
                System.out.println(i + " is an even number");
            }
            else {
                System.out.println(i + " is an odd number");            
            }
        }        
    }
}