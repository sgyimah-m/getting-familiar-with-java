import java.util.Scanner;
 class OddorEven {
    public static void main (String args [] ) {
        System.out.println("Enter an integer to check if it is odd or even");
        try (Scanner in = new Scanner(System.in)) {
            x = in.nextInt();
        }
        if ( x % 2 == 0 )
        System.out.println("You entered an even number.");
        else 
        System.out.println("You entered an odd number. ");
    }

    static int x;
    
}
