import java.util.Scanner;
class armstrong {
    public static void main(String args[]) {
        int n, sum =0, temp, remainder, digits = 0;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println ("Input a number to check if its an Armstrong number");
            n = in.nextInt();
        }
        temp = n;
        while (temp != 0) {
            digits++;
            temp = temp/10;
            
        }
        temp = n;
        while (temp != 0) {
            remainder = temp;
            sum = sum + power(remainder, digits);
            temp = temp/10;
        }
        if (n == sum)
        System.out.println(n + " is an Armstrong number. ");
        else
        System.out.println(n + " is not an Armstrong number. ");
    }    
    static int power(int n, int r){
        int c, p = 1; 
        for (c = 1; c <= r;)
        return p;
        return p = p*n;
    }
    
}

