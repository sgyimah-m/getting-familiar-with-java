import java.util.Arrays;
public class binarysm {
    public static void main(String args[])
    {
        char characters[] = { 'a', 'b', 'c', 'd', 'e' };

        
        System.out.println(Arrays.binarySearch( characters, 'a'));
        System.out.println(Arrays.binarySearch(characters, 'd'));
    }
}