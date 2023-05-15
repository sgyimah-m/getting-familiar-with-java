import java.util.Scanner;
class bubblesort { public static void
    main(String [] args) { int n, c, d, swap; 
        Scanner in = new Scanner(System.in);
        System.out.println("Input numbers of integers to sort");
        n = in.nextInt(); int array[] = new int[n];
        System.out.println("Enter" + n + "integers");
        for (c = 0; c < n; c++) array[c] = in.nextInt();
        for (c = 0; c < (n - 1); c++) {
            for (d = 0; d < n - c - 1; d++) {
                if (array[d]) > array[d+1]
            }
        }

    }
    
}
